package Paq_201314808;

/**
 * Created by Leslie on 2/04/14.
 */
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;
import java.awt.event.*;
import javax.swing.*;


public class Grafico_201314808 extends JPanel  implements Runnable,ActionListener, KeyListener{

    private Timer timer;
    int xa = 0;
    int x = 210;

    BufferedImage nav, nit, obs, comb, plan;

    int py1 = 20;
    int py2 = -70;
    int py3 = 20;
    int py4 = -160;
    int py5 = -340;
    int py6 = -700;
    int py7 = -970;

    int pyn1 = -70;
    int pyn2 = -160;

    int pyc1 = 20;
    int pyc2 = -340;
    int pyc3 = -70;

    int pts = 1000;
    int combu = 1000;
    int km = 0;

    int vel = 450;

    JLabel getkm = new JLabel();
    JLabel getpt = new JLabel();
    JLabel getgas = new JLabel();


    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            xa = 100;
        }
        if (key == KeyEvent.VK_LEFT) {
            xa = -100;
        }}
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            xa = 0;
        }
        if (key == KeyEvent.VK_LEFT) {
            xa = 0;
        }}

    public void actionPerformed(ActionEvent e){
        if (x + xa> 500 || x + xa < 10){
            xa = 0;}
        x = x + xa;
        repaint();
    }

    public Grafico_201314808(){

        setSize(550, 600);
        addKeyListener(this);
        setFocusable(true);
        timer = new Timer(120, this);
        timer.start();
    }

        public void paint(Graphics g){
            update(g);    }

    public void update(Graphics g){
        // centro
        g.setColor(Color.BLACK);
        g.fillRect(100, 0, 300, 500);
        //orillas
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 100, 500);
        g.fillRect(400, 0, 100, 500);

        //lineas blancas
        g.setColor(Color.white);
        g.drawLine(100, 0, 100, 500);
        g.drawLine(102, 0, 102, 500);
        g.drawLine(402, 0, 402, 500);
        g.drawLine(400, 0, 400, 500);


        try {
            //da las rutas
            URL Ruti1 = getClass().getResource("nav.png");
            URL Ruti2 = getClass().getResource("obs.png");
            URL Ruti3 = getClass().getResource("nit.png");
            URL Ruti4 = getClass().getResource("comb.png");
            URL Ruti5 = getClass().getResource("plan.png");

           //incluye la objetos
            nav = ImageIO.read(Ruti1);
            obs = ImageIO.read(Ruti2);
            nit = ImageIO.read(Ruti3);
            comb = ImageIO.read(Ruti4);
            plan = ImageIO.read(Ruti5);
        }
        catch (Exception objError) {
            System.out.println("Error al cargar");
        }

        // imprime combustible
        g.drawImage(comb, 10, pyc1, null);
        g.drawImage(comb, 210, pyc2, null );
        g.drawImage(comb, 410, pyc3, null);
        // imprime nitros
        g.drawImage(nit, 110, pyn1, null);
        g.drawImage(nit, 310, pyn2, null);
        // imprime obstaculos
        g.drawImage(obs, 110, py1, null);
        g.drawImage(obs, 210, py2, null );
        g.drawImage(obs, 310, py3, null);
        g.drawImage(obs, 10, py4, null);
        g.drawImage(obs, 410, py5, null);
        // imprime planetas
        g.drawImage(plan, 110, py6, null);
        g.drawImage(plan, 310, py7, null);


        //nave
        g.drawImage(nav , x, 380, null);

        repaint();
    }




    public void run(){
      while(true){
          if(combu <= 0){
              getgas.setText("0");

              GameOver_201314808 v = new GameOver_201314808();
              v.al = String.valueOf(km);

              break;
          }else{
          try{
              Thread.sleep(vel);}


          catch(InterruptedException ex){}

           //combustible y distancia recorrida
              combu = combu - 5;
              km = km + 10;
              pts = pts +1;
              getkm.setText(String.valueOf(km));
              getgas.setText(String.valueOf(combu));
              getpt.setText(String.valueOf(pts));

        //REPETICIONES
            // Repeticiones para obstaculos
          if(py1 > 380){py1 = -200;}else{py1=py1+45;}
          if(py2 > 380){py2 = -115;}else{py2=py2+45;}
          if(py3 > 380){py3= -295;}else{py3=py3+45;}
          if(py4 > 380){py4 = -470;}else{py4=py4+45;}
          if(py5 > 380){py5 = -310;}else{py5=py5+45;}
            // Repeticiones para combustible
          if(pyc1 != py4){if(pyc1 > 380){pyc1 = -610;}else{pyc1=pyc1+45;}}
          if(pyc2 != py2){if(pyc2 > 380){pyc2 = -160;}else{pyc2=pyc2+45;}}
          if(pyc3 != py5){if(pyc3 > 380){pyc3= -340;}else{pyc3=pyc3+45;}}
            // Repeticiones para nitro
          if(pyn1 != py1 && pyn1 != py6 ){if(pyn1 > 380){pyn1 = -880;}else{pyn1=pyn1+45;}}
          if(pyn2 != py3 && pyn2 != py7 ){if(pyn2 > 380){pyn2 = -790;}else{pyn2=pyn2+45;}}
             //Repeticiones para planetas
          if(py7 != py3 && py7 != pyn2){if(py7 > 380){py7 = -790;}else{py7=py7+45;}}
          if(py6 != py1 && py6 != pyn1){if(py6 > 380){py6 = -815;}else{py6=py6+45;}}


            //CONDICIONES
            // condiciones de obstaculos para restar puntos
          if(py1 == 380 && x == 110 ){pts = pts -100;}
          if(py2 == 380 && x == 210 ){pts = pts -100;}
          if(py3 == 380 && x == 310 ){pts = pts -100;}
          if(py4 == 380 && x == 10 ){pts = pts -100;}
          if(py5 == 380 && x == 410 ){pts = pts -100;}

         // condiciones de combustible para sumar combustible
          if(pyc1 == 380 && x == 110 ){combu = combu +150;}
          if(pyc2 == 380 && x == 210 ){combu = combu +150;}
          if(pyc3 == 380 && x == 310 ){combu = combu +150;}
         // condiciones de combustible morir si llega a planeta
              if(py6 == 380 && x == 110 ){combu = -1;}
              if(py7 == 380 && x == 310 ){combu = -1;}
         // condiciones de nitro para aumentar y regresar a la normalidad la velocidad
          if(pyn1 == 380 && x == 110 ){vel = 200;}}
          if(pyn1 == -70){vel = 450;}
          if(pyn2 == 380){if(x == 310 ){vel = 200;}}
          if(pyn2 == 20){vel = 450;}
            //condicion para disminuir la cantidad de puntos al usar los carriles laterales
          if(x == 10 || x == 410){combu = combu - 100;}
          }
      }
}



