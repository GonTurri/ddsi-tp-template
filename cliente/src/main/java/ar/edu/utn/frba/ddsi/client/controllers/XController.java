package ar.edu.utn.frba.ddsi.client.controllers;

import ar.edu.utn.frba.ddsi.client.clients.DummyClient;
import ar.edu.utn.frba.ddsi.client.dto.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class XController {

    private final DummyClient dummyClient;

    @GetMapping("/test")
    public ResponseEntity<Todo> probarConsumoExterno() {
        // Consumimos una URL dummy de prueba
        var todo = dummyClient.getTodoById(3L).get();
        return ResponseEntity.ok(todo);

    }
}

