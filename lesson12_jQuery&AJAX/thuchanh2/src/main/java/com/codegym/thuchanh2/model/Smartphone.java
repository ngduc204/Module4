package com.codegym.thuchanh2.model;

import javax.persistence.*;

@Entity
@Table(name = "smartphone")
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producer;
    private String model;
    private double price;

    public Smartphone() {
    }

    public Smartphone(Long id, String producer, String model, double price) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
