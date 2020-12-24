package com.netcracker.bulletinEvents.models;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", unique = true, nullable = false)
    private Integer eventId;

    @Column(name="date_time", nullable = false)
    private LocalDateTime dateTime;

    @Column(name="place", nullable = false)
    private String place;

    @Column(name="brief_description", nullable = false)
    private String briefDescription;

    @Column(name="full_description", nullable = false)
    private String fullDescription;

    @Column(name="external_event", nullable = true)
    private String externalEvent;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cities_city_id", nullable = false)
    private City city;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventsUser")
    private Set<User> users;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventsMedia")
    private Set<Media> medias;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventsCategory")
    private Set<EventsHasCategories> eventsCategories;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventsComments")
    private Set<Comments> comments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventsPaymentInformation")
    private Set<Comments> paymentInformation;



}
