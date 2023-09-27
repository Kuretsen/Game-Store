package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Data
@Table(name = "PRODUCERS")
public class Producers {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "PRODUCER_ID", unique = true)
    private Long producerId;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @Column(name = "DESCRIPTION")
    @NotNull
    private String description;

    @Column
    @NotNull
    private LocalDate dateOfCreation;

    @OneToMany(
            targetEntity = Games.class,
            mappedBy = "producers",
            fetch = FetchType.LAZY)
    private List<Games> games = new ArrayList<>();

    public Producers(String name, String description, LocalDate dateOfCreation) {
        this.name = name;
        this.description = description;
        this.dateOfCreation = dateOfCreation;
    }
}
