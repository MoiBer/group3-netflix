package com.group3.netflix.title.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Title {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty(value = "name", required = true)
    private String name;
    private String date_added;
    private String release_year;
    private String rating;
    private String duration;
    private String description;
    private Float user_rating;
    private Integer num_ratings;

}
