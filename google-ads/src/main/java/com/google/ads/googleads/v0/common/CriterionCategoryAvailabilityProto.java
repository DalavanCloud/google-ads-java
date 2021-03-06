// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/criterion_category_availability.proto

package com.google.ads.googleads.v0.common;

public final class CriterionCategoryAvailabilityProto {
  private CriterionCategoryAvailabilityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_CriterionCategoryAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_CriterionCategoryAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_CriterionCategoryChannelAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_CriterionCategoryChannelAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_CriterionCategoryLocaleAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_CriterionCategoryLocaleAvailability_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v0/common/criteri" +
      "on_category_availability.proto\022\036google.a" +
      "ds.googleads.v0.common\032@google/ads/googl" +
      "eads/v0/enums/advertising_channel_sub_ty" +
      "pe.proto\032<google/ads/googleads/v0/enums/" +
      "advertising_channel_type.proto\032Pgoogle/a" +
      "ds/googleads/v0/enums/criterion_category" +
      "_channel_availability_mode.proto\032Ogoogle" +
      "/ads/googleads/v0/enums/criterion_catego" +
      "ry_locale_availability_mode.proto\032\036googl" +
      "e/protobuf/wrappers.proto\"\313\001\n\035CriterionC" +
      "ategoryAvailability\022U\n\007channel\030\001 \001(\0132D.g" +
      "oogle.ads.googleads.v0.common.CriterionC" +
      "ategoryChannelAvailability\022S\n\006locale\030\002 \003" +
      "(\0132C.google.ads.googleads.v0.common.Crit" +
      "erionCategoryLocaleAvailability\"\360\003\n$Crit" +
      "erionCategoryChannelAvailability\022\217\001\n\021ava" +
      "ilability_mode\030\001 \001(\0162t.google.ads.google" +
      "ads.v0.enums.CriterionCategoryChannelAva" +
      "ilabilityModeEnum.CriterionCategoryChann" +
      "elAvailabilityMode\022r\n\030advertising_channe" +
      "l_type\030\002 \001(\0162P.google.ads.googleads.v0.e" +
      "nums.AdvertisingChannelTypeEnum.Advertis" +
      "ingChannelType\022|\n\034advertising_channel_su" +
      "b_type\030\003 \003(\0162V.google.ads.googleads.v0.e" +
      "nums.AdvertisingChannelSubTypeEnum.Adver" +
      "tisingChannelSubType\022D\n include_default_" +
      "channel_sub_type\030\004 \001(\0132\032.google.protobuf" +
      ".BoolValue\"\236\002\n#CriterionCategoryLocaleAv" +
      "ailability\022\215\001\n\021availability_mode\030\001 \001(\0162r" +
      ".google.ads.googleads.v0.enums.Criterion" +
      "CategoryLocaleAvailabilityModeEnum.Crite" +
      "rionCategoryLocaleAvailabilityMode\0222\n\014co" +
      "untry_code\030\002 \001(\0132\034.google.protobuf.Strin" +
      "gValue\0223\n\rlanguage_code\030\003 \001(\0132\034.google.p" +
      "rotobuf.StringValueB\375\001\n\"com.google.ads.g" +
      "oogleads.v0.commonB\"CriterionCategoryAva" +
      "ilabilityProtoP\001ZDgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v0/common;" +
      "common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V0.C" +
      "ommon\312\002\036Google\\Ads\\GoogleAds\\V0\\Common\352\002" +
      "\"Google::Ads::GoogleAds::V0::Commonb\006pro" +
      "to3"
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
          com.google.ads.googleads.v0.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.CriterionCategoryChannelAvailabilityModeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.CriterionCategoryLocaleAvailabilityModeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_CriterionCategoryAvailability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_CriterionCategoryAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_CriterionCategoryAvailability_descriptor,
        new java.lang.String[] { "Channel", "Locale", });
    internal_static_google_ads_googleads_v0_common_CriterionCategoryChannelAvailability_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_common_CriterionCategoryChannelAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_CriterionCategoryChannelAvailability_descriptor,
        new java.lang.String[] { "AvailabilityMode", "AdvertisingChannelType", "AdvertisingChannelSubType", "IncludeDefaultChannelSubType", });
    internal_static_google_ads_googleads_v0_common_CriterionCategoryLocaleAvailability_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_common_CriterionCategoryLocaleAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_CriterionCategoryLocaleAvailability_descriptor,
        new java.lang.String[] { "AvailabilityMode", "CountryCode", "LanguageCode", });
    com.google.ads.googleads.v0.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.CriterionCategoryChannelAvailabilityModeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.CriterionCategoryLocaleAvailabilityModeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
