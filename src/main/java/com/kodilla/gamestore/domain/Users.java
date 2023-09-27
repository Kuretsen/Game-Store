package com.kodilla.gamestore.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Data
@Table(name = "USERS")
public class Users {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "USER_ID", unique = true)
    private long userId;

    @Column(name = "NICK_NAME")
    @NotNull
    private String nickName;

    @Column(name = "FIRST_NAME")
    @NotNull
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ADRESS_ID")
    private Addresses addresses;

    @Column(name = "IS_ACTIVE")
    @NotNull
    private boolean isActive;

    @OneToMany(
            targetEntity = GameRatings.class,
            mappedBy = "users",
            fetch = FetchType.LAZY
    )
    private List<GameRatings> gameRatings = new ArrayList<>();

    @OneToMany(
            targetEntity = Orders.class,
            mappedBy = "users",
            fetch = FetchType.LAZY
    )
    private List<Orders> orders = new ArrayList<>();

    public Users(String nickName, String firstName, String lastName, Addresses addressId, boolean isActive) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addressId;
        this.isActive = isActive;
    }
}
