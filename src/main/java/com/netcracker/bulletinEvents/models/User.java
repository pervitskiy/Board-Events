package com.netcracker.bulletinEvents.models;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Integer userID;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="information_about_yourself", nullable = true)
    private String informationAboutYourself;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Media> mediaUser;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userComments")
    private Set<Comments> userComments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userPaymentsInformation")
    private Set<PaymentInformation> userPaymentsInformation;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "events_event_id", nullable = true)
    private Events eventsUser;
}
