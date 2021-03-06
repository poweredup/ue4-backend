/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Message implements Serializable {

    private static final long serialVersionUID = -2081507555;

    private UUID id;
    private String sender;
    private String recipient;
    private Integer type;
    private OffsetDateTime time;
    private Float expiration;
    private String payload;
    private Boolean delivered;

    public Message() {
    }

    public Message(Message value) {
        this.id = value.id;
        this.sender = value.sender;
        this.recipient = value.recipient;
        this.type = value.type;
        this.time = value.time;
        this.expiration = value.expiration;
        this.payload = value.payload;
        this.delivered = value.delivered;
    }

    public Message(UUID id, String sender, String recipient, Integer type, OffsetDateTime time, Float expiration, String payload, Boolean delivered) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.type = type;
        this.time = time;
        this.expiration = expiration;
        this.payload = payload;
        this.delivered = delivered;
    }

    public UUID getMsgId() {
        return this.id;
    }

    public void setMsgId(UUID id) {
        this.id = id;
    }

    public String getMsgSender() {
        return this.sender;
    }

    public void setMsgSender(String sender) {
        this.sender = sender;
    }

    public String getMsgRecipient() {
        return this.recipient;
    }

    public void setMsgRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Integer getMsgType() {
        return this.type;
    }

    public void setMsgType(Integer type) {
        this.type = type;
    }

    public OffsetDateTime getMsgTime() {
        return this.time;
    }

    public void setMsgTime(OffsetDateTime time) {
        this.time = time;
    }

    public Float getMsgExpiration() {
        return this.expiration;
    }

    public void setMsgExpiration(Float expiration) {
        this.expiration = expiration;
    }

    public String getMsgPayload() {
        return this.payload;
    }

    public void setMsgPayload(String payload) {
        this.payload = payload;
    }

    public Boolean getMsgDelivered() {
        return this.delivered;
    }

    public void setMsgDelivered(Boolean delivered) {
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Message (");

        sb.append(id);
        sb.append(", ").append(sender);
        sb.append(", ").append(recipient);
        sb.append(", ").append(type);
        sb.append(", ").append(time);
        sb.append(", ").append(expiration);
        sb.append(", ").append(payload);
        sb.append(", ").append(delivered);

        sb.append(")");
        return sb.toString();
    }
}
