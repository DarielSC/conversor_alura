import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFramePrincipal extends JFrame {
    public JFramePrincipal() {
        // Configura el título del JFrame
        setTitle("JFrame Principal");
        // Configura el tamaño del JFrame
        setSize(400, 300);
        // Configura la operación por defecto al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un botón
        JButton botonAbrirJFrame = new JButton("Abrir JFrame Secundario");

        // Agrega un ActionListener al botón
        botonAbrirJFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea una instancia del JFrame Secundario y hazlo visible al hacer clic en el botón
                Divisas jFrameSecundario = new Divisas();
                jFrameSecundario.setVisible(true);
            }
        });

        // Agrega el botón al JFrame Principal
        add(botonAbrirJFrame);
    }

    public static void main(String[] args) {
        // Crea una instancia del JFrame Principal y hazlo visible
        JFramePrincipal jFramePrincipal = new JFramePrincipal();
        jFramePrincipal.setVisible(true);
    }
}
