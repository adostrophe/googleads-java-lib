/**
 * CampaignSchedulingStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class CampaignSchedulingStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignSchedulingStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNAVAILABLE = "UNAVAILABLE";
    public static final java.lang.String _CURRENT = "CURRENT";
    public static final java.lang.String _ENDED = "ENDED";
    public static final java.lang.String _PENDING = "PENDING";
    public static final CampaignSchedulingStatus UNAVAILABLE = new CampaignSchedulingStatus(_UNAVAILABLE);
    public static final CampaignSchedulingStatus CURRENT = new CampaignSchedulingStatus(_CURRENT);
    public static final CampaignSchedulingStatus ENDED = new CampaignSchedulingStatus(_ENDED);
    public static final CampaignSchedulingStatus PENDING = new CampaignSchedulingStatus(_PENDING);
    public java.lang.String getValue() { return _value_;}
    public static CampaignSchedulingStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignSchedulingStatus enumeration = (CampaignSchedulingStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignSchedulingStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSchedulingStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "CampaignSchedulingStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}