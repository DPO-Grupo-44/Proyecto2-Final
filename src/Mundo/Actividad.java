package Mundo;

import java.time.LocalDate;
import java.time.LocalTime;


public class Actividad {
    private String titulo;
    private String descripcion;
    private String tipo;
    private LocalDate fecha;
    private LocalTime horai;
    private LocalTime horaf;
    private Participante encargado;

    public Actividad (String ttitulo, String tdescripcion, String ttipo, LocalDate tfecha,
                      LocalTime thorai, LocalTime thoraf, Participante tparticipante) {
        titulo = ttitulo;
        descripcion = tdescripcion;
        fecha = tfecha;
        horai = thorai;
        horaf = thoraf;
        tipo = ttipo;
        encargado = tparticipante;
    }


}