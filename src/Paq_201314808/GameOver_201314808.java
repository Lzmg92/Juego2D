package Paq_201314808;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Leslie on 4/04/14.
 */
public class GameOver_201314808 {

    JFrame ventana = new JFrame("Game Over");

    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("fondO.png"));
    Image imagen = icono.getImage();
    ImageIcon iconoEscalado = new ImageIcon(imagen.getScaledInstance(400,300,Image.SCALE_SMOOTH));

    ImageIcon icono2 = new javax.swing.ImageIcon(getClass().getResource("GameO.png"));
    Image imagen2 = icono2.getImage();
    ImageIcon iconoEscalado2 = new ImageIcon(imagen2.getScaledInstance(200,150,Image.SCALE_SMOOTH));

    ImageIcon icono3 = new javax.swing.ImageIcon(getClass().getResource("blue.png"));
    Image imagen3 = icono3.getImage();
    ImageIcon iconoEscalado3 = new ImageIcon(imagen3.getScaledInstance(450,450,Image.SCALE_SMOOTH));

    JLabel fond = new JLabel(iconoEscalado);
    JLabel Gameo = new JLabel(iconoEscalado2);
    JLabel fond2 = new JLabel(iconoEscalado3);
    JButton rei = new JButton("Reiniciar");
    JButton sal = new JButton("Salir");

    String al;

    public GameOver_201314808(){
        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setBackground(Color.black);
        ventana.setResizable(false);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.add(fond);
        ventana.add(Gameo);
        ventana.add(rei);
        ventana.add(sal);
        ventana.add(fond2);

        ventana.setLayout(null);
        fond.setBounds(-5, -5, 400, 300);
        Gameo.setBounds(100,40,200,150);
        rei.setBounds(60, 230, 100, 20);
        sal.setBounds(220, 230, 100, 20);
        fond2.setBounds(-5, -5, 425, 325);

        rei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ventanauser_201314808 n = new Ventanauser_201314808();
                n.rec = al;
                ventana.setVisible(false);
            }
        });

        sal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        ventana.setVisible(true);

    }
}
