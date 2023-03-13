package ma.elma_dev.services;

import io.grpc.stub.StreamObserver;
import ma.elma_dev.stubs.BankServices;
import ma.elma_dev.stubs.bankServicesGrpc;

public class BankSercvices extends bankServicesGrpc.bankServicesImplBase {
    @Override
    public void convert(BankServices.messageReq request, StreamObserver<BankServices.messageResp> responseObserver) {
        String messageFrom=request.getMessageFrom();
        String messageTo=request.getMessageTo();
        double amount=request.getAmount();

        BankServices.messageResp response= BankServices.messageResp.newBuilder().
                setMessageFrom(messageFrom).setMessgaeTo(messageTo).setAmount(amount).setResult(amount*11.30)
        .build();
    }
}
