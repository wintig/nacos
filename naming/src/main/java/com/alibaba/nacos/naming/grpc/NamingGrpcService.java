// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: naming_grpc_service.proto

package com.alibaba.nacos.naming.grpc;

public final class NamingGrpcService {
  private NamingGrpcService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Instance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031naming_grpc_service.proto\032\027base_grpc_s" +
      "ervice.proto\"\n\n\010Instance2\220\001\n\rNamingServi" +
      "ce\022*\n\020registerInstance\022\t.Instance\032\t.Resp" +
      "onse\"\000\022,\n\022deregisterInstance\022\t.Instance\032" +
      "\t.Response\"\000\022%\n\016queryInstances\022\006.Query\032\t" +
      ".Resource\"\000B!\n\035com.alibaba.nacos.naming." +
      "grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alibaba.nacos.core.remoting.grpc.BaseGrpcService.getDescriptor(),
        });
    internal_static_Instance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Instance_descriptor,
        new java.lang.String[] { });
    com.alibaba.nacos.core.remoting.grpc.BaseGrpcService.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
