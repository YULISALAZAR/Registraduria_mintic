package registraduria.minTIC.proyecto.Repositorios;

import registraduria.minTIC.proyecto.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}
