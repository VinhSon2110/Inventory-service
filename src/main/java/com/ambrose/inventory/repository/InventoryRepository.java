package com.ambrose.inventory.repository;

import com.ambrose.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
}