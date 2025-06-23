package lista.tarefa.springboot_lista_tarefa.repository;

import lista.tarefa.springboot_lista_tarefa.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    boolean existsByEmail(String email);
}
