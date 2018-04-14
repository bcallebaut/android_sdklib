//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.14 at 10:33:00 PM CEST 
//


package com.android.schemas.repository.android.common.v01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A collection of files that can be downloaded for a given architecture.
 *                 The <archives> node is mandatory in the repository packages and the
 *                 collection must have at least one <archive> declared.
 *                 Each archive contains a <complete> element and zero or more
 *                 <patch> elements.
 *             
 * 
 * <p>Java class for archiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="archiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="host-os" type="{http://schemas.android.com/repository/android/common/01}osType" minOccurs="0"/>
 *         &lt;element name="host-bits" type="{http://schemas.android.com/repository/android/common/01}bitSizeType" minOccurs="0"/>
 *         &lt;element name="jvm-bits" type="{http://schemas.android.com/repository/android/common/01}bitSizeType" minOccurs="0"/>
 *         &lt;element name="min-jvm-version" type="{http://schemas.android.com/repository/android/common/01}revisionType" minOccurs="0"/>
 *         &lt;element name="complete" type="{http://schemas.android.com/repository/android/common/01}completeType"/>
 *         &lt;element name="patches" type="{http://schemas.android.com/repository/android/common/01}patchesType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "archiveType", propOrder = {

})
public class ArchiveType {

    @XmlElement(name = "host-os")
    protected String hostOs;
    @XmlElement(name = "host-bits")
    protected Integer hostBits;
    @XmlElement(name = "jvm-bits")
    protected Integer jvmBits;
    @XmlElement(name = "min-jvm-version")
    protected RevisionType minJvmVersion;
    @XmlElement(required = true)
    protected CompleteType complete;
    protected PatchesType patches;

    /**
     * Gets the value of the hostOs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostOs() {
        return hostOs;
    }

    /**
     * Sets the value of the hostOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostOs(String value) {
        this.hostOs = value;
    }

    /**
     * Gets the value of the hostBits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostBits() {
        return hostBits;
    }

    /**
     * Sets the value of the hostBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostBits(Integer value) {
        this.hostBits = value;
    }

    /**
     * Gets the value of the jvmBits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJvmBits() {
        return jvmBits;
    }

    /**
     * Sets the value of the jvmBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJvmBits(Integer value) {
        this.jvmBits = value;
    }

    /**
     * Gets the value of the minJvmVersion property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionType }
     *     
     */
    public RevisionType getMinJvmVersion() {
        return minJvmVersion;
    }

    /**
     * Sets the value of the minJvmVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionType }
     *     
     */
    public void setMinJvmVersion(RevisionType value) {
        this.minJvmVersion = value;
    }

    /**
     * Gets the value of the complete property.
     * 
     * @return
     *     possible object is
     *     {@link CompleteType }
     *     
     */
    public CompleteType getComplete() {
        return complete;
    }

    /**
     * Sets the value of the complete property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteType }
     *     
     */
    public void setComplete(CompleteType value) {
        this.complete = value;
    }

    /**
     * Gets the value of the patches property.
     * 
     * @return
     *     possible object is
     *     {@link PatchesType }
     *     
     */
    public PatchesType getPatches() {
        return patches;
    }

    /**
     * Sets the value of the patches property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatchesType }
     *     
     */
    public void setPatches(PatchesType value) {
        this.patches = value;
    }

}
