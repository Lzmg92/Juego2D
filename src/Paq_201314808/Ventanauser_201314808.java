package Paq_201314808;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
/**
 * Created by Leslie on 19/03/14.
 */
public class Ventanauser_201314808 extends JFrame {

    ImageIcon icono2 = new javax.swing.ImageIcon(getClass().getResource("blue.png"));
    Image imagen2 = icono2.getImage();
    ImageIcon iconoEscalado2 = new ImageIcon(imagen2.getScaledInstance(500,500,Image.SCALE_SMOOTH));

    Stack pilas = new Stack();

    JFrame ventana2 = new JFrame("Nuevo Usuario");
    String nom;
    JLabel ing = new JLabel("Ingresa tu Nombre");
    JTextField ingado = new JTextField();
    JButton jugar = new JButton("Jugar");
    JButton sco = new JButton("Scores");
    JLabel fon = new JLabel(iconoEscalado2);

    String jug1;
    String rec = "0";


public Ventanauser_201314808(){
    ventana2.setSize(400, 190);
    ventana2.setLocationRelativeTo(this);
    ventana2.setResizable(false);
    ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ventana2.setLayout(null);
    ventana2.add(ing);
    ventana2.add(ingado);
    ventana2.add(jugar);
    ventana2.add(sco);
    ventana2.add(fon);

    ing.setBounds(30, 40, 200, 30);
    ing.setFont(new Font("Arial", Font.BOLD, 12));
    ing.setForeground(Color.white);
    ingado.setBounds(150, 40, 180, 25);
    jugar.setBounds(200, 110, 90, 20);
    sco.setBounds(100, 110, 90, 20);
    fon.setBounds(-10, -10, 450, 200);


    jugar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            VentanaGame_201314808 n = new VentanaGame_201314808();
            jug1 = ingado.getText();
            ventana2.setVisible(false);
            n.getd.setText(ingado.getText());

            Thread t1=new Thread(n.nv,"hola");
            t1.start();
               }
    });

    sco.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            VentanaTop_201314808 n = new VentanaTop_201314808();
            jug1 = ingado.getText();
            ventana2.setVisible(false);
            n.pilajug.push(jug1);
            n.pilarec.push(rec);

        }
    });
    ventana2.setVisible(true);
}


}



