package elastest.epm.adapter.docker.generated;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

public interface RuntimeMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RuntimeMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string resource_id = 1;</code>
   */
  String getResourceId();
  /**
   * <code>optional string resource_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <code>repeated string property = 2;</code>
   */
  java.util.List<String>
      getPropertyList();
  /**
   * <code>repeated string property = 2;</code>
   */
  int getPropertyCount();
  /**
   * <code>repeated string property = 2;</code>
   */
  String getProperty(int index);
  /**
   * <code>repeated string property = 2;</code>
   */
  com.google.protobuf.ByteString
      getPropertyBytes(int index);

  /**
   * <code>optional bytes file = 3;</code>
   */
  com.google.protobuf.ByteString getFile();

  /**
   * <code>optional .PoP pop = 4;</code>
   */
  boolean hasPop();
  /**
   * <code>optional .PoP pop = 4;</code>
   */
  PoP getPop();
  /**
   * <code>optional .PoP pop = 4;</code>
   */
  PoPOrBuilder getPopOrBuilder();
}