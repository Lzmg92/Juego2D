package Paq_201314808;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import Paq_201314808.Ventanauser_201314808;
/**
 * Created by Leslie on 19/03/14.
 */
public class VentanaGame_201314808 extends JFrame {

    ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("allien.png"));
    Image imagen = icono.getImage();
    ImageIcon iconoEscalado = new ImageIcon(imagen.getScaledInstance(100,100,Image.SCALE_SMOOTH));

    ImageIcon icono2 = new javax.swing.ImageIcon(getClass().getResource("fond.png"));
    Image imagen2 = icono2.getImage();
    ImageIcon iconoEscalado2 = new ImageIcon(imagen2.getScaledInstance(195,475,Image.SCALE_SMOOTH));

    ImageIcon icono3 = new javax.swing.ImageIcon(getClass().getResource("blue.png"));
    Image imagen3 = icono3.getImage();
    ImageIcon iconoEscalado3 = new ImageIcon(imagen3.getScaledInstance(300,550,Image.SCALE_SMOOTH));

    JFrame game = new JFrame("Galactic Race");
    Grafico_201314808 nv = new Grafico_201314808();

    JLabel nom = new JLabel("Piloto:");
    //para nombre
    JLabel getd = new JLabel();

    JLabel allien = new JLabel(iconoEscalado);
    JLabel fond = new JLabel(iconoEscalado2);
    JLabel fond2 = new JLabel(iconoEscalado3);

    JLabel gas = new JLabel("Combustible:");
    JLabel km = new JLabel("Años Luz:");
    JLabel pt = new JLabel("Puntos");

    JButton rei = new JButton("Reiniciar");
    JButton Sal = new JButton("Salir");



    public VentanaGame_201314808(){

        game.setSize(700, 500);
        game.setLocationRelativeTo(this);
        game.setResizable(false);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.add(nv);
        game.add(fond);
        game.add(nom);
        nom.setFont(new Font("Arial Rounded", Font.BOLD, 17));
        nom.setForeground(Color.white);
        game.add(getd);
        getd.setFont(new Font("Eras Demi ITC", Font.BOLD, 15));
        getd.setForeground(Color.white);
        game.add(gas);
        gas.setFont(new Font("Arial Rounded", Font.BOLD, 17));
        gas.setForeground(Color.white);
        game.add(nv.getgas);
        nv.getgas.setFont(new Font("Eras Demi ITC", Font.BOLD, 15));
        nv.getgas.setForeground(Color.white);
        game.add(km);
        km.setFont(new Font("Arial Rounded", Font.BOLD, 17));
        km.setForeground(Color.white);
        game.add(nv.getkm);
        nv.getkm.setFont(new Font("Eras Demi ITC", Font.BOLD, 15));
        nv.getkm.setForeground(Color.white);
        game.add(pt);
        pt.setFont(new Font("Arial Rounded", Font.BOLD, 17));
        pt.setForeground(Color.white);
        game.add(nv.getpt);
        nv.getpt.setFont(new Font("Eras Demi ITC", Font.BOLD, 15));
        nv.getpt.setForeground(Color.white);
        game.getContentPane(). add(allien);
        game.add(rei);
        game.add(Sal);
        game.add(fond2);




        game.setLayout(null);
        nv.setBounds(200, 0, 500, 600);
        fond.setBounds(-3, -8, 200, 500);
        fond2.setBounds(-8, -8, 250, 550);

        nom.setBounds(30,35,100,20);
        getd.setBounds(65,60, 100,20);
        gas.setBounds(30, 95, 150, 20);
        nv.getgas.setBounds(65,120,150,20);
        km.setBounds(30,150,105,20);
        nv.getkm.setBounds(65,180,100,20);
        pt.setBounds(30,215,100,20);
        nv.getpt.setBounds(65,240,100,20);
        allien.setBounds(50, 270, 100, 100);
        rei.setBounds(50, 380, 100, 20);
        Sal.setBounds(50, 420, 100, 20);


        rei.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ventanauser_201314808 u = new Ventanauser_201314808();
                game.setVisible(false);
            }
        });

        Sal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        game.setVisible(true);



    }



}
