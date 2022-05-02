package Mundo;

import java.util.ArrayList;

public class Laboratorio {
    private ArrayList<Proyecto> listaProyectos;

    public Laboratorio() {
        listaProyectos = new ArrayList<Proyecto>();
    }

    public ArrayList<Proyecto> getProyectos(){
        return listaProyectos;
    }

    public void agregarProyectos(Proyecto tproyecto) {
        listaProyectos.add(tproyecto);
    }

    public Proyecto buscarProyecto(String nombre) {
        Proyecto respuesta = null;
        for (int i=0;i<listaProyectos.size();i++) {
            String nombreproy = listaProyectos.get(i).getNombre();
            if (nombreproy == nombre) {
                respuesta = listaProyectos.get(i);
            }
        }
        return respuesta;
    }

    public boolean buscarParticipante(String nombre, Proyecto proyecto) {
        boolean respuesta = false;
        ArrayList<Participante> listaparticipantes = proyecto.getParticipantes();
        for (int j=0;j<listaparticipantes.size();j++) {
            String nombreencon = listaparticipantes.get(j).getNombre();
            if (nombre.equals(nombreencon)) {
                respuesta = true;
            }
        }

        return respuesta;
    }
}