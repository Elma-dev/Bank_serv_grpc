package ma.elma_dev.services;

import io.grpc.stub.StreamObserver;
import ma.elma_dev.stubs.BankServices;
import ma.elma_dev.stubs.bankServicesGrpc;
import org.checkerframework.checker.units.qual.Time;

import java.util.Timer;
import java.util.TimerTask;

public class BankSercvices extends bankServicesGrpc.bankServicesImplBase {
    @Override
    public void convert(BankServices.messageReq request, StreamObserver<BankServices.messageResp> responseObserver) {
        String messageFrom=request.getMessageFrom();
        String messageTo=request.getMessageTo();
        double amount=request.getAmount();

        BankServices.messageResp response= BankServices.messageResp.newBuilder().
                setMessageFrom(messageFrom).setMessgaeTo(messageTo).setAmount(amount).setResult(amount*11.30)
        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrencyStream(BankServices.messageReq request, StreamObserver<BankServices.messageResp> responseObserver) {
        String messageFrom = request.getMessageFrom();
        String messageTo = request.getMessageTo();
        double amount = request.getAmount();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int counter=0;
            @Override
            public void run() {
                BankServices.messageResp messageResp = BankServices.messageResp.newBuilder().
                        setMessageFrom(messageFrom).setMessgaeTo(messageTo).setAmount(amount).setResult(amount * Math.random() * 10).build();
                responseObserver.onNext(messageResp);
                if(counter++ ==20){
                    responseObserver.onCompleted();
                    timer.cancel();
                }
                counter++;
            }
        },1000,1000);

    }

    @Override
    public StreamObserver<BankServices.messageReq> perfomCurrencyStream(StreamObserver<BankServices.messageResp> responseObserver) {
        return new StreamObserver<BankServices.messageReq>() {
            double sum=0;
            @Override
            public void onNext(BankServices.messageReq messageReq) {
                System.out.println(messageReq.getAmount());
                sum+=messageReq.getAmount();

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                BankServices.messageResp resp = BankServices.messageResp.newBuilder()
                        .setResult(sum*11.30).build();
                responseObserver.onNext(resp);
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    public StreamObserver<BankServices.messageReq> fullCurrencyStream(StreamObserver<BankServices.messageResp> responseObserver) {
        return  new StreamObserver<BankServices.messageReq>() {
            @Override
            public void onNext(BankServices.messageReq messageReq) {
                System.out.println(messageReq.toString());
                BankServices.messageResp resp = BankServices.messageResp.newBuilder().setResult(messageReq.getAmount() * 11.30).build();
                responseObserver.onNext(resp);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
