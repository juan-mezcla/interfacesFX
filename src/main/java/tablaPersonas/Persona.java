package tablaPersonas;

public class Persona {
    private String nombre,apellidos,edad;
    private int id=1;
    private int idPersona;
    public Persona(String nombre, String apellidos, String edad) {
        this.idPersona=id;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nombre = nombre;
        id++;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
