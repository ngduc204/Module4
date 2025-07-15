package com.exam_module4.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "loai_san_pham")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    // Getters and Setters
    public Integer getCid() { return cid; }
    public void setCid(Integer cid) { this.cid = cid; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
}