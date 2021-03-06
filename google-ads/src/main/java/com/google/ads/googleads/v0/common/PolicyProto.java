// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/policy.proto

package com.google.ads.googleads.v0.common;

public final class PolicyProto {
  private PolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyViolationKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyViolationKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyValidationParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyValidationParameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_TextList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_TextList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_WebsiteList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_WebsiteList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationTextList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationTextList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationMismatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationMismatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraintList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraintList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_ResellerConstraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_ResellerConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/googleads/v0/common/policy." +
      "proto\022\036google.ads.googleads.v0.common\032;g" +
      "oogle/ads/googleads/v0/enums/policy_topi" +
      "c_entry_type.proto\032Wgoogle/ads/googleads" +
      "/v0/enums/policy_topic_evidence_destinat" +
      "ion_mismatch_url_type.proto\032\036google/prot" +
      "obuf/wrappers.proto\"}\n\022PolicyViolationKe" +
      "y\0221\n\013policy_name\030\001 \001(\0132\034.google.protobuf" +
      ".StringValue\0224\n\016violating_text\030\002 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\"Z\n\031PolicyVali" +
      "dationParameter\022=\n\027ignorable_policy_topi" +
      "cs\030\001 \003(\0132\034.google.protobuf.StringValue\"\257" +
      "\002\n\020PolicyTopicEntry\022+\n\005topic\030\001 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022Z\n\004type\030\002 \001(\0162L" +
      ".google.ads.googleads.v0.enums.PolicyTop" +
      "icEntryTypeEnum.PolicyTopicEntryType\022F\n\t" +
      "evidences\030\003 \003(\01323.google.ads.googleads.v" +
      "0.common.PolicyTopicEvidence\022J\n\013constrai" +
      "nts\030\004 \003(\01325.google.ads.googleads.v0.comm" +
      "on.PolicyTopicConstraint\"\372\006\n\023PolicyTopic" +
      "Evidence\0220\n\thttp_code\030\002 \001(\0132\033.google.pro" +
      "tobuf.Int32ValueH\000\022W\n\014website_list\030\003 \001(\013" +
      "2?.google.ads.googleads.v0.common.Policy" +
      "TopicEvidence.WebsiteListH\000\022Q\n\ttext_list" +
      "\030\004 \001(\0132<.google.ads.googleads.v0.common." +
      "PolicyTopicEvidence.TextListH\000\0225\n\rlangua" +
      "ge_code\030\005 \001(\0132\034.google.protobuf.StringVa" +
      "lueH\000\022h\n\025destination_text_list\030\006 \001(\0132G.g" +
      "oogle.ads.googleads.v0.common.PolicyTopi" +
      "cEvidence.DestinationTextListH\000\022g\n\024desti" +
      "nation_mismatch\030\007 \001(\0132G.google.ads.googl" +
      "eads.v0.common.PolicyTopicEvidence.Desti" +
      "nationMismatchH\000\0327\n\010TextList\022+\n\005texts\030\001 " +
      "\003(\0132\034.google.protobuf.StringValue\032=\n\013Web" +
      "siteList\022.\n\010websites\030\001 \003(\0132\034.google.prot" +
      "obuf.StringValue\032N\n\023DestinationTextList\022" +
      "7\n\021destination_texts\030\001 \003(\0132\034.google.prot" +
      "obuf.StringValue\032\251\001\n\023DestinationMismatch" +
      "\022\221\001\n\turl_types\030\001 \003(\0162~.google.ads.google" +
      "ads.v0.enums.PolicyTopicEvidenceDestinat" +
      "ionMismatchUrlTypeEnum.PolicyTopicEviden" +
      "ceDestinationMismatchUrlTypeB\007\n\005value\"\223\006" +
      "\n\025PolicyTopicConstraint\022n\n\027country_const" +
      "raint_list\030\001 \001(\0132K.google.ads.googleads." +
      "v0.common.PolicyTopicConstraint.CountryC" +
      "onstraintListH\000\022g\n\023reseller_constraint\030\002" +
      " \001(\0132H.google.ads.googleads.v0.common.Po" +
      "licyTopicConstraint.ResellerConstraintH\000" +
      "\022z\n#certificate_missing_in_country_list\030" +
      "\003 \001(\0132K.google.ads.googleads.v0.common.P" +
      "olicyTopicConstraint.CountryConstraintLi" +
      "stH\000\022\202\001\n+certificate_domain_mismatch_in_" +
      "country_list\030\004 \001(\0132K.google.ads.googlead" +
      "s.v0.common.PolicyTopicConstraint.Countr" +
      "yConstraintListH\000\032\262\001\n\025CountryConstraintL" +
      "ist\022=\n\030total_targeted_countries\030\001 \001(\0132\033." +
      "google.protobuf.Int32Value\022Z\n\tcountries\030" +
      "\002 \003(\0132G.google.ads.googleads.v0.common.P" +
      "olicyTopicConstraint.CountryConstraint\032\024" +
      "\n\022ResellerConstraint\032L\n\021CountryConstrain" +
      "t\0227\n\021country_criterion\030\001 \001(\0132\034.google.pr" +
      "otobuf.StringValueB\007\n\005valueB\346\001\n\"com.goog" +
      "le.ads.googleads.v0.commonB\013PolicyProtoP" +
      "\001ZDgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v0/common;common\242\002\003GAA\252\002\036" +
      "Google.Ads.GoogleAds.V0.Common\312\002\036Google\\" +
      "Ads\\GoogleAds\\V0\\Common\352\002\"Google::Ads::G" +
      "oogleAds::V0::Commonb\006proto3"
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
          com.google.ads.googleads.v0.enums.PolicyTopicEntryTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.PolicyTopicEvidenceDestinationMismatchUrlTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_PolicyViolationKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_PolicyViolationKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyViolationKey_descriptor,
        new java.lang.String[] { "PolicyName", "ViolatingText", });
    internal_static_google_ads_googleads_v0_common_PolicyValidationParameter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_common_PolicyValidationParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyValidationParameter_descriptor,
        new java.lang.String[] { "IgnorablePolicyTopics", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicEntry_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_common_PolicyTopicEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicEntry_descriptor,
        new java.lang.String[] { "Topic", "Type", "Evidences", "Constraints", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_descriptor,
        new java.lang.String[] { "HttpCode", "WebsiteList", "TextList", "LanguageCode", "DestinationTextList", "DestinationMismatch", "Value", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_TextList_descriptor =
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_TextList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_TextList_descriptor,
        new java.lang.String[] { "Texts", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_WebsiteList_descriptor =
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_WebsiteList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_WebsiteList_descriptor,
        new java.lang.String[] { "Websites", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationTextList_descriptor =
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationTextList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationTextList_descriptor,
        new java.lang.String[] { "DestinationTexts", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationMismatch_descriptor =
      internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationMismatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicEvidence_DestinationMismatch_descriptor,
        new java.lang.String[] { "UrlTypes", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_descriptor,
        new java.lang.String[] { "CountryConstraintList", "ResellerConstraint", "CertificateMissingInCountryList", "CertificateDomainMismatchInCountryList", "Value", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraintList_descriptor =
      internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraintList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraintList_descriptor,
        new java.lang.String[] { "TotalTargetedCountries", "Countries", });
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_ResellerConstraint_descriptor =
      internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_ResellerConstraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_ResellerConstraint_descriptor,
        new java.lang.String[] { });
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraint_descriptor =
      internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_PolicyTopicConstraint_CountryConstraint_descriptor,
        new java.lang.String[] { "CountryCriterion", });
    com.google.ads.googleads.v0.enums.PolicyTopicEntryTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.PolicyTopicEvidenceDestinationMismatchUrlTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
