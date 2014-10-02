package Paq_201314808;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 * Created by Leslie on 19/03/14.
 */
public class Ventana_201314808 extends JFrame {

    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("logo.jpg"));
    Image imagen = icono.getImage();
    ImageIcon iconoEscalado = new ImageIcon(imagen.getScaledInstance(200,200,Image.SCALE_SMOOTH));

    ImageIcon icono2 = new javax.swing.ImageIcon(getClass().getResource("blue.png"));
    Image imagen2 = icono2.getImage();
    ImageIcon iconoEscalado2 = new ImageIcon(imagen2.getScaledInstance(500,500,Image.SCALE_SMOOTH));

    JFrame ventana = new JFrame("Juego 2D");
    JButton NvaPar = new JButton("Nueva Partida");
    JButton sco = new JButton("Scores");
    JLabel car = new JLabel("201314808");
    JLabel fon = new JLabel(iconoEscalado2);
    JLabel logo = new JLabel(iconoEscalado);


    public Ventana_201314808(){
        ventana.setBackground(Color.BLACK);
        ventana.setSize(500, 250);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setLayout(null);

        ventana.add(logo);
        ventana.add(car);
        car.setFont(new Font("Eras Demi ITC", Font.BOLD, 16));
        car.setForeground(Color.white);
        ventana.add(NvaPar);
        ventana.add(sco);
        ventana.add(fon);

        fon.setBounds(-10, -10, 500, 500);
        logo.setBounds(25,10, 200, 200);
        car.setBounds(350, 180, 100, 20);
        NvaPar.setBounds(275, 55, 150, 20);
        sco.setBounds(310, 95, 80,20);

        NvaPar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ventanauser_201314808 n = new Ventanauser_201314808();
                ventana.setVisible(false);
            }
        });

        sco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentanaTop_201314808 m = new VentanaTop_201314808();
                ventana.setVisible(false);
            }
        });

        ventana.setVisible(true);
         }
}
