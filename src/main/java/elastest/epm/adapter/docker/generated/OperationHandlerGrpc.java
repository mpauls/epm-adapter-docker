package elastest.epm.adapter.docker.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: client.proto")
public final class OperationHandlerGrpc {

  private OperationHandlerGrpc() {}

  public static final String SERVICE_NAME = "OperationHandler";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<FileMessage,
      ResourceGroupProto> METHOD_CREATE =
      io.grpc.MethodDescriptor.<FileMessage, ResourceGroupProto>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "Create"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              FileMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResourceGroupProto.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<TerminateMessage,
      Empty> METHOD_REMOVE =
      io.grpc.MethodDescriptor.<TerminateMessage, Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "Remove"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              TerminateMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ResourceIdentifier,
      Empty> METHOD_STOP =
      io.grpc.MethodDescriptor.<ResourceIdentifier, Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "Stop"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResourceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ResourceIdentifier,
      StringResponse> METHOD_CHECK_IF_RESOURCE_EXISTS =
      io.grpc.MethodDescriptor.<ResourceIdentifier, StringResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "CheckIfResourceExists"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResourceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              StringResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ResourceIdentifier,
      StringResponse> METHOD_CHECK_IF_RESOURCE_RUNNING =
      io.grpc.MethodDescriptor.<ResourceIdentifier, StringResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "CheckIfResourceRunning"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResourceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              StringResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ResourceIdentifier,
      Empty> METHOD_START =
      io.grpc.MethodDescriptor.<ResourceIdentifier, Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "Start"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ResourceIdentifier.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RuntimeMessage,
      StringResponse> METHOD_EXECUTE_COMMAND =
      io.grpc.MethodDescriptor.<RuntimeMessage, StringResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "ExecuteCommand"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RuntimeMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              StringResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RuntimeMessage,
      FileMessage> METHOD_DOWNLOAD_FILE =
      io.grpc.MethodDescriptor.<RuntimeMessage, FileMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "DownloadFile"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RuntimeMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              FileMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<RuntimeMessage,
      Empty> METHOD_UPLOAD_FILE =
      io.grpc.MethodDescriptor.<RuntimeMessage, Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "UploadFile"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              RuntimeMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<Empty,
      Status> METHOD_CHECK_STATUS =
      io.grpc.MethodDescriptor.<Empty, Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "OperationHandler", "CheckStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Status.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationHandlerStub newStub(io.grpc.Channel channel) {
    return new OperationHandlerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationHandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OperationHandlerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationHandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OperationHandlerFutureStub(channel);
  }

  /**
   */
  public static abstract class OperationHandlerImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(FileMessage request,
        io.grpc.stub.StreamObserver<ResourceGroupProto> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void remove(TerminateMessage request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE, responseObserver);
    }

    /**
     */
    public void stop(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STOP, responseObserver);
    }

    /**
     */
    public void checkIfResourceExists(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_IF_RESOURCE_EXISTS, responseObserver);
    }

    /**
     */
    public void checkIfResourceRunning(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_IF_RESOURCE_RUNNING, responseObserver);
    }

    /**
     */
    public void start(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START, responseObserver);
    }

    /**
     */
    public void executeCommand(RuntimeMessage request,
        io.grpc.stub.StreamObserver<StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_COMMAND, responseObserver);
    }

    /**
     */
    public void downloadFile(RuntimeMessage request,
        io.grpc.stub.StreamObserver<FileMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DOWNLOAD_FILE, responseObserver);
    }

    /**
     */
    public void uploadFile(RuntimeMessage request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLOAD_FILE, responseObserver);
    }

    /**
     */
    public void checkStatus(Empty request,
        io.grpc.stub.StreamObserver<Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_STATUS, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                FileMessage,
                ResourceGroupProto>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_REMOVE,
            asyncUnaryCall(
              new MethodHandlers<
                TerminateMessage,
                Empty>(
                  this, METHODID_REMOVE)))
          .addMethod(
            METHOD_STOP,
            asyncUnaryCall(
              new MethodHandlers<
                ResourceIdentifier,
                Empty>(
                  this, METHODID_STOP)))
          .addMethod(
            METHOD_CHECK_IF_RESOURCE_EXISTS,
            asyncUnaryCall(
              new MethodHandlers<
                ResourceIdentifier,
                StringResponse>(
                  this, METHODID_CHECK_IF_RESOURCE_EXISTS)))
          .addMethod(
            METHOD_CHECK_IF_RESOURCE_RUNNING,
            asyncUnaryCall(
              new MethodHandlers<
                ResourceIdentifier,
                StringResponse>(
                  this, METHODID_CHECK_IF_RESOURCE_RUNNING)))
          .addMethod(
            METHOD_START,
            asyncUnaryCall(
              new MethodHandlers<
                ResourceIdentifier,
                Empty>(
                  this, METHODID_START)))
          .addMethod(
            METHOD_EXECUTE_COMMAND,
            asyncUnaryCall(
              new MethodHandlers<
                RuntimeMessage,
                StringResponse>(
                  this, METHODID_EXECUTE_COMMAND)))
          .addMethod(
            METHOD_DOWNLOAD_FILE,
            asyncUnaryCall(
              new MethodHandlers<
                RuntimeMessage,
                FileMessage>(
                  this, METHODID_DOWNLOAD_FILE)))
          .addMethod(
            METHOD_UPLOAD_FILE,
            asyncUnaryCall(
              new MethodHandlers<
                RuntimeMessage,
                Empty>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            METHOD_CHECK_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                Empty,
                Status>(
                  this, METHODID_CHECK_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class OperationHandlerStub extends io.grpc.stub.AbstractStub<OperationHandlerStub> {
    private OperationHandlerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationHandlerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected OperationHandlerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationHandlerStub(channel, callOptions);
    }

    /**
     */
    public void create(FileMessage request,
        io.grpc.stub.StreamObserver<ResourceGroupProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remove(TerminateMessage request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stop(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STOP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkIfResourceExists(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_IF_RESOURCE_EXISTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkIfResourceRunning(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_IF_RESOURCE_RUNNING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void start(ResourceIdentifier request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeCommand(RuntimeMessage request,
        io.grpc.stub.StreamObserver<StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_COMMAND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadFile(RuntimeMessage request,
        io.grpc.stub.StreamObserver<FileMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DOWNLOAD_FILE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadFile(RuntimeMessage request,
        io.grpc.stub.StreamObserver<Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_FILE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkStatus(Empty request,
        io.grpc.stub.StreamObserver<Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OperationHandlerBlockingStub extends io.grpc.stub.AbstractStub<OperationHandlerBlockingStub> {
    private OperationHandlerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationHandlerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected OperationHandlerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationHandlerBlockingStub(channel, callOptions);
    }

    /**
     */
    public ResourceGroupProto create(FileMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public Empty remove(TerminateMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE, getCallOptions(), request);
    }

    /**
     */
    public Empty stop(ResourceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STOP, getCallOptions(), request);
    }

    /**
     */
    public StringResponse checkIfResourceExists(ResourceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_IF_RESOURCE_EXISTS, getCallOptions(), request);
    }

    /**
     */
    public StringResponse checkIfResourceRunning(ResourceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_IF_RESOURCE_RUNNING, getCallOptions(), request);
    }

    /**
     */
    public Empty start(ResourceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START, getCallOptions(), request);
    }

    /**
     */
    public StringResponse executeCommand(RuntimeMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE_COMMAND, getCallOptions(), request);
    }

    /**
     */
    public FileMessage downloadFile(RuntimeMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DOWNLOAD_FILE, getCallOptions(), request);
    }

    /**
     */
    public Empty uploadFile(RuntimeMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPLOAD_FILE, getCallOptions(), request);
    }

    /**
     */
    public Status checkStatus(Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_STATUS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OperationHandlerFutureStub extends io.grpc.stub.AbstractStub<OperationHandlerFutureStub> {
    private OperationHandlerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OperationHandlerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected OperationHandlerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OperationHandlerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ResourceGroupProto> create(
        FileMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Empty> remove(
        TerminateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Empty> stop(
        ResourceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STOP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StringResponse> checkIfResourceExists(
        ResourceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_IF_RESOURCE_EXISTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StringResponse> checkIfResourceRunning(
        ResourceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_IF_RESOURCE_RUNNING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Empty> start(
        ResourceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StringResponse> executeCommand(
        RuntimeMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_COMMAND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<FileMessage> downloadFile(
        RuntimeMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DOWNLOAD_FILE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Empty> uploadFile(
        RuntimeMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_FILE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Status> checkStatus(
        Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_REMOVE = 1;
  private static final int METHODID_STOP = 2;
  private static final int METHODID_CHECK_IF_RESOURCE_EXISTS = 3;
  private static final int METHODID_CHECK_IF_RESOURCE_RUNNING = 4;
  private static final int METHODID_START = 5;
  private static final int METHODID_EXECUTE_COMMAND = 6;
  private static final int METHODID_DOWNLOAD_FILE = 7;
  private static final int METHODID_UPLOAD_FILE = 8;
  private static final int METHODID_CHECK_STATUS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperationHandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OperationHandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((FileMessage) request,
              (io.grpc.stub.StreamObserver<ResourceGroupProto>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((TerminateMessage) request,
              (io.grpc.stub.StreamObserver<Empty>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((ResourceIdentifier) request,
              (io.grpc.stub.StreamObserver<Empty>) responseObserver);
          break;
        case METHODID_CHECK_IF_RESOURCE_EXISTS:
          serviceImpl.checkIfResourceExists((ResourceIdentifier) request,
              (io.grpc.stub.StreamObserver<StringResponse>) responseObserver);
          break;
        case METHODID_CHECK_IF_RESOURCE_RUNNING:
          serviceImpl.checkIfResourceRunning((ResourceIdentifier) request,
              (io.grpc.stub.StreamObserver<StringResponse>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((ResourceIdentifier) request,
              (io.grpc.stub.StreamObserver<Empty>) responseObserver);
          break;
        case METHODID_EXECUTE_COMMAND:
          serviceImpl.executeCommand((RuntimeMessage) request,
              (io.grpc.stub.StreamObserver<StringResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((RuntimeMessage) request,
              (io.grpc.stub.StreamObserver<FileMessage>) responseObserver);
          break;
        case METHODID_UPLOAD_FILE:
          serviceImpl.uploadFile((RuntimeMessage) request,
              (io.grpc.stub.StreamObserver<Empty>) responseObserver);
          break;
        case METHODID_CHECK_STATUS:
          serviceImpl.checkStatus((Empty) request,
              (io.grpc.stub.StreamObserver<Status>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class OperationHandlerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Client.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OperationHandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationHandlerDescriptorSupplier())
              .addMethod(METHOD_CREATE)
              .addMethod(METHOD_REMOVE)
              .addMethod(METHOD_STOP)
              .addMethod(METHOD_CHECK_IF_RESOURCE_EXISTS)
              .addMethod(METHOD_CHECK_IF_RESOURCE_RUNNING)
              .addMethod(METHOD_START)
              .addMethod(METHOD_EXECUTE_COMMAND)
              .addMethod(METHOD_DOWNLOAD_FILE)
              .addMethod(METHOD_UPLOAD_FILE)
              .addMethod(METHOD_CHECK_STATUS)
              .build();
        }
      }
    }
    return result;
  }
}
