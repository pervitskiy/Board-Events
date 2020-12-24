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
@Table(name="categories")
public class CategoryEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categories_id", unique = true, nullable = false)
    private Integer categoryEventID;

    @Column(name="name_category", nullable = false)
    private String nameCategory;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private Set<EventsHasCategories> eventsHasCategories;
}
