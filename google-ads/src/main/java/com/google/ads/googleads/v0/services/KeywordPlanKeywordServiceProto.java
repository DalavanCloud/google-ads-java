// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/keyword_plan_keyword_service.proto

package com.google.ads.googleads.v0.services;

public final class KeywordPlanKeywordServiceProto {
  private KeywordPlanKeywordServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetKeywordPlanKeywordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetKeywordPlanKeywordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_KeywordPlanKeywordOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_KeywordPlanKeywordOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v0/services/keywo" +
      "rd_plan_keyword_service.proto\022 google.ad" +
      "s.googleads.v0.services\032<google/ads/goog" +
      "leads/v0/resources/keyword_plan_keyword." +
      "proto\032\034google/api/annotations.proto\032 goo" +
      "gle/protobuf/field_mask.proto\"5\n\034GetKeyw" +
      "ordPlanKeywordRequest\022\025\n\rresource_name\030\001" +
      " \001(\t\"\212\001\n MutateKeywordPlanKeywordsReques" +
      "t\022\023\n\013customer_id\030\001 \001(\t\022Q\n\noperations\030\002 \003" +
      "(\0132=.google.ads.googleads.v0.services.Ke" +
      "ywordPlanKeywordOperation\"\377\001\n\033KeywordPla" +
      "nKeywordOperation\022/\n\013update_mask\030\004 \001(\0132\032" +
      ".google.protobuf.FieldMask\022G\n\006create\030\001 \001" +
      "(\01325.google.ads.googleads.v0.resources.K" +
      "eywordPlanKeywordH\000\022G\n\006update\030\002 \001(\01325.go" +
      "ogle.ads.googleads.v0.resources.KeywordP" +
      "lanKeywordH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperat" +
      "ion\"v\n!MutateKeywordPlanKeywordsResponse" +
      "\022Q\n\007results\030\002 \003(\0132@.google.ads.googleads" +
      ".v0.services.MutateKeywordPlanKeywordRes" +
      "ult\"7\n\036MutateKeywordPlanKeywordResult\022\025\n" +
      "\rresource_name\030\001 \001(\t2\327\003\n\031KeywordPlanKeyw" +
      "ordService\022\315\001\n\025GetKeywordPlanKeyword\022>.g" +
      "oogle.ads.googleads.v0.services.GetKeywo" +
      "rdPlanKeywordRequest\0325.google.ads.google" +
      "ads.v0.resources.KeywordPlanKeyword\"=\202\323\344" +
      "\223\0027\0225/v0/{resource_name=customers/*/keyw" +
      "ordPlanKeywords/*}\022\351\001\n\031MutateKeywordPlan" +
      "Keywords\022B.google.ads.googleads.v0.servi" +
      "ces.MutateKeywordPlanKeywordsRequest\032C.g" +
      "oogle.ads.googleads.v0.services.MutateKe" +
      "ywordPlanKeywordsResponse\"C\202\323\344\223\002=\"8/v0/c" +
      "ustomers/{customer_id=*}/keywordPlanKeyw" +
      "ords:mutate:\001*B\336\001\n$com.google.ads.google" +
      "ads.v0.servicesB\036KeywordPlanKeywordServi" +
      "ceProtoP\001ZHgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v0/services;servi" +
      "ces\242\002\003GAA\252\002 Google.Ads.GoogleAds.V0.Serv" +
      "ices\312\002 Google\\Ads\\GoogleAds\\V0\\Servicesb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.resources.KeywordPlanKeywordProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetKeywordPlanKeywordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetKeywordPlanKeywordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetKeywordPlanKeywordRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_KeywordPlanKeywordOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_KeywordPlanKeywordOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_KeywordPlanKeywordOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateKeywordPlanKeywordResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.KeywordPlanKeywordProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}