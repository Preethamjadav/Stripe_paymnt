package com.StripePayment.Stripe_Paymnt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;
@Data

@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "amount",nullable = false)
    private Long amount;

    public Order() {
    }

    public Order(String description, Long amount) {
        this.description = description;
        this.amount = amount;
    }
}