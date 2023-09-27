package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Data
@Table(name = "GAMES_RATING")
public class GameRatings {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "GAME_RATING_ID", unique = true)
    private long gameRatingsId;

    @Column(name = "RATE")
    @NotNull
    private double rate;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "USER_ID")
    private Users users;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "GAME_ID")
    private Games games;

    public GameRatings(double rate, String description, Users userId, Games gameId) {
        this.rate = rate;
        this.description = description;
        this.users = userId;
        this.games = gameId;
    }
}
