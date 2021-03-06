//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.29 at 09:00:37 AM IST 
//


package com.mycardsolutions.webservice.soapdto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Result"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="SystemError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Result")
@XmlEnum
public enum Result {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError");
    private final String value;

    Result(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Result fromValue(String v) {
        for (Result c: Result.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
