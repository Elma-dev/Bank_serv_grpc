package ma.elma_dev.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bankServices.proto")
public final class bankServicesGrpc {

  private bankServicesGrpc() {}

  public static final String SERVICE_NAME = "bankServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = ma.elma_dev.stubs.BankServices.messageReq.class,
      responseType = ma.elma_dev.stubs.BankServices.messageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getConvertMethod() {
    io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp> getConvertMethod;
    if ((getConvertMethod = bankServicesGrpc.getConvertMethod) == null) {
      synchronized (bankServicesGrpc.class) {
        if ((getConvertMethod = bankServicesGrpc.getConvertMethod) == null) {
          bankServicesGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bankServices", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageResp.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServicesMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getGetCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrencyStream",
      requestType = ma.elma_dev.stubs.BankServices.messageReq.class,
      responseType = ma.elma_dev.stubs.BankServices.messageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getGetCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp> getGetCurrencyStreamMethod;
    if ((getGetCurrencyStreamMethod = bankServicesGrpc.getGetCurrencyStreamMethod) == null) {
      synchronized (bankServicesGrpc.class) {
        if ((getGetCurrencyStreamMethod = bankServicesGrpc.getGetCurrencyStreamMethod) == null) {
          bankServicesGrpc.getGetCurrencyStreamMethod = getGetCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bankServices", "getCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageResp.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServicesMethodDescriptorSupplier("getCurrencyStream"))
                  .build();
          }
        }
     }
     return getGetCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getPerfomCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "perfomCurrencyStream",
      requestType = ma.elma_dev.stubs.BankServices.messageReq.class,
      responseType = ma.elma_dev.stubs.BankServices.messageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getPerfomCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp> getPerfomCurrencyStreamMethod;
    if ((getPerfomCurrencyStreamMethod = bankServicesGrpc.getPerfomCurrencyStreamMethod) == null) {
      synchronized (bankServicesGrpc.class) {
        if ((getPerfomCurrencyStreamMethod = bankServicesGrpc.getPerfomCurrencyStreamMethod) == null) {
          bankServicesGrpc.getPerfomCurrencyStreamMethod = getPerfomCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bankServices", "perfomCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageResp.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServicesMethodDescriptorSupplier("perfomCurrencyStream"))
                  .build();
          }
        }
     }
     return getPerfomCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getFullCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullCurrencyStream",
      requestType = ma.elma_dev.stubs.BankServices.messageReq.class,
      responseType = ma.elma_dev.stubs.BankServices.messageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq,
      ma.elma_dev.stubs.BankServices.messageResp> getFullCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp> getFullCurrencyStreamMethod;
    if ((getFullCurrencyStreamMethod = bankServicesGrpc.getFullCurrencyStreamMethod) == null) {
      synchronized (bankServicesGrpc.class) {
        if ((getFullCurrencyStreamMethod = bankServicesGrpc.getFullCurrencyStreamMethod) == null) {
          bankServicesGrpc.getFullCurrencyStreamMethod = getFullCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<ma.elma_dev.stubs.BankServices.messageReq, ma.elma_dev.stubs.BankServices.messageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bankServices", "fullCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.elma_dev.stubs.BankServices.messageResp.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServicesMethodDescriptorSupplier("fullCurrencyStream"))
                  .build();
          }
        }
     }
     return getFullCurrencyStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bankServicesStub newStub(io.grpc.Channel channel) {
    return new bankServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bankServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bankServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bankServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bankServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class bankServicesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary module
     * </pre>
     */
    public void convert(ma.elma_dev.stubs.BankServices.messageReq request,
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream module
     * </pre>
     */
    public void getCurrencyStream(ma.elma_dev.stubs.BankServices.messageReq request,
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrencyStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *sclient stream module
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageReq> perfomCurrencyStream(
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerfomCurrencyStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bi_Directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageReq> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullCurrencyStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.elma_dev.stubs.BankServices.messageReq,
                ma.elma_dev.stubs.BankServices.messageResp>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrencyStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.elma_dev.stubs.BankServices.messageReq,
                ma.elma_dev.stubs.BankServices.messageResp>(
                  this, METHODID_GET_CURRENCY_STREAM)))
          .addMethod(
            getPerfomCurrencyStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.elma_dev.stubs.BankServices.messageReq,
                ma.elma_dev.stubs.BankServices.messageResp>(
                  this, METHODID_PERFOM_CURRENCY_STREAM)))
          .addMethod(
            getFullCurrencyStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.elma_dev.stubs.BankServices.messageReq,
                ma.elma_dev.stubs.BankServices.messageResp>(
                  this, METHODID_FULL_CURRENCY_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class bankServicesStub extends io.grpc.stub.AbstractStub<bankServicesStub> {
    private bankServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary module
     * </pre>
     */
    public void convert(ma.elma_dev.stubs.BankServices.messageReq request,
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server stream module
     * </pre>
     */
    public void getCurrencyStream(ma.elma_dev.stubs.BankServices.messageReq request,
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrencyStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *sclient stream module
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageReq> perfomCurrencyStream(
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerfomCurrencyStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Bi_Directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageReq> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrencyStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class bankServicesBlockingStub extends io.grpc.stub.AbstractStub<bankServicesBlockingStub> {
    private bankServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary module
     * </pre>
     */
    public ma.elma_dev.stubs.BankServices.messageResp convert(ma.elma_dev.stubs.BankServices.messageReq request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream module
     * </pre>
     */
    public java.util.Iterator<ma.elma_dev.stubs.BankServices.messageResp> getCurrencyStream(
        ma.elma_dev.stubs.BankServices.messageReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrencyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bankServicesFutureStub extends io.grpc.stub.AbstractStub<bankServicesFutureStub> {
    private bankServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.elma_dev.stubs.BankServices.messageResp> convert(
        ma.elma_dev.stubs.BankServices.messageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENCY_STREAM = 1;
  private static final int METHODID_PERFOM_CURRENCY_STREAM = 2;
  private static final int METHODID_FULL_CURRENCY_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bankServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bankServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((ma.elma_dev.stubs.BankServices.messageReq) request,
              (io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp>) responseObserver);
          break;
        case METHODID_GET_CURRENCY_STREAM:
          serviceImpl.getCurrencyStream((ma.elma_dev.stubs.BankServices.messageReq) request,
              (io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFOM_CURRENCY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.perfomCurrencyStream(
              (io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp>) responseObserver);
        case METHODID_FULL_CURRENCY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrencyStream(
              (io.grpc.stub.StreamObserver<ma.elma_dev.stubs.BankServices.messageResp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class bankServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bankServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.elma_dev.stubs.BankServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bankServices");
    }
  }

  private static final class bankServicesFileDescriptorSupplier
      extends bankServicesBaseDescriptorSupplier {
    bankServicesFileDescriptorSupplier() {}
  }

  private static final class bankServicesMethodDescriptorSupplier
      extends bankServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bankServicesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (bankServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bankServicesFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrencyStreamMethod())
              .addMethod(getPerfomCurrencyStreamMethod())
              .addMethod(getFullCurrencyStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
