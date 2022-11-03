package registraduria.minTIC.proyecto.Repositorios;

import registraduria.minTIC.proyecto.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioRol extends MongoRepository<Rol,String> {
}
