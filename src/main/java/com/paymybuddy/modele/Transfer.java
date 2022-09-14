package com.paymybuddy.modele;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transfer")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "sender_user_email")
    String senderUserEmail;

    @Column(name = "intermediate_user_email")
   String intermediateUserEmail;

    @Column(name = "receiving_user_email")
    String receivingUserEmail;

    @Column(name = "amount_transferred")
    float amountTransferred;

    @Column(name = "commission_rate")
    float commissionRate;

    @Column(name = "transfer_cost")
    float transferCost;

    @Column(name = "amount_debited")
   float amountDebited;

    @Column(name = "annotation ")
    String annotation;

    @Column(name = "date")
    Date date;

    @Column(name = "status")
    boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenderUserEmail() {
        return senderUserEmail;
    }

    public void setSenderUserEmail(String senderUserEmail) {
        this.senderUserEmail = senderUserEmail;
    }

    public String getIntermediateUserEmail() {
        return intermediateUserEmail;
    }

    public void setIntermediateUserEmail(String intermediateUserEmail) {
        this.intermediateUserEmail = intermediateUserEmail;
    }

    public String getReceivingUserEmail() {
        return receivingUserEmail;
    }

    public void setReceivingUserEmail(String receivingUserEmail) {
        this.receivingUserEmail = receivingUserEmail;
    }

    public float getAmountTransferred() {
        return amountTransferred;
    }

    public void setAmountTransferred(float amountTransferred) {
        this.amountTransferred = amountTransferred;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public float getTransferCost() {
        return transferCost;
    }

    public void setTransferCost(float transferCost) {
        this.transferCost = transferCost;
    }

    public float getAmountDebited() {
        return amountDebited;
    }

    public void setAmountDebited(float amountDebited) {
        this.amountDebited = amountDebited;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
