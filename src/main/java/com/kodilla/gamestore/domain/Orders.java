package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Data
@Table(name = "ORDERS")
public class Orders {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @Column(name = "CREATED")
    @NotNull
    private LocalDate created;

    @Column(name = "COST")
    @NotNull
    private BigDecimal cost;

    @ManyToMany
    @JoinTable(
            name = "JOIN_ORDER_GAME",
            joinColumns = {@JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "GAME_ID", referencedColumnName = "GAME_ID")}
    )
    private List<Games> games = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private Users users;

    public Orders(String name, LocalDate created, BigDecimal cost, List<Games> games, Users userId) {
        this.name = name;
        this.created = created;
        this.cost = cost;
        this.games = games;
        this.users = userId;
    }
}