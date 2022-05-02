package Interfaz;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame{
    public VentanaPrincipal(){
        this.setSize(700,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Proyectos");
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(700,600));

        componentes();
    }

    private void componentes(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);

        JLabel titulo_principal = new JLabel("Pagina Principal");
        panel.add(titulo_principal);
    }
}
