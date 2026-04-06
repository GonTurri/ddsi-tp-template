package ar.edu.utn.frba.ddsi.client.clients;

import ar.edu.utn.frba.ddsi.client.dto.Todo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.Optional;

@HttpExchange(url = "https://jsonplaceholder.typicode.com", accept = "application/json")
public interface DummyClient {
    @GetExchange("/todos/{id}")
    Optional<Todo> getTodoById(@PathVariable Long id);
}
