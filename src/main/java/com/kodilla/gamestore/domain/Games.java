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
@Table(name = "GAMES")
public class Games {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "GAME_ID")
    private Long id;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @Column(name = "PRICE")
    @NotNull
    private Double price;

    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private Genres genres;

    @ManyToOne
    @JoinColumn(name = "PRODUCER_ID")
    private Producers producers;

    @Column(name = "DESCRIPTION")
    @NotNull
    private String description;

    @Column(name = "DATE_OF_CREATION")
    @NotNull
    private LocalDate dateOfCreation;

    @OneToMany(
            targetEntity = GameRatings.class,
            mappedBy = "games",
            fetch = FetchType.LAZY
    )
    private List<GameRatings> gameRatings = new ArrayList<>();

    @ManyToMany
    private List<Orders> orders = new ArrayList<>();

    @ManyToMany
    private List<Library> libraries = new ArrayList<>();

    public Games(String name, Double price, Genres genreId, Producers producerId, String description, LocalDate dateOfCreation) {
        this.name = name;
        this.price = price;
        this.genres = genreId;
        this.producers = producerId;
        this.description = description;
        this.dateOfCreation = dateOfCreation;
    }
}