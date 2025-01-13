package com.ambrose.inventory.service;

import com.ambrose.inventory.repository.InventoryRepository;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(InventoryService.class);
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public boolean isInStock(String skuCode, Integer quantity) {
//        log.info(" Start -- Received request to check stock for skuCode {}, with quantity {}", skuCode, quantity);
        boolean isInStock = inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
//        log.info(" End -- Product with skuCode {}, and quantity {}, is in stock - {}", skuCode, quantity, isInStock);
        return isInStock;
    }
}
