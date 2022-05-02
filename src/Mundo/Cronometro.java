package Mundo;

import java.util.*;

//Se toma el tiempo que pasa mientras se ejecuta una tarea

public class Cronometro {
    public static void main()
    {
        {
            String time = " ";
            int dias = 0;
            int horas = 0;
            int minutos = 0;
            int segundo = 0;


            Scanner Input = new Scanner(System.in);

            Calendar InicioCronometro = Calendar.getInstance();
            long HoraInicio = InicioCronometro.getTimeInMillis();

            System.out.println("Se ha iniciado el cronometro. ");
            System.out.print("Para finalizar el cronometro escriba Y . ");
            String Finalizar = Input.next();

            if (Finalizar.charAt(0) == 'Y')
            {
                Calendar FinCronometro = Calendar.getInstance();
                long HoraFinal = FinCronometro.getTimeInMillis();
                long tiempoMillis = HoraFinal - HoraInicio;
                segundo = (int) (tiempoMillis / 1000);
                if (segundo > 59)
                {
                    minutos = segundo / 60;

                    if (minutos > 59)
                    {
                        horas = minutos/60;

                        if (horas > 23)
                        {

                            dias = horas / 24;

                        }
                    }

                }
            }

            time = (dias + " " + horas + " " + minutos + " " + segundo);
            System.out.println(time);
        }


    }
}
