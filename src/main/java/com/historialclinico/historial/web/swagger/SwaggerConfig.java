package com.historialclinico.historial.web.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
       @Bean
    public OpenAPI baseOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Historial clinico")
                                .version("1.0.0")
                                .description("Registro y verificacion de registro de un historial clinico")
                );

    }
}
