package com.group3.netflix.title.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.group3.netflix.utilities.validation.MinCurrentYear;
import com.group3.netflix.utilities.validation.ValidationErr;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

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
    @NotBlank(message = ValidationErr.NAME_MANDATORY)
    private String name;
    private String date_added;
    @MinCurrentYear
    private String release_year;
    @Max(value = 10, message = ValidationErr.INTERVAL_USER_RATING)
    @Min(value = 0, message = ValidationErr.INTERVAL_USER_RATING)
    private String rating;
    private String duration;
    private String description;
    private Float user_rating;
    @PositiveOrZero(message = ValidationErr.NEGATIVE_REVIEW)
    private Integer num_ratings;

}
