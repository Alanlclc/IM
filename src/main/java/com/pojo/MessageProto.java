// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageProto.proto

package com.pojo;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Message.Type type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>.Message.Type type = 1;</code>
     */
    com.pojo.MessageProto.Message.Type getType();

    /**
     * <code>.Message.Target target = 2;</code>
     */
    int getTargetValue();
    /**
     * <code>.Message.Target target = 2;</code>
     */
    com.pojo.MessageProto.Message.Target getTarget();

    /**
     * <code>int32 id = 3;</code>
     */
    int getId();

    /**
     * <code>int32 targetId = 4;</code>
     */
    int getTargetId();

    /**
     * <code>string mes = 5;</code>
     */
    java.lang.String getMes();
    /**
     * <code>string mes = 5;</code>
     */
    com.google.protobuf.ByteString
        getMesBytes();

    /**
     * <code>string sendTime = 6;</code>
     */
    java.lang.String getSendTime();
    /**
     * <code>string sendTime = 6;</code>
     */
    com.google.protobuf.ByteString
        getSendTimeBytes();
  }
  /**
   * Protobuf type {@code Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      type_ = 0;
      target_ = 0;
      id_ = 0;
      targetId_ = 0;
      mes_ = "";
      sendTime_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      @SuppressWarnings("unused")
      int mutable_bitField0_ = 0;
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
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              target_ = rawValue;
              break;
            }
            case 24: {

              id_ = input.readInt32();
              break;
            }
            case 32: {

              targetId_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              mes_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              sendTime_ = s;
              break;
            }
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
      return com.pojo.MessageProto.internal_static_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pojo.MessageProto.internal_static_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pojo.MessageProto.Message.class, com.pojo.MessageProto.Message.Builder.class);
    }

    /**
     * Protobuf enum {@code Message.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>HEARTBEAT = 0;</code>
       */
      HEARTBEAT(0),
      /**
       * <code>MESSAGE = 1;</code>
       */
      MESSAGE(1),
      /**
       * <code>IMAGE = 2;</code>
       */
      IMAGE(2),
      /**
       * <code>VIDEO = 3;</code>
       */
      VIDEO(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>HEARTBEAT = 0;</code>
       */
      public static final int HEARTBEAT_VALUE = 0;
      /**
       * <code>MESSAGE = 1;</code>
       */
      public static final int MESSAGE_VALUE = 1;
      /**
       * <code>IMAGE = 2;</code>
       */
      public static final int IMAGE_VALUE = 2;
      /**
       * <code>VIDEO = 3;</code>
       */
      public static final int VIDEO_VALUE = 3;


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
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      public static Type forNumber(int value) {
        switch (value) {
          case 0: return HEARTBEAT;
          case 1: return MESSAGE;
          case 2: return IMAGE;
          case 3: return VIDEO;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
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
        return com.pojo.MessageProto.Message.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
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

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Message.Type)
    }

    /**
     * Protobuf enum {@code Message.Target}
     */
    public enum Target
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>USER = 0;</code>
       */
      USER(0),
      /**
       * <code>GROUP = 1;</code>
       */
      GROUP(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>USER = 0;</code>
       */
      public static final int USER_VALUE = 0;
      /**
       * <code>GROUP = 1;</code>
       */
      public static final int GROUP_VALUE = 1;


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
      public static Target valueOf(int value) {
        return forNumber(value);
      }

      public static Target forNumber(int value) {
        switch (value) {
          case 0: return USER;
          case 1: return GROUP;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Target>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Target> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Target>() {
              public Target findValueByNumber(int number) {
                return Target.forNumber(number);
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
        return com.pojo.MessageProto.Message.getDescriptor().getEnumTypes().get(1);
      }

      private static final Target[] VALUES = values();

      public static Target valueOf(
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

      private Target(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Message.Target)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.Message.Type type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Message.Type type = 1;</code>
     */
    public com.pojo.MessageProto.Message.Type getType() {
      com.pojo.MessageProto.Message.Type result = com.pojo.MessageProto.Message.Type.valueOf(type_);
      return result == null ? com.pojo.MessageProto.Message.Type.UNRECOGNIZED : result;
    }

    public static final int TARGET_FIELD_NUMBER = 2;
    private int target_;
    /**
     * <code>.Message.Target target = 2;</code>
     */
    public int getTargetValue() {
      return target_;
    }
    /**
     * <code>.Message.Target target = 2;</code>
     */
    public com.pojo.MessageProto.Message.Target getTarget() {
      com.pojo.MessageProto.Message.Target result = com.pojo.MessageProto.Message.Target.valueOf(target_);
      return result == null ? com.pojo.MessageProto.Message.Target.UNRECOGNIZED : result;
    }

    public static final int ID_FIELD_NUMBER = 3;
    private int id_;
    /**
     * <code>int32 id = 3;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int TARGETID_FIELD_NUMBER = 4;
    private int targetId_;
    /**
     * <code>int32 targetId = 4;</code>
     */
    public int getTargetId() {
      return targetId_;
    }

    public static final int MES_FIELD_NUMBER = 5;
    private volatile java.lang.Object mes_;
    /**
     * <code>string mes = 5;</code>
     */
    public java.lang.String getMes() {
      java.lang.Object ref = mes_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mes_ = s;
        return s;
      }
    }
    /**
     * <code>string mes = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMesBytes() {
      java.lang.Object ref = mes_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDTIME_FIELD_NUMBER = 6;
    private volatile java.lang.Object sendTime_;
    /**
     * <code>string sendTime = 6;</code>
     */
    public java.lang.String getSendTime() {
      java.lang.Object ref = sendTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sendTime_ = s;
        return s;
      }
    }
    /**
     * <code>string sendTime = 6;</code>
     */
    public com.google.protobuf.ByteString
        getSendTimeBytes() {
      java.lang.Object ref = sendTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sendTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != com.pojo.MessageProto.Message.Type.HEARTBEAT.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (target_ != com.pojo.MessageProto.Message.Target.USER.getNumber()) {
        output.writeEnum(2, target_);
      }
      if (id_ != 0) {
        output.writeInt32(3, id_);
      }
      if (targetId_ != 0) {
        output.writeInt32(4, targetId_);
      }
      if (!getMesBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, mes_);
      }
      if (!getSendTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sendTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.pojo.MessageProto.Message.Type.HEARTBEAT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (target_ != com.pojo.MessageProto.Message.Target.USER.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, target_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, id_);
      }
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, targetId_);
      }
      if (!getMesBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, mes_);
      }
      if (!getSendTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sendTime_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.pojo.MessageProto.Message)) {
        return super.equals(obj);
      }
      com.pojo.MessageProto.Message other = (com.pojo.MessageProto.Message) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      result = result && target_ == other.target_;
      result = result && (getId()
          == other.getId());
      result = result && (getTargetId()
          == other.getTargetId());
      result = result && getMes()
          .equals(other.getMes());
      result = result && getSendTime()
          .equals(other.getSendTime());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @SuppressWarnings("unchecked")
	@java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + target_;
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + TARGETID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (37 * hash) + MES_FIELD_NUMBER;
      hash = (53 * hash) + getMes().hashCode();
      hash = (37 * hash) + SENDTIME_FIELD_NUMBER;
      hash = (53 * hash) + getSendTime().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.pojo.MessageProto.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pojo.MessageProto.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pojo.MessageProto.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pojo.MessageProto.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pojo.MessageProto.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.pojo.MessageProto.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.pojo.MessageProto.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.pojo.MessageProto.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.pojo.MessageProto.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.pojo.MessageProto.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.pojo.MessageProto.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.pojo.MessageProto.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.pojo.MessageProto.Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Message)
        com.pojo.MessageProto.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.pojo.MessageProto.internal_static_Message_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.pojo.MessageProto.internal_static_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.pojo.MessageProto.Message.class, com.pojo.MessageProto.Message.Builder.class);
      }

      // Construct using com.pojo.MessageProto.Message.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        target_ = 0;

        id_ = 0;

        targetId_ = 0;

        mes_ = "";

        sendTime_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.pojo.MessageProto.internal_static_Message_descriptor;
      }

      @java.lang.Override
      public com.pojo.MessageProto.Message getDefaultInstanceForType() {
        return com.pojo.MessageProto.Message.getDefaultInstance();
      }

      @java.lang.Override
      public com.pojo.MessageProto.Message build() {
        com.pojo.MessageProto.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.pojo.MessageProto.Message buildPartial() {
        com.pojo.MessageProto.Message result = new com.pojo.MessageProto.Message(this);
        result.type_ = type_;
        result.target_ = target_;
        result.id_ = id_;
        result.targetId_ = targetId_;
        result.mes_ = mes_;
        result.sendTime_ = sendTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.pojo.MessageProto.Message) {
          return mergeFrom((com.pojo.MessageProto.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.pojo.MessageProto.Message other) {
        if (other == com.pojo.MessageProto.Message.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.target_ != 0) {
          setTargetValue(other.getTargetValue());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
        }
        if (!other.getMes().isEmpty()) {
          mes_ = other.mes_;
          onChanged();
        }
        if (!other.getSendTime().isEmpty()) {
          sendTime_ = other.sendTime_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.pojo.MessageProto.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.pojo.MessageProto.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.Message.Type type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.Message.Type type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Message.Type type = 1;</code>
       */
      public com.pojo.MessageProto.Message.Type getType() {
        com.pojo.MessageProto.Message.Type result = com.pojo.MessageProto.Message.Type.valueOf(type_);
        return result == null ? com.pojo.MessageProto.Message.Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.Message.Type type = 1;</code>
       */
      public Builder setType(com.pojo.MessageProto.Message.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Message.Type type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int target_ = 0;
      /**
       * <code>.Message.Target target = 2;</code>
       */
      public int getTargetValue() {
        return target_;
      }
      /**
       * <code>.Message.Target target = 2;</code>
       */
      public Builder setTargetValue(int value) {
        target_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Message.Target target = 2;</code>
       */
      public com.pojo.MessageProto.Message.Target getTarget() {
        com.pojo.MessageProto.Message.Target result = com.pojo.MessageProto.Message.Target.valueOf(target_);
        return result == null ? com.pojo.MessageProto.Message.Target.UNRECOGNIZED : result;
      }
      /**
       * <code>.Message.Target target = 2;</code>
       */
      public Builder setTarget(com.pojo.MessageProto.Message.Target value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        target_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Message.Target target = 2;</code>
       */
      public Builder clearTarget() {
        
        target_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 3;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 3;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 3;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int targetId_ ;
      /**
       * <code>int32 targetId = 4;</code>
       */
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>int32 targetId = 4;</code>
       */
      public Builder setTargetId(int value) {
        
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 targetId = 4;</code>
       */
      public Builder clearTargetId() {
        
        targetId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object mes_ = "";
      /**
       * <code>string mes = 5;</code>
       */
      public java.lang.String getMes() {
        java.lang.Object ref = mes_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mes_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string mes = 5;</code>
       */
      public com.google.protobuf.ByteString
          getMesBytes() {
        java.lang.Object ref = mes_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mes_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string mes = 5;</code>
       */
      public Builder setMes(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        mes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string mes = 5;</code>
       */
      public Builder clearMes() {
        
        mes_ = getDefaultInstance().getMes();
        onChanged();
        return this;
      }
      /**
       * <code>string mes = 5;</code>
       */
      public Builder setMesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        mes_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object sendTime_ = "";
      /**
       * <code>string sendTime = 6;</code>
       */
      public java.lang.String getSendTime() {
        java.lang.Object ref = sendTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sendTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sendTime = 6;</code>
       */
      public com.google.protobuf.ByteString
          getSendTimeBytes() {
        java.lang.Object ref = sendTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sendTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sendTime = 6;</code>
       */
      public Builder setSendTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sendTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string sendTime = 6;</code>
       */
      public Builder clearSendTime() {
        
        sendTime_ = getDefaultInstance().getSendTime();
        onChanged();
        return this;
      }
      /**
       * <code>string sendTime = 6;</code>
       */
      public Builder setSendTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sendTime_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Message)
    }

    // @@protoc_insertion_point(class_scope:Message)
    private static final com.pojo.MessageProto.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.pojo.MessageProto.Message();
    }

    public static com.pojo.MessageProto.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.pojo.MessageProto.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022MessageProto.proto\"\335\001\n\007Message\022\033\n\004type" +
      "\030\001 \001(\0162\r.Message.Type\022\037\n\006target\030\002 \001(\0162\017." +
      "Message.Target\022\n\n\002id\030\003 \001(\005\022\020\n\010targetId\030\004" +
      " \001(\005\022\013\n\003mes\030\005 \001(\t\022\020\n\010sendTime\030\006 \001(\t\"8\n\004T" +
      "ype\022\r\n\tHEARTBEAT\020\000\022\013\n\007MESSAGE\020\001\022\t\n\005IMAGE" +
      "\020\002\022\t\n\005VIDEO\020\003\"\035\n\006Target\022\010\n\004USER\020\000\022\t\n\005GRO" +
      "UP\020\001B\030\n\010com.pojoB\014MessageProtob\006proto3"
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
        }, assigner);
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new java.lang.String[] { "Type", "Target", "Id", "TargetId", "Mes", "SendTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
