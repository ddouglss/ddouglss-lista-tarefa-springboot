package lista.tarefa.springboot_lista_tarefa.repository;

import lista.tarefa.springboot_lista_tarefa.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TarefaRepository extends MongoRepository<Tarefa, String> {
    List<Tarefa> findByUsuarioId(String usuarioId);
}
