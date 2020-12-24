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
@Table (name="categories_file")
public class CategoryFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categories_file_id", unique = true, nullable = false)
    private Integer categotiesFileId;

    @Column(name="categories_file_name", nullable = false)
    private String categoriesFileName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriesFile")
    private Set<Media> mediaSet;

}
