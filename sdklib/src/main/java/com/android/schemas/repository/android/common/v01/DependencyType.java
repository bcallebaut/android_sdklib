//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.14 at 10:33:00 PM CEST 
//


package com.android.schemas.repository.android.common.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A dependency of one package on another, including a minimum revision of the
 *                 depended-upon package.
 *             
 * 
 * <p>Java class for dependencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dependencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="min-revision" type="{http://schemas.android.com/repository/android/common/01}revisionType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dependencyType", propOrder = {

})
public class DependencyType {

    @XmlElement(name = "min-revision")
    protected RevisionType minRevision;
    @XmlAttribute(name = "path", required = true)
    protected String path;

    /**
     * Gets the value of the minRevision property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionType }
     *     
     */
    public RevisionType getMinRevision() {
        return minRevision;
    }

    /**
     * Sets the value of the minRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionType }
     *     
     */
    public void setMinRevision(RevisionType value) {
        this.minRevision = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
