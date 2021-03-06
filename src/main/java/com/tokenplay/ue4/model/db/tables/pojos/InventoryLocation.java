/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class InventoryLocation implements Serializable {

    private static final long serialVersionUID = -654792486;

    private String id;
    private String name;
    private Long size;
    private String restrictedType;
    private String locationtype;

    public InventoryLocation() {
    }

    public InventoryLocation(InventoryLocation value) {
        this.id = value.id;
        this.name = value.name;
        this.size = value.size;
        this.restrictedType = value.restrictedType;
        this.locationtype = value.locationtype;
    }

    public InventoryLocation(String id, String name, Long size, String restrictedType, String locationtype) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.restrictedType = restrictedType;
        this.locationtype = locationtype;
    }

    @NotNull
    public String getInlId() {
        return this.id;
    }

    public void setInlId(String id) {
        this.id = id;
    }

    @NotNull
    public String getInlName() {
        return this.name;
    }

    public void setInlName(String name) {
        this.name = name;
    }

    public Long getInlSize() {
        return this.size;
    }

    public void setInlSize(Long size) {
        this.size = size;
    }

    public String getInlRestrictedType() {
        return this.restrictedType;
    }

    public void setInlRestrictedType(String restrictedType) {
        this.restrictedType = restrictedType;
    }

    public String getInlLocationtype() {
        return this.locationtype;
    }

    public void setInlLocationtype(String locationtype) {
        this.locationtype = locationtype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InventoryLocation (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(size);
        sb.append(", ").append(restrictedType);
        sb.append(", ").append(locationtype);

        sb.append(")");
        return sb.toString();
    }
}
