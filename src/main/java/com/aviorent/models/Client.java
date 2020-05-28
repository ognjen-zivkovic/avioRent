package com.aviorent.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {
    @Id
    private int clientId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "passport")
    private String passport;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Rent> allRents;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "madeByClient")
    private Set<Review> clientReviews;



}
