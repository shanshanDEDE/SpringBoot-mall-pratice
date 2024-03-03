package com.willy.malltest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "CustomerFeedback")
public class CustomerFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackID;

    @Column(name = "UserID")
    private Long userID;

    @Column(name = "OrderID")
    private Long orderID;

    @Column(name = "Type")
    private String type;

    @Column(name = "Description")
    private String description;

    @Column(name = "FeedbackDate")
    private Date feedbackDate;

    @Column(name = "CustomerFeedbackStatus")
    private String customerFeedbackStatus;

    public CustomerFeedback() {
    }
}