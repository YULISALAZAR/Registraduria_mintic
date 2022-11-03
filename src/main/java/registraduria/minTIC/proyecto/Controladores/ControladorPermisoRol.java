package registraduria.minTIC.proyecto.Controladores;
import registraduria.minTIC.proyecto.Modelos.PermisoRol;
import registraduria.minTIC.proyecto.Repositorios.RepositorioPermisoRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@CrossOrigin
@RestController
@RequestMapping("/PermisoRoles")
public class ControladorPermisoRol {
    @Autowired
    private RepositorioPermisoRol miRepositorioPermisoRol;

    @GetMapping("")
    public List<PermisoRol> index(){
        return this.miRepositorioPermisoRol.findAll();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public PermisoRol create(@RequestBody  PermisoRol infoPermisoRol){
        return this.miRepositorioPermisoRol.save(infoPermisoRol);
    }
    @GetMapping("{id}")
    public PermisoRol show(@PathVariable String id){
        PermisoRol permisoRolActual=this.miRepositorioPermisoRol
                .findById(id)
                .orElse(null);
        return permisoRolActual;
    }
    @PutMapping("{id}")
    public PermisoRol update(@PathVariable String id,@RequestBody  PermisoRol infoPermisoRol){
        PermisoRol permisoRolActual=this.miRepositorioPermisoRol
                .findById(id)
                .orElse(null);
        if(permisoRolActual!=null){
            permisoRolActual.setRolpermiso(infoPermisoRol.getRolpermiso());
            permisoRolActual.setPermiso_de_permisorol(infoPermisoRol.getPermiso_de_permisorol());
            return this.miRepositorioPermisoRol.save(permisoRolActual);
        }else{
            return null;
        }

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        PermisoRol permisoRolActual=this.miRepositorioPermisoRol
                .findById(id)
                .orElse(null);
        if (permisoRolActual!=null){
            this.miRepositorioPermisoRol.delete(permisoRolActual);
        }

    }
}