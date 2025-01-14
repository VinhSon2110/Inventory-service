package com.ambrose.inventory.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI inventoryServiceApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Inventory Service API")
                        .description("This is the Rest API for Inventory service")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("Inventory Service Wiki Documentation")
                        .url("https://inventory-service-document.com/docs"));
    }
}
