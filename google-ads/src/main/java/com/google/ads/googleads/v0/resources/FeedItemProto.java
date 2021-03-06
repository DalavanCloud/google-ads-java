// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/feed_item.proto

package com.google.ads.googleads.v0.resources;

public final class FeedItemProto {
  private FeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedItemPlaceholderPolicyInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedItemValidationError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedItemValidationError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v0/resources/feed" +
      "_item.proto\022!google.ads.googleads.v0.res" +
      "ources\0325google/ads/googleads/v0/common/c" +
      "ustom_parameter.proto\0320google/ads/google" +
      "ads/v0/common/feed_common.proto\032+google/" +
      "ads/googleads/v0/common/policy.proto\032Ego" +
      "ogle/ads/googleads/v0/enums/feed_item_qu" +
      "ality_approval_status.proto\032Hgoogle/ads/" +
      "googleads/v0/enums/feed_item_quality_dis" +
      "approval_reason.proto\0324google/ads/google" +
      "ads/v0/enums/feed_item_status.proto\032?goo" +
      "gle/ads/googleads/v0/enums/feed_item_val" +
      "idation_status.proto\032=google/ads/googlea" +
      "ds/v0/enums/geo_targeting_restriction.pr" +
      "oto\032:google/ads/googleads/v0/enums/polic" +
      "y_approval_status.proto\0328google/ads/goog" +
      "leads/v0/enums/policy_review_status.prot" +
      "o\032?google/ads/googleads/v0/errors/feed_i" +
      "tem_validation_error.proto\032\036google/proto" +
      "buf/wrappers.proto\"\250\005\n\010FeedItem\022\025\n\rresou" +
      "rce_name\030\001 \001(\t\022*\n\004feed\030\002 \001(\0132\034.google.pr" +
      "otobuf.StringValue\022\'\n\002id\030\003 \001(\0132\033.google." +
      "protobuf.Int64Value\0225\n\017start_date_time\030\004" +
      " \001(\0132\034.google.protobuf.StringValue\0223\n\ren" +
      "d_date_time\030\005 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022S\n\020attribute_values\030\006 \003(\01329.goog" +
      "le.ads.googleads.v0.resources.FeedItemAt" +
      "tributeValue\022u\n\031geo_targeting_restrictio" +
      "n\030\007 \001(\0162R.google.ads.googleads.v0.enums." +
      "GeoTargetingRestrictionEnum.GeoTargeting" +
      "Restriction\022N\n\025url_custom_parameters\030\010 \003" +
      "(\0132/.google.ads.googleads.v0.common.Cust" +
      "omParameter\022P\n\006status\030\t \001(\0162@.google.ads" +
      ".googleads.v0.enums.FeedItemStatusEnum.F" +
      "eedItemStatus\022V\n\014policy_infos\030\n \003(\0132@.go" +
      "ogle.ads.googleads.v0.resources.FeedItem" +
      "PlaceholderPolicyInfo\"\256\004\n\026FeedItemAttrib" +
      "uteValue\0226\n\021feed_attribute_id\030\001 \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\0222\n\rinteger_valu" +
      "e\030\002 \001(\0132\033.google.protobuf.Int64Value\0221\n\r" +
      "boolean_value\030\003 \001(\0132\032.google.protobuf.Bo" +
      "olValue\0222\n\014string_value\030\004 \001(\0132\034.google.p" +
      "rotobuf.StringValue\0222\n\014double_value\030\005 \001(" +
      "\0132\034.google.protobuf.DoubleValue\022:\n\013price" +
      "_value\030\006 \001(\0132%.google.ads.googleads.v0.c" +
      "ommon.Price\0223\n\016integer_values\030\007 \003(\0132\033.go" +
      "ogle.protobuf.Int64Value\0222\n\016boolean_valu" +
      "es\030\010 \003(\0132\032.google.protobuf.BoolValue\0223\n\r" +
      "string_values\030\t \003(\0132\034.google.protobuf.St" +
      "ringValue\0223\n\rdouble_values\030\n \003(\0132\034.googl" +
      "e.protobuf.DoubleValue\"\205\007\n\035FeedItemPlace" +
      "holderPolicyInfo\0225\n\020placeholder_type\030\001 \001" +
      "(\0132\033.google.protobuf.Int32Value\022@\n\032feed_" +
      "mapping_resource_name\030\002 \001(\0132\034.google.pro" +
      "tobuf.StringValue\022_\n\rreview_status\030\003 \001(\016" +
      "2H.google.ads.googleads.v0.enums.PolicyR" +
      "eviewStatusEnum.PolicyReviewStatus\022e\n\017ap" +
      "proval_status\030\004 \001(\0162L.google.ads.googlea" +
      "ds.v0.enums.PolicyApprovalStatusEnum.Pol" +
      "icyApprovalStatus\022N\n\024policy_topic_entrie" +
      "s\030\005 \003(\01320.google.ads.googleads.v0.common" +
      ".PolicyTopicEntry\022o\n\021validation_status\030\006" +
      " \001(\0162T.google.ads.googleads.v0.enums.Fee" +
      "dItemValidationStatusEnum.FeedItemValida" +
      "tionStatus\022U\n\021validation_errors\030\007 \003(\0132:." +
      "google.ads.googleads.v0.resources.FeedIt" +
      "emValidationError\022\177\n\027quality_approval_st" +
      "atus\030\010 \001(\0162^.google.ads.googleads.v0.enu" +
      "ms.FeedItemQualityApprovalStatusEnum.Fee" +
      "dItemQualityApprovalStatus\022\211\001\n\033quality_d" +
      "isapproval_reasons\030\t \003(\0162d.google.ads.go" +
      "ogleads.v0.enums.FeedItemQualityDisappro" +
      "valReasonEnum.FeedItemQualityDisapproval" +
      "Reason\"\255\002\n\027FeedItemValidationError\022m\n\020va" +
      "lidation_error\030\001 \001(\0162S.google.ads.google" +
      "ads.v0.errors.FeedItemValidationErrorEnu" +
      "m.FeedItemValidationError\0221\n\013description" +
      "\030\002 \001(\0132\034.google.protobuf.StringValue\0227\n\022" +
      "feed_attribute_ids\030\003 \003(\0132\033.google.protob" +
      "uf.Int64Value\0227\n\021extra_information\030\004 \001(\013" +
      "2\034.google.protobuf.StringValueB\372\001\n%com.g" +
      "oogle.ads.googleads.v0.resourcesB\rFeedIt" +
      "emProtoP\001ZJgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v0/resources;reso" +
      "urces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V0.Re" +
      "sources\312\002!Google\\Ads\\GoogleAds\\V0\\Resour" +
      "ces\352\002%Google::Ads::GoogleAds::V0::Resour" +
      "cesb\006proto3"
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
          com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v0.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v0.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedItemQualityApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedItemValidationStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.GeoTargetingRestrictionProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.errors.FeedItemValidationErrorProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_FeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_FeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Id", "StartDateTime", "EndDateTime", "AttributeValues", "GeoTargetingRestriction", "UrlCustomParameters", "Status", "PolicyInfos", });
    internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_descriptor,
        new java.lang.String[] { "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", "PriceValue", "IntegerValues", "BooleanValues", "StringValues", "DoubleValues", });
    internal_static_google_ads_googleads_v0_resources_FeedItemPlaceholderPolicyInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedItemPlaceholderPolicyInfo_descriptor,
        new java.lang.String[] { "PlaceholderType", "FeedMappingResourceName", "ReviewStatus", "ApprovalStatus", "PolicyTopicEntries", "ValidationStatus", "ValidationErrors", "QualityApprovalStatus", "QualityDisapprovalReasons", });
    internal_static_google_ads_googleads_v0_resources_FeedItemValidationError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_resources_FeedItemValidationError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedItemValidationError_descriptor,
        new java.lang.String[] { "ValidationError", "Description", "FeedAttributeIds", "ExtraInformation", });
    com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v0.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v0.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedItemQualityApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedItemValidationStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.GeoTargetingRestrictionProto.getDescriptor();
    com.google.ads.googleads.v0.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v0.errors.FeedItemValidationErrorProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
