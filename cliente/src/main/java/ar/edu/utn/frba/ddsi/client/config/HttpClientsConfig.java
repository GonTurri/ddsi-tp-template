package ar.edu.utn.frba.ddsi.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class HttpClientsConfig {
    @Bean
    @LoadBalanced
    public RestClient.Builder internalBuilder() {
        return RestClient.builder();
    }

    @Bean
    public RestClient.Builder externalBuilder() {
        return RestClient.builder();
    }
}