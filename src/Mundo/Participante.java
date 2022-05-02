package Mundo;

public class Participante {

    private String nombre;
    private String correo;
    private String contrasena;

    public Participante(String tnombre, String tcorreo, String tcontra) {
        nombre = tnombre;
        correo = tcorreo;
        contrasena = tcontra;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

}
