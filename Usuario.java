import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String dni;

    public Usuario(String nombre, String apellidos, String fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaNac = sdf.parse(this.fechaNacimiento);
            Date fechaActual = new Date();
            long diferencia = fechaActual.getTime() - fechaNac.getTime();
            long edadMilisegundos = 31536000000L; // 1 año = 31,536,000,000 milisegundos
            int edad = (int) (diferencia / edadMilisegundos);
            return edad;
        } catch (ParseException e) {
            System.out.println("Error al calcular la edad: " + e.getMessage());
            return -1;
        }
    }
}
