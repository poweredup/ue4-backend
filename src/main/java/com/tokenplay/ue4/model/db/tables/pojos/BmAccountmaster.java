/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class BmAccountmaster implements Serializable {

    private static final long serialVersionUID = 329543166;

    private String bmAccountmasterId;
    private String bmAccounttype;
    private String bmPrefix;
    private Double bmMinbalance;
    private Double bmInterest;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public BmAccountmaster() {
    }

    public BmAccountmaster(BmAccountmaster value) {
        this.bmAccountmasterId = value.bmAccountmasterId;
        this.bmAccounttype = value.bmAccounttype;
        this.bmPrefix = value.bmPrefix;
        this.bmMinbalance = value.bmMinbalance;
        this.bmInterest = value.bmInterest;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public BmAccountmaster(String bmAccountmasterId, String bmAccounttype, String bmPrefix, Double bmMinbalance, Double bmInterest,
        Timestamp createdAt, Timestamp updatedAt) {
        this.bmAccountmasterId = bmAccountmasterId;
        this.bmAccounttype = bmAccounttype;
        this.bmPrefix = bmPrefix;
        this.bmMinbalance = bmMinbalance;
        this.bmInterest = bmInterest;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @NotNull
    @Size(max = 32)
    public String getBmAccountmasterId() {
        return this.bmAccountmasterId;
    }

    public void setBmAccountmasterId(String bmAccountmasterId) {
        this.bmAccountmasterId = bmAccountmasterId;
    }

    @NotNull
    @Size(max = 255)
    public String getBmAccounttype() {
        return this.bmAccounttype;
    }

    public void setBmAccounttype(String bmAccounttype) {
        this.bmAccounttype = bmAccounttype;
    }

    @NotNull
    @Size(max = 255)
    public String getBmPrefix() {
        return this.bmPrefix;
    }

    public void setBmPrefix(String bmPrefix) {
        this.bmPrefix = bmPrefix;
    }

    @NotNull
    public Double getBmMinbalance() {
        return this.bmMinbalance;
    }

    public void setBmMinbalance(Double bmMinbalance) {
        this.bmMinbalance = bmMinbalance;
    }

    @NotNull
    public Double getBmInterest() {
        return this.bmInterest;
    }

    public void setBmInterest(Double bmInterest) {
        this.bmInterest = bmInterest;
    }

    @NotNull
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @NotNull
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BmAccountmaster (");

        sb.append(bmAccountmasterId);
        sb.append(", ").append(bmAccounttype);
        sb.append(", ").append(bmPrefix);
        sb.append(", ").append(bmMinbalance);
        sb.append(", ").append(bmInterest);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}