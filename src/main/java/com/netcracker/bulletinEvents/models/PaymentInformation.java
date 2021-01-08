package com.netcracker.bulletinEvents.models;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table (name="payment_information")
public class PaymentInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_information_id", unique = true, nullable = false)
    private Integer PaymentInformationID;

    @Column(name="datetime", nullable = false)
    private LocalDateTime dateTimePay;

    @Column(name="status", nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "events_event_id", nullable = false)
    private Events eventsPaymentInformation;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "users_user_id", nullable = false)
    private User userPaymentsInformation;
}
