package Mundo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


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
    
    public void modificarFecha(LocalDate nuevafecha) {
		fecha = nuevafecha;
	}
	
	public void modificarHoraInicio(LocalTime horaif) {
		horai = horaif;
	}
	
	public void modificarHoraFin(LocalTime horaff) {
		horaf = horaff;
	}
	
	public String calcularDuracion() {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
		String dateStr = horai.format(formateador);
		String dateStrf = horaf.format(formateador);
		LocalTime horainicio = LocalTime.parse(dateStr, formateador);
		LocalTime horafinal = LocalTime.parse(dateStrf, formateador);
		int horainiciohoras = horainicio.getHour();
		int horainiciominutos = horainicio.getMinute();
		int horainiciosecs = horainicio.getSecond();
		horafinal = horafinal.minusHours(horainiciohoras);
		horafinal = horafinal.minusMinutes(horainiciominutos);
		horafinal = horafinal.minusSeconds(horainiciosecs);
		String respuesta = horafinal.format(formateador);
		return respuesta;
		
	}
	
	public void setHoraf(LocalTime nuevahora) {
		horaf = nuevahora;
	}
	public String getNombre() {
		return titulo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setHora(String hora) {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime dateStr = LocalTime.parse(hora, formateador);
		horai = dateStr;
	}
	public void setFecha(String fecha) {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		LocalDate dateStr = LocalDate.parse(fecha, formateador);
		this.fecha = dateStr;
	}


}