package com.paymybuddy.modele;

import javax.persistence.*;

@Entity
@Table(name = "connection")
public class Connection {

    //  TODO make private all argument

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "user_id")
    int userId;

    @Column(name = "beneficiary_user_email")
    String beneficiaryUserEmail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBeneficiaryUserEmail() {
        return beneficiaryUserEmail;
    }

    public void setBeneficiaryUserEmail(String beneficiaryUserEmail) {
        this.beneficiaryUserEmail = beneficiaryUserEmail;
    }
}
