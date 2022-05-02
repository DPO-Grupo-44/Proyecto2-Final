package Mundo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private String descripcion;
    private LocalDateTime fechainicio;
    private Participante dueño;
    private ArrayList<Actividad> listaactividades;
    private ArrayList<Participante> listaparticipantes;
    private LocalDateTime fechafin;
    private ArrayList<String> tipos;

    public Proyecto(String tnombre, String tdescripcion, LocalDateTime tfechai,
                    Participante tdueño, LocalDateTime fechaf) {
        nombre = tnombre;
        descripcion = tdescripcion;
        fechainicio = tfechai;
        fechafin = fechaf;
        dueño = tdueño;
        listaparticipantes = new ArrayList<Participante>();
        listaactividades = new ArrayList<Actividad>();
        tipos = new ArrayList<String>();
    }

    public void agregarParticipantes(Participante tparticipante) {
        listaparticipantes.add(tparticipante);
    }

    public void agregarActividades(Actividad tactividad) {
        listaactividades.add(tactividad);
    }

    public String getNombre() {
        return nombre;
    }


    public LocalDateTime getFechaI() {
        return fechainicio;
    }

    public LocalDateTime getFechaF() {
        return fechafin;
    }

    public ArrayList<String> getTipos(){
        return tipos;
    }

    public ArrayList<Participante> getParticipantes(){
        return listaparticipantes;
    }

    public void setDueño(Participante tdueño) {
        dueño = tdueño;
    }

    public void agregarTipos(String ttipo) {
        tipos.add(ttipo);
    }

    public boolean buscarTipo(String ttipo) {
        boolean res = false;
        for (int j=0;j<tipos.size();j++) {

            if (tipos.get(j).equals(ttipo))
            {
                res = true;
            }
        }
        return res;
    }
}
