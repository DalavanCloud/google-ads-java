// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/enums/google_ads_field_data_type.proto

package com.google.ads.googleads.v0.enums;

/**
 * <pre>
 * Container holding the various data types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum}
 */
public  final class GoogleAdsFieldDataTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum)
    GoogleAdsFieldDataTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GoogleAdsFieldDataTypeEnum.newBuilder() to construct.
  private GoogleAdsFieldDataTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GoogleAdsFieldDataTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GoogleAdsFieldDataTypeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldDataTypeEnum_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldDataTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.class, com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * These are the various types a GoogleAdsService artifact may take on.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.GoogleAdsFieldDataType}
   */
  public enum GoogleAdsFieldDataType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Maps to google.protobuf.BoolValue
     * Applicable operators:  =, !=
     * </pre>
     *
     * <code>BOOLEAN = 2;</code>
     */
    BOOLEAN(2),
    /**
     * <pre>
     * Maps to google.protobuf.StringValue. It can be compared using the set of
     * operators specific to dates however.
     * Applicable operators:  =, &lt;, &gt;, &lt;=, &gt;=, BETWEEN, DURING, and IN
     * </pre>
     *
     * <code>DATE = 3;</code>
     */
    DATE(3),
    /**
     * <pre>
     * Maps to google.protobuf.DoubleValue
     * Applicable operators:  =, !=, &lt;, &gt;, IN, NOT IN
     * </pre>
     *
     * <code>DOUBLE = 4;</code>
     */
    DOUBLE(4),
    /**
     * <pre>
     * Maps to an enum. It's specific definition can be found at type_url.
     * Applicable operators:  =, !=, IN, NOT IN
     * </pre>
     *
     * <code>ENUM = 5;</code>
     */
    ENUM(5),
    /**
     * <pre>
     * Maps to google.protobuf.FloatValue
     * Applicable operators:  =, !=, &lt;, &gt;, IN, NOT IN
     * </pre>
     *
     * <code>FLOAT = 6;</code>
     */
    FLOAT(6),
    /**
     * <pre>
     * Maps to google.protobuf.Int32Value
     * Applicable operators:  =, !=, &lt;, &gt;, &lt;=, &gt;=, BETWEEN, IN, NOT IN
     * </pre>
     *
     * <code>INT32 = 7;</code>
     */
    INT32(7),
    /**
     * <pre>
     * Maps to google.protobuf.Int64Value
     * Applicable operators:  =, !=, &lt;, &gt;, &lt;=, &gt;=, BETWEEN, IN, NOT IN
     * </pre>
     *
     * <code>INT64 = 8;</code>
     */
    INT64(8),
    /**
     * <pre>
     * Maps to a protocol buffer message type. The data type's details can be
     * found in type_url.
     * No operators work with MESSAGE fields.
     * </pre>
     *
     * <code>MESSAGE = 9;</code>
     */
    MESSAGE(9),
    /**
     * <pre>
     * Maps to google.protobuf.StringValue. Represents the resource name
     * (unique id) of a resource or one of its foreign keys.
     * No operators work with RESOURCE_NAME fields.
     * </pre>
     *
     * <code>RESOURCE_NAME = 10;</code>
     */
    RESOURCE_NAME(10),
    /**
     * <pre>
     * Maps to google.protobuf.StringValue.
     * Applicable operators:  =, !=, LIKE, NOT LIKE, IN, NOT IN
     * </pre>
     *
     * <code>STRING = 11;</code>
     */
    STRING(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Maps to google.protobuf.BoolValue
     * Applicable operators:  =, !=
     * </pre>
     *
     * <code>BOOLEAN = 2;</code>
     */
    public static final int BOOLEAN_VALUE = 2;
    /**
     * <pre>
     * Maps to google.protobuf.StringValue. It can be compared using the set of
     * operators specific to dates however.
     * Applicable operators:  =, &lt;, &gt;, &lt;=, &gt;=, BETWEEN, DURING, and IN
     * </pre>
     *
     * <code>DATE = 3;</code>
     */
    public static final int DATE_VALUE = 3;
    /**
     * <pre>
     * Maps to google.protobuf.DoubleValue
     * Applicable operators:  =, !=, &lt;, &gt;, IN, NOT IN
     * </pre>
     *
     * <code>DOUBLE = 4;</code>
     */
    public static final int DOUBLE_VALUE = 4;
    /**
     * <pre>
     * Maps to an enum. It's specific definition can be found at type_url.
     * Applicable operators:  =, !=, IN, NOT IN
     * </pre>
     *
     * <code>ENUM = 5;</code>
     */
    public static final int ENUM_VALUE = 5;
    /**
     * <pre>
     * Maps to google.protobuf.FloatValue
     * Applicable operators:  =, !=, &lt;, &gt;, IN, NOT IN
     * </pre>
     *
     * <code>FLOAT = 6;</code>
     */
    public static final int FLOAT_VALUE = 6;
    /**
     * <pre>
     * Maps to google.protobuf.Int32Value
     * Applicable operators:  =, !=, &lt;, &gt;, &lt;=, &gt;=, BETWEEN, IN, NOT IN
     * </pre>
     *
     * <code>INT32 = 7;</code>
     */
    public static final int INT32_VALUE = 7;
    /**
     * <pre>
     * Maps to google.protobuf.Int64Value
     * Applicable operators:  =, !=, &lt;, &gt;, &lt;=, &gt;=, BETWEEN, IN, NOT IN
     * </pre>
     *
     * <code>INT64 = 8;</code>
     */
    public static final int INT64_VALUE = 8;
    /**
     * <pre>
     * Maps to a protocol buffer message type. The data type's details can be
     * found in type_url.
     * No operators work with MESSAGE fields.
     * </pre>
     *
     * <code>MESSAGE = 9;</code>
     */
    public static final int MESSAGE_VALUE = 9;
    /**
     * <pre>
     * Maps to google.protobuf.StringValue. Represents the resource name
     * (unique id) of a resource or one of its foreign keys.
     * No operators work with RESOURCE_NAME fields.
     * </pre>
     *
     * <code>RESOURCE_NAME = 10;</code>
     */
    public static final int RESOURCE_NAME_VALUE = 10;
    /**
     * <pre>
     * Maps to google.protobuf.StringValue.
     * Applicable operators:  =, !=, LIKE, NOT LIKE, IN, NOT IN
     * </pre>
     *
     * <code>STRING = 11;</code>
     */
    public static final int STRING_VALUE = 11;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GoogleAdsFieldDataType valueOf(int value) {
      return forNumber(value);
    }

    public static GoogleAdsFieldDataType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return BOOLEAN;
        case 3: return DATE;
        case 4: return DOUBLE;
        case 5: return ENUM;
        case 6: return FLOAT;
        case 7: return INT32;
        case 8: return INT64;
        case 9: return MESSAGE;
        case 10: return RESOURCE_NAME;
        case 11: return STRING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GoogleAdsFieldDataType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GoogleAdsFieldDataType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GoogleAdsFieldDataType>() {
            public GoogleAdsFieldDataType findValueByNumber(int number) {
              return GoogleAdsFieldDataType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final GoogleAdsFieldDataType[] VALUES = values();

    public static GoogleAdsFieldDataType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GoogleAdsFieldDataType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.GoogleAdsFieldDataType)
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum other = (com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container holding the various data types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum)
      com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldDataTypeEnum_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldDataTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.class, com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldDataTypeEnum_descriptor;
    }

    public com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.getDefaultInstance();
    }

    public com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum build() {
      com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum buildPartial() {
      com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum result = new com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum other) {
      if (other == com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum)
  private static final com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum();
  }

  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleAdsFieldDataTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<GoogleAdsFieldDataTypeEnum>() {
    public GoogleAdsFieldDataTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GoogleAdsFieldDataTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GoogleAdsFieldDataTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleAdsFieldDataTypeEnum> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.v0.enums.GoogleAdsFieldDataTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
