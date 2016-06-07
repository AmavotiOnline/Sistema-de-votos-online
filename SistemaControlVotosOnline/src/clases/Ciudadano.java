package clases;

/**
 * @author BuiltApp
 */
public class Ciudadano {
    private String nombre;
    private String apellido;
    private String direccion;
    private String usuario;
    private String dui;
    private String password;
    private String repetir;
    private String pregunta;
    private String respuesta;

    public Ciudadano() {
    }

    public Ciudadano(String nombre, String apellido, String direccion, String usuario, String dui, String password, String repetir, String pregunta, String respuesta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.usuario = usuario;
        this.dui = dui;
        this.password = password;
        this.repetir = repetir;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepetir() {
        return repetir;
    }

    public void setRepetir(String repetir) {
        this.repetir = repetir;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
    

}