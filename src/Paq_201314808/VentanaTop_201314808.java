package Paq_201314808;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import Paq_201314808.Ventanauser_201314808;

/**
 * Created by Leslie on 19/03/14.
 */
public class VentanaTop_201314808 extends JFrame{

    Ventanauser_201314808 p = new Ventanauser_201314808();

    Stack pilajug = new Stack();
    Stack pilarec =  new Stack();

    ImageIcon icono2 = new javax.swing.ImageIcon(getClass().getResource("blue.png"));
    Image imagen2 = icono2.getImage();
    ImageIcon iconoEscalado2 = new ImageIcon(imagen2.getScaledInstance(550,550,Image.SCALE_SMOOTH));

    JLabel top = new JLabel("TOP 5");
    JLabel Km = new JLabel("Años luz Recorridos");
    JLabel jug = new JLabel("Piloto");

    String vect[] = new String[2];

    //String nom = pilajug.pop();


    int po;

   JLabel fond = new JLabel(iconoEscalado2);
    JLabel top1 = new JLabel();
    JLabel top2 = new JLabel();
    JLabel top3 = new JLabel();
    JLabel top4 = new JLabel();
    JLabel top5 = new JLabel();

    JLabel topk1 = new JLabel();
    JLabel topk2 = new JLabel();
    JLabel topk3 = new JLabel();
    JLabel topk4 = new JLabel();
    JLabel topk5 = new JLabel();
    JFrame ventanat = new JFrame("Los Mejores Pilotos");
    JButton Reg = new JButton("Regresar");


public VentanaTop_201314808(){
    p.ventana2.setVisible(false);
    ventanat.setSize(500, 500);
    ventanat.setLocationRelativeTo(this);
    ventanat.setResizable(false);
    ventanat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ventanat.setLayout(null);
    //Labels
    ventanat.add(top);
    ventanat.add(Km);
    ventanat.add(jug);
    ventanat.add(Reg);
    //Registros
    ventanat.add(top1);
    ventanat.add(topk1);


    ventanat.add(fond);

    top.setBounds(225, 5, 100, 30);
    top.setForeground(Color.white);
    jug.setBounds(75, 50, 150, 20);
    jug.setForeground(Color.white);
    Km.setBounds(250, 50, 200, 20);
    Km.setForeground(Color.white);

    Reg.setBounds(350, 425, 100, 20);

    top1.setBounds(75, 65, 150, 20);
    top1.setForeground(Color.white);
    topk1.setBounds(250, 65, 200, 20);
    topk1.setForeground(Color.white);



    fond.setBounds(-5, -5, 525,525);


    Reg.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
             new Ventana_201314808();
            ventanat.setVisible(false);
        }
    });




    ventanat.setVisible(true);
}


}
