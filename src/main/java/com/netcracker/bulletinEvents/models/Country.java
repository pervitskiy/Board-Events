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
@Table(name="countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", unique = true, nullable = false)
    private Integer countiesID;

    @Column(name="country_name", nullable = false)
    private String countryName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "county")
    private Set<City> cities;
}
