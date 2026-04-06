package ar.edu.utn.frba.ddsi.client.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(
        group = "internal",
        basePackages = "ar.edu.utn.frba.ddsi.client.clients.internal",
)
@ImportHttpServices(
        group = "external",
        basePackages = "ar.edu.utn.frba.ddsi.client.clients.external",
)
public class ClientsConfig {}