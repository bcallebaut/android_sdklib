//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.14 at 10:33:00 PM CEST 
//


package com.android.schemas.repository.android.common.v01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The repository, consisting of a licenses and packages.
 *             
 * 
 * <p>Java class for repositoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repositoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="license" type="{http://schemas.android.com/repository/android/common/01}licenseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://schemas.android.com/repository/android/common/01}channelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="remotePackage" type="{http://schemas.android.com/repository/android/common/01}remotePackage" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="localPackage" type="{http://schemas.android.com/repository/android/common/01}localPackage" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repositoryType", propOrder = {
    "license",
    "channel",
    "remotePackage",
    "localPackage"
})
public class RepositoryType {

    protected List<LicenseType> license;
    protected List<ChannelType> channel;
    protected List<RemotePackage> remotePackage;
    protected LocalPackage localPackage;

    /**
     * Gets the value of the license property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseType }
     * 
     * 
     */
    public List<LicenseType> getLicense() {
        if (license == null) {
            license = new ArrayList<LicenseType>();
        }
        return this.license;
    }

    /**
     * Gets the value of the channel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelType }
     * 
     * 
     */
    public List<ChannelType> getChannel() {
        if (channel == null) {
            channel = new ArrayList<ChannelType>();
        }
        return this.channel;
    }

    /**
     * Gets the value of the remotePackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remotePackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemotePackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemotePackage }
     * 
     * 
     */
    public List<RemotePackage> getRemotePackage() {
        if (remotePackage == null) {
            remotePackage = new ArrayList<RemotePackage>();
        }
        return this.remotePackage;
    }

    /**
     * Gets the value of the localPackage property.
     * 
     * @return
     *     possible object is
     *     {@link LocalPackage }
     *     
     */
    public LocalPackage getLocalPackage() {
        return localPackage;
    }

    /**
     * Sets the value of the localPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalPackage }
     *     
     */
    public void setLocalPackage(LocalPackage value) {
        this.localPackage = value;
    }

}
