package ar.edu.utn.frba.ddsi.client;

import ar.edu.utn.frba.ddsi.common.Saludador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClienteApplication {
    public static void main(String[] args) {
        Saludador saludador = new Saludador();
        System.out.println(saludador.saludar("App de clientes"));
        SpringApplication.run(ClienteApplication.class, args);
    }
}
