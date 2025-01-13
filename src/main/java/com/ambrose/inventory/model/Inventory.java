package com.ambrose.inventory.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;

    public Inventory(Long id, String skuCode, Integer quantity) {
        this.id = id;
        this.skuCode = skuCode;
        this.quantity = quantity;
    }

    public Inventory() {
    }

    public Long getId() {
        return this.id;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}