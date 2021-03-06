// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: debug.proto

package com.alibaba.maxgraph.proto;

public interface StoreTestEdgeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:StoreTestEdge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 edge_id = 1;</code>
   */
  long getEdgeId();

  /**
   * <code>optional int64 src_id = 2;</code>
   */
  long getSrcId();

  /**
   * <code>optional int64 dst_id = 3;</code>
   */
  long getDstId();

  /**
   * <code>optional int32 label = 4;</code>
   */
  int getLabel();

  /**
   * <code>optional int32 src_label = 5;</code>
   */
  int getSrcLabel();

  /**
   * <code>optional int32 dst_label = 6;</code>
   */
  int getDstLabel();

  /**
   * <code>repeated .StoreTestProperty properies = 7;</code>
   */
  java.util.List<com.alibaba.maxgraph.proto.StoreTestProperty> 
      getProperiesList();
  /**
   * <code>repeated .StoreTestProperty properies = 7;</code>
   */
  com.alibaba.maxgraph.proto.StoreTestProperty getProperies(int index);
  /**
   * <code>repeated .StoreTestProperty properies = 7;</code>
   */
  int getProperiesCount();
  /**
   * <code>repeated .StoreTestProperty properies = 7;</code>
   */
  java.util.List<? extends com.alibaba.maxgraph.proto.StoreTestPropertyOrBuilder> 
      getProperiesOrBuilderList();
  /**
   * <code>repeated .StoreTestProperty properies = 7;</code>
   */
  com.alibaba.maxgraph.proto.StoreTestPropertyOrBuilder getProperiesOrBuilder(
      int index);
}
