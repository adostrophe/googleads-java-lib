// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * PriceExtensionPriceUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201702.cm;

public class PriceExtensionPriceUnit implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PriceExtensionPriceUnit(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _PER_HOUR = "PER_HOUR";
    public static final java.lang.String _PER_DAY = "PER_DAY";
    public static final java.lang.String _PER_WEEK = "PER_WEEK";
    public static final java.lang.String _PER_MONTH = "PER_MONTH";
    public static final java.lang.String _PER_YEAR = "PER_YEAR";
    public static final java.lang.String _NONE = "NONE";
    public static final PriceExtensionPriceUnit UNKNOWN = new PriceExtensionPriceUnit(_UNKNOWN);
    public static final PriceExtensionPriceUnit PER_HOUR = new PriceExtensionPriceUnit(_PER_HOUR);
    public static final PriceExtensionPriceUnit PER_DAY = new PriceExtensionPriceUnit(_PER_DAY);
    public static final PriceExtensionPriceUnit PER_WEEK = new PriceExtensionPriceUnit(_PER_WEEK);
    public static final PriceExtensionPriceUnit PER_MONTH = new PriceExtensionPriceUnit(_PER_MONTH);
    public static final PriceExtensionPriceUnit PER_YEAR = new PriceExtensionPriceUnit(_PER_YEAR);
    public static final PriceExtensionPriceUnit NONE = new PriceExtensionPriceUnit(_NONE);
    public java.lang.String getValue() { return _value_;}
    public static PriceExtensionPriceUnit fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PriceExtensionPriceUnit enumeration = (PriceExtensionPriceUnit)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PriceExtensionPriceUnit fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PriceExtensionPriceUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "PriceExtensionPriceUnit"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
