//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paid_search_operator_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paid_search_operator_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="not_contains"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paid_search_operator_enum")
@XmlEnum
public enum PaidSearchOperatorEnum {

    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("not_contains")
    NOT_CONTAINS("not_contains");
    private final String value;

    PaidSearchOperatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidSearchOperatorEnum fromValue(String v) {
        for (PaidSearchOperatorEnum c: PaidSearchOperatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}