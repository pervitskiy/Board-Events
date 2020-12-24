package com.netcracker.bulletinEvents.models;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="events_has_categories")
public class EventsHasCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "events_has_categories_id", unique = true, nullable = false)
    private Integer eventsHasCategoriesID;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "events_event_id", nullable = false)
    private Events eventsCategory;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "categories_categories_id", nullable = false)
    private CategoryEvents category;

}
