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

}
