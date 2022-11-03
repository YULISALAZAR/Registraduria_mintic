package registraduria.minTIC.proyecto.Modelos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()
public class PermisoRol {
    @Id
    private String _id;
    private String rolpermiso;
    private String permiso_de_permisorol;

    public PermisoRol(String rolpermiso, String permiso_de_permisorol) {
        this.rolpermiso = rolpermiso;
        this.permiso_de_permisorol = permiso_de_permisorol;
    }

    public String get_id() {
        return _id;
    }

    public String getRolpermiso() {
        return rolpermiso;
    }

    public void setRolpermiso(String rolpermiso) {
        this.rolpermiso = rolpermiso;
    }

    public String getPermiso_de_permisorol() {
        return permiso_de_permisorol;
    }

    public void setPermiso_de_permisorol(String permiso_de_permisorol) {
        this.permiso_de_permisorol = permiso_de_permisorol;
    }
}
