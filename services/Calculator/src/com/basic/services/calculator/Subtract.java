/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.basic.services.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Subtract")
public class Subtract {

    protected int intA;
    protected int intB;

    /**
     * Gets the value of the intA property.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Sets the value of the intA property.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Gets the value of the intB property.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Sets the value of the intB property.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}