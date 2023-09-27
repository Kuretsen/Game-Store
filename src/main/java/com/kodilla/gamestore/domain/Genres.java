package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Data
@Table(name = "GENRES")
public class Genres {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "GENRE_ID", unique = true)
    private long genreId;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @OneToMany(
            targetEntity = Games.class,
            mappedBy = "genres",
            fetch = FetchType.LAZY)
    private List<Games> games = new ArrayList<>();

    public Genres(String name) {
        this.name = name;
    }
}
