package registraduria.minTIC.proyecto.Repositorios;

import registraduria.minTIC.proyecto.Modelos.PermisoRol;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioPermisoRol extends MongoRepository<PermisoRol,String> {
}