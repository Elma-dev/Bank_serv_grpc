package ma.elma_dev.server;

import io.grpc.ServerBuilder;
import ma.elma_dev.services.BankSercvices;

import java.io.IOException;

public class bankServer {
    public static void main(String[] args) throws Exception {
        //build a server with a bank services in localhost port 2001
        ServerBuilder.forPort(2001).addService(new BankSercvices()).build().start().awaitTermination();

    }
}
