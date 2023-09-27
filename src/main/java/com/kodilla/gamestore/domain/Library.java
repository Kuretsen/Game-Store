package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
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
@Table(name = "LIBRARY")
public class Library {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "LIBRARY_ID", unique = true)
    private long libraryId;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private Users users;

    @ManyToMany
    @JoinTable(
            name = "JOIN_LIBRARY_GAMES",
            joinColumns = {@JoinColumn(name = "LIBRARY_ID", referencedColumnName = "LIBRARY_ID")},
            inverseJoinColumns = {@JoinColumn(name = "GAME_ID", referencedColumnName = "GAME_ID")}
    )
    private List<Games> games = new ArrayList<>();

    public Library(String name, Users userId, List<Games> games) {
        this.name = name;
        this.users = userId;
        this.games = games;
    }
}
