package Mundo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class CargaDeDatos {
	    private String ruta_participantes = "Archivos/Participantes.txt";
	    private  String ruta_proyectos = "Archivos/Proyectos.txt";

	    private BufferedReader lector_participantes;
	    private String linea_participantes;
	    private String partes_participantes[];

	    private BufferedReader lector_proyectos;
	    private String linea_proyectos;
	    private String partes_proyectos[];

	    private String[] secc;
	    private String nom;
	    private String corr;

	    private int var1 = 0;
	    private int var2 = 1;


	    public void leerArchivo_participantes(Laboratorio laboratorio){
	        try {
	            lector_participantes = new BufferedReader((new FileReader(ruta_participantes)));
	            while ((linea_participantes = lector_participantes.readLine()) != null){
	                partes_participantes = linea_participantes.split(",");
	                if (var1 == 1){
	                    Participante nuevo = new Participante(partes_participantes[0].substring(1, partes_participantes[0].length()-1),partes_participantes[1].substring(1,partes_participantes[1].length()-1), "");
	                    Proyecto proy = laboratorio.buscarProyecto(partes_participantes[2].substring(1,partes_participantes[2].length()-1));
	                    proy.agregarParticipantes(nuevo);
	                }
	                var1 = 1;
	            }
	            lector_participantes.close();
	            linea_participantes = null;
	            partes_participantes = null;
	        }
	        catch (Exception e){
	            JOptionPane.showMessageDialog(null, e);
	        }
	    }
	 
	    public void leerArchivo_proyectos(Laboratorio laboratorio){

	        try {
	            lector_proyectos = new BufferedReader((new FileReader(ruta_proyectos)));
	            while ((linea_proyectos = lector_proyectos.readLine()) != null){
	                partes_proyectos = linea_proyectos.split(",");
	                if (var2 == 1){
	                    String inicio = partes_proyectos[2].substring(1, partes_proyectos[2].length()-1);
	                    String fin = partes_proyectos[5].substring(1, partes_proyectos[5].length()-1);

	                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

	                    LocalDateTime fechainicio = LocalDateTime.parse(inicio, formatter);
	                    LocalDateTime fechafin = LocalDateTime.parse(fin, formatter);

	                    String part = partes_proyectos[3].substring(1, partes_proyectos[3].length()-1);
	                    secc = part.split(";");
	                    nom = secc[0];
	                    corr = secc[1];
	                    Participante persona = new Participante(nom, corr, " ");
	                    



	                    Proyecto nuevo = new Proyecto(partes_proyectos[0].substring(1, partes_proyectos[0].length()-1), partes_proyectos[1].substring(1, partes_proyectos[1].length()-1), fechainicio,  persona, fechafin);
	                    laboratorio.agregarProyectos(nuevo);
	                }
	                var2 = 1;
	            }
	            lector_proyectos.close();
	            linea_proyectos = null;
	            partes_proyectos = null;
	        }
	        catch (Exception e){
	            JOptionPane.showInputDialog("No se encontro el archivo", e);
	        }
	    }

	}

