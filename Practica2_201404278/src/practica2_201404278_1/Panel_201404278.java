
package practica2_201404278_1;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static practica2_201404278_1.Main.Aleatorio;


public class Panel_201404278 extends JPanel implements KeyListener{
    
    ArrayList v;
    ArrayList aste= new ArrayList();//array para las naves enemigas
    
    //para hacer los movimientos de mi nave
    navaGrafica_201404278 nave;
    Coordenada_201404278 movimientoArr=new Coordenada_201404278(0,-25);
    Coordenada_201404278 movimientoAba=new Coordenada_201404278(0,25);
    Coordenada_201404278 movimientoNulo=new Coordenada_201404278(0,0);
    
    //para las naves enemigas, en este caso son 4 naves
    RectanguloGrafico_201404278 ast;
    RectanguloGrafico_201404278 ast1;
    RectanguloGrafico_201404278 ast2;
    RectanguloGrafico_201404278 ast3;
   
    int contadorAst=5;
    int contador=0;//para contar las balas que inpacten en la nave
    
    //para ir cambiando los puntos etc...
    textoGrafico_201404278 puntos;
    textoGrafico_201404278 vidas;
    textoGrafico_201404278 finall;
    textoGrafico_201404278 destruidas;
    textoGrafico_201404278 tiempo;
    
    //variables para los puntos y vidas
    int puntoss;
    int vidass=1;
    int nDestruidas;
    int nTiempo=120;
    
    boolean finJuego=true; //para parar el juego
    boolean finTiempo=true;//para parar el tiempo
    //para detener los items
    boolean iitem=true, iitem2=true, iitem3=true, iitem4=true, iitem5=true, iitem6=true, iitem7=true, iitem8=true, iitem9=true, iitem10=true, iitem11=true, iitem12=true, iitem13=true, iitem14=true;
    
    //variables para numeros aleatorios de items y posiciones 
    int itemSuma = (int) (Math.random() * 15) + 1;
    int itemResta=(int) (Math.random() * 15) + 1;
    
    int itemSuma2 = (int) (Math.random() * 15) + 1;
    int itemResta2=(int) (Math.random() * 15) + 1;
    
    int pos1=(int) (Math.random() * 1000) + 1;
    int pos2 = (int) (Math.random() * 400) + 1;
    
    int pos3=(int) (Math.random() * 1000) + 1;
    int pos4 = (int) (Math.random() * 400) + 1;
    
    int pos5=(int) (Math.random() * 1000) + 1;
    int pos6 = (int) (Math.random() * 400) + 1;
    
    int pos7=(int) (Math.random() * 1000) + 1;
    int pos8 = (int) (Math.random() * 400) + 1;
    
    int pos9=(int) (Math.random() * 1000) + 1;
    int pos10 = (int) (Math.random() * 400) + 1;
    
    int pos11=(int) (Math.random() * 1000) + 1;
    int pos12 = (int) (Math.random() * 400) + 1;
    
    int pos13=(int) (Math.random() * 1000) + 1;
    int pos14 = (int) (Math.random() * 400) + 1;
    
    int pos15=(int) (Math.random() * 1000) + 1;
    int pos16 = (int) (Math.random() * 400) + 1;
    
    int pos17=(int) (Math.random() * 1000) + 1;
    int pos18 = (int) (Math.random() * 400) + 1;
    
    int pos19=(int) (Math.random() * 1000) + 1;
    int pos20 = (int) (Math.random() * 400) + 1;
    
    int pos21=(int) (Math.random() * 1000) + 1;
    int pos22 = (int) (Math.random() * 400) + 1;
    
    int pos23=(int) (Math.random() * 1000) + 1;
    int pos24 = (int) (Math.random() * 400) + 1;
    
    int pos25=(int) (Math.random() * 1000) + 1;
    int pos26 = (int) (Math.random() * 400) + 1;
    
    int pos27=(int) (Math.random() * 1000) + 1;
    int pos28 = (int) (Math.random() * 400) + 1;
    
    
    public Panel_201404278(ArrayList vectordeO){
        
        this.v=vectordeO;
        this.addKeyListener(this);
        setFocusable(true);
    }    
    
    public void paint(Graphics g){
        
        Dimension d=getSize();
        
        Image imagen=createImage(d.width,d.height);
        
        Graphics buff=imagen.getGraphics();
        
        dibujable_201404278 dib;
        for (int i = 0; i < v.size(); i++) {
            
            dib=(dibujable_201404278)v.get(i);
            dib.dibujar(buff);
            
        }
        
        g.drawImage(imagen, 0, 0, null);
        
    }
    
    @Override
    public void update(Graphics g){
        paint(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
        int tecla=e.getKeyCode();
        
        if (tecla==KeyEvent.VK_UP) {
            
            if(nave.getY()>=0){
                this.nave.mover(movimientoArr);
            }
            
            
        }
        if (tecla==KeyEvent.VK_DOWN) {
            
            if (nave.getY()<=350) {
                this.nave.mover(movimientoAba);
            }
            
            
        }
        if (tecla==KeyEvent.VK_SPACE) {
            
            circuloGrafico_201404278 bala=nave.Bala();
            nave.balas.add(bala);
            v.add(bala);
            sonidos_201404278.explosion.play();
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int tecla=e.getKeyCode();
        
        if (tecla==KeyEvent.VK_UP) {
            
            
           this.nave.mover(movimientoNulo);
            
        }
        if (tecla==KeyEvent.VK_DOWN) {
            
           this.nave.mover(movimientoNulo);
            
        }
       
        
     }
    
    public void refNave(navaGrafica_201404278 n){
        
        this.nave=n;
        
    }
    
    public void refAst(RectanguloGrafico_201404278 a,RectanguloGrafico_201404278 b,RectanguloGrafico_201404278 c,RectanguloGrafico_201404278 d){
        
        aste.add(a);
        aste.add(b);
        aste.add(c);
        aste.add(d);
       
        
    }
    
    //estos metodos son para ir cambiando los puntos etc...
    public void refPuntos(textoGrafico_201404278 a){
        
        this.puntos=a;
        
    }
    
    public void refVidas(textoGrafico_201404278 b){
        
        this.vidas=b;
        
    }
    public void refFinal(textoGrafico_201404278 c){
        
        this.finall=c;
        
    }
    public void refDestruidas(textoGrafico_201404278 d){
        
        this.destruidas=d;
        
    }
    public void refTiempo(textoGrafico_201404278 e){
        
        this.tiempo=e;
        
    }
    
    public void tiempo(){
        
        new Thread(){
            public void run(){
                
            //item1 resta
             Coordenada_201404278 cor1=new Coordenada_201404278(pos1,pos2);
             itemsGrafico_201404278 item1=new itemsGrafico_201404278(cor1,90,90,Color.BLACK);
             
             //item12 suma
             Coordenada_201404278 cor2=new Coordenada_201404278(pos3,pos4);
             itemsGrafico2_201404278 item2=new itemsGrafico2_201404278(cor2,90,90,Color.BLACK);
             
             //item3 resta
             Coordenada_201404278 cor3=new Coordenada_201404278(pos5,pos6);
             itemsGrafico_201404278 item3=new itemsGrafico_201404278(cor3,90,90,Color.BLACK);
             
             //item4 suma
             Coordenada_201404278 cor4=new Coordenada_201404278(pos7,pos8);
             itemsGrafico2_201404278 item4=new itemsGrafico2_201404278(cor4,90,90,Color.BLACK);
               
             //item5 resta
             Coordenada_201404278 cor5=new Coordenada_201404278(pos9,pos10);
             itemsGrafico_201404278 item5=new itemsGrafico_201404278(cor5,90,90,Color.BLACK);
             
             //item6 suma
             Coordenada_201404278 cor6=new Coordenada_201404278(pos11,pos12);
             itemsGrafico2_201404278 item6=new itemsGrafico2_201404278(cor6,90,90,Color.BLACK);
             
             //item7 resta
             Coordenada_201404278 cor7=new Coordenada_201404278(pos13,pos14);
             itemsGrafico_201404278 item7=new itemsGrafico_201404278(cor7,90,90,Color.BLACK);
             
             //item8 suma
             Coordenada_201404278 cor8=new Coordenada_201404278(pos15,pos16);
             itemsGrafico2_201404278 item8=new itemsGrafico2_201404278(cor8,90,90,Color.BLACK);
             
             //item9 resta
             Coordenada_201404278 cor9=new Coordenada_201404278(pos17,pos18);
             itemsGrafico_201404278 item9=new itemsGrafico_201404278(cor9,90,90,Color.BLACK);
             
             //item10 suma
             Coordenada_201404278 cor10=new Coordenada_201404278(pos19,pos20);
             itemsGrafico2_201404278 item10=new itemsGrafico2_201404278(cor10,90,90,Color.BLACK);
               
             //item11 resta
             Coordenada_201404278 cor11=new Coordenada_201404278(pos21,pos22);
             itemsGrafico_201404278 item11=new itemsGrafico_201404278(cor11,90,90,Color.BLACK);
             
             //item12 suma
             Coordenada_201404278 cor12=new Coordenada_201404278(pos23,pos24);
             itemsGrafico2_201404278 item12=new itemsGrafico2_201404278(cor12,90,90,Color.BLACK);
             
             //item13 resta
             Coordenada_201404278 cor13=new Coordenada_201404278(pos25,pos26);
             itemsGrafico_201404278 item13=new itemsGrafico_201404278(cor13,90,90,Color.BLACK);
             
             //item14 suma
             Coordenada_201404278 cor14=new Coordenada_201404278(pos27,pos28);
             itemsGrafico2_201404278 item14=new itemsGrafico2_201404278(cor14,90,90,Color.BLACK);
             
                while(finTiempo){
                
                    try{
                        sleep(1000);
                    }catch(Exception e){
                        
                    }
           nTiempo--;
            tiempo.setColor(Color.BLACK);
            String nuevoT=""+nTiempo;
            textoGrafico_201404278 NT=new textoGrafico_201404278(nuevoT,Color.RED,2375,1050);
            NT.setSize(35);
            tiempo=NT;
            v.add(tiempo);
           
            //if para que me salga el item en cierto intervalo
                    if (nTiempo==(itemSuma+100)) {
                        
                        v.add(item1);
                        item1();
                 }
                    if (nTiempo==(itemResta+100)) {
                        
                        v.add(item2);
                        item2();
                 }
                    if (nTiempo==(itemSuma+85)) {
                        
                        v.add(item3);
                        item3();
                 }
                    if (nTiempo==(itemResta+85)) {
                        
                        v.add(item4);
                        item4();
                 }
                     if (nTiempo==(itemSuma2+70)) {
                        
                        v.add(item5);
                        item5();
                 }
                    if (nTiempo==(itemResta2+70)) {
                        
                        v.add(item6);
                        item6();
                 }
                     if (nTiempo==(itemSuma2+55)) {
                        
                        v.add(item7);
                        item7();
                 }
                    if (nTiempo==(itemResta2+55)) {
                        
                        v.add(item8);
                        item8();
                 }
                     if (nTiempo==(itemSuma+40)) {
                        
                        v.add(item9);
                        item9();
                 }
                    if (nTiempo==(itemResta+40)) {
                        
                        v.add(item10);
                        item10();
                 }
                    if (nTiempo==(itemSuma2+25)) {
                        
                        v.add(item11);
                        item11();
                 }
                    if (nTiempo==(itemResta2+25)) {
                        
                        v.add(item12);
                        item12();
                 }
                     if (nTiempo==(itemSuma2+10)) {
                        
                        v.add(item13);
                        item13();
                 }
                    if (nTiempo==(itemResta2+10)) {
                        
                        v.add(item14);
                        item14();
                 }
                   
                    //este if es para que me borre el item1 cuando la bala impacte con el item1 dicho
                    if (iitem==false) {
                        item1.setX(2000);
                        v.remove(item1);
                    }
                   if (iitem2==false) {
                       item12.setX(2000);
                        v.remove(item2);
                    }
                   if (iitem3==false) {
                       item3.setX(2000);
                        v.remove(item3);
                    }
                   if (iitem4==false) {
                       item4.setX(2000);
                        v.remove(item4);
                    }
                   if (iitem5==false) {
                       item5.setX(2000);
                        v.remove(item5);
                    }
                   if (iitem6==false) {
                       item6.setX(2000);
                        v.remove(item6);
                    }
                   if (iitem7==false) {
                       item7.setX(2000);
                        v.remove(item7);
                    }
                   if (iitem8==false) {
                       item8.setX(2000);
                        v.remove(item8);
                    }
                   if (iitem9==false) {
                       item9.setX(2000);
                        v.remove(item9);
                    }
                   if (iitem10==false) {
                       item10.setX(2000);
                        v.remove(item10);
                    }
                   if (iitem11==false) {
                       item11.setX(2000);
                        v.remove(item11);
                    }
                   if (iitem12==false) {
                       item12.setX(2000);
                        v.remove(item12);
                    }
                   if (iitem13==false) {
                       item13.setX(2000);
                        v.remove(item13);
                    }
                   if (iitem14==false) {
                       item14.setX(2000);
                        v.remove(item14);
                    }
  
                    if (nTiempo<=0) {
                        finTiempo=false;
                    }
            }
            }
            
        }.start();
    }
    
    //hilo para el item1
    public void item1(){
        
        new Thread(){
            public void run(){
                
            // if (nTiempo==(itemSuma+100)) {
                        
                        
                 
                        while(iitem){
                           
                             Coordenada_201404278 cor1=new Coordenada_201404278(pos1,pos2);
                itemsGrafico_201404278 item1=new itemsGrafico_201404278(cor1,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item1.getX(),item1.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item1.getX(),item1.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item1.getX(),item1.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss-30;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem=false;
                            }
                        // }
                     }
             }
                 }
        }.start();
    }
    
    //hilo para el item2
    public void item2(){
        
        new Thread(){
            public void run(){
                
            // if (nTiempo==(itemResta+100)) {
                        
                       
                 
                        while(iitem2){
                           
                Coordenada_201404278 cor2=new Coordenada_201404278(pos3,pos4);
                itemsGrafico_201404278 item2=new itemsGrafico_201404278(cor2,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item2.getX(),item2.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item2.getX(),item2.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item2.getX(),item2.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss+50;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem2=false;
                            }
                         }
                       // }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item3
    public void item3(){
        
        new Thread(){
            public void run(){
                
            // if (nTiempo==(itemSuma+85)) {
                        while(iitem3){
                           
                             Coordenada_201404278 cor1=new Coordenada_201404278(pos5,pos6);
                itemsGrafico_201404278 item3=new itemsGrafico_201404278(cor1,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item3.getX(),item3.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item3.getX(),item3.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item3.getX(),item3.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss-30;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem3=false;
                            }
                         }
                      //  }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item4
    public void item4(){
        
        new Thread(){
            public void run(){
                
            // if (nTiempo==(itemResta+85)) {
                        while(iitem4){
                           
                Coordenada_201404278 cor2=new Coordenada_201404278(pos7,pos8);
                itemsGrafico_201404278 item4=new itemsGrafico_201404278(cor2,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item4.getX(),item4.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item4.getX(),item4.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item4.getX(),item4.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss+50;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem4=false;
                            }
                         }
                      //  }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item5
    public void item5(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem5){
                           
                             Coordenada_201404278 cor1=new Coordenada_201404278(pos9,pos10);
                itemsGrafico_201404278 item5=new itemsGrafico_201404278(cor1,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item5.getX(),item5.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item5.getX(),item5.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item5.getX(),item5.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss-30;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem5=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item6
    public void item6(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem6){
                           
                Coordenada_201404278 cor2=new Coordenada_201404278(pos11,pos12);
                itemsGrafico_201404278 item6=new itemsGrafico_201404278(cor2,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item6.getX(),item6.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item6.getX(),item6.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item6.getX(),item6.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss+50;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem6=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item7
    public void item7(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem7){
                           
                             Coordenada_201404278 cor1=new Coordenada_201404278(pos13,pos14);
                itemsGrafico_201404278 item7=new itemsGrafico_201404278(cor1,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item7.getX(),item7.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item7.getX(),item7.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item7.getX(),item7.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss-30;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem7=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item8
    public void item8(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem8){
                           
                Coordenada_201404278 cor2=new Coordenada_201404278(pos15,pos16);
                itemsGrafico_201404278 item8=new itemsGrafico_201404278(cor2,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item8.getX(),item8.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item8.getX(),item8.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item8.getX(),item8.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss+50;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem8=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item9
    public void item9(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem9){
                           
                             Coordenada_201404278 cor1=new Coordenada_201404278(pos17,pos18);
                itemsGrafico_201404278 item9=new itemsGrafico_201404278(cor1,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item9.getX(),item9.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item9.getX(),item9.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item9.getX(),item9.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss-30;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem9=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item10
    public void item10(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem10){
                           
                Coordenada_201404278 cor2=new Coordenada_201404278(pos19,pos20);
                itemsGrafico_201404278 item10=new itemsGrafico_201404278(cor2,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item10.getX(),item10.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item10.getX(),item10.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item10.getX(),item10.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss+50;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem10=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item11
    public void item11(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem11){
                           
                             Coordenada_201404278 cor1=new Coordenada_201404278(pos21,pos22);
                itemsGrafico_201404278 item11=new itemsGrafico_201404278(cor1,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item11.getX(),item11.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item11.getX(),item11.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item11.getX(),item11.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss-30;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem11=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item12
    public void item12(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem12){
                           
                Coordenada_201404278 cor2=new Coordenada_201404278(pos23,pos24);
                itemsGrafico_201404278 item12=new itemsGrafico_201404278(cor2,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item12.getX(),item12.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item12.getX(),item12.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item12.getX(),item12.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss+50;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem12=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item13
    public void item13(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem13){
                           
                             Coordenada_201404278 cor1=new Coordenada_201404278(pos25,pos26);
                itemsGrafico_201404278 item13=new itemsGrafico_201404278(cor1,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item13.getX(),item13.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item13.getX(),item13.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item13.getX(),item13.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss-30;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem13=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    //hilo para el item14
    public void item14(){
        
        new Thread(){
            public void run(){
                
             
                        while(iitem14){
                           
                Coordenada_201404278 cor2=new Coordenada_201404278(pos27,pos28);
                itemsGrafico_201404278 item14=new itemsGrafico_201404278(cor2,100,100,Color.BLACK);
                
                         for (int i = 0; i < nave.balas.size(); i++) {
            
                         circuloGrafico_201404278 balaa=(circuloGrafico_201404278)nave.balas.get(i);
                         Coordenada_201404278 Corbalaa=new Coordenada_201404278(balaa.getX(),balaa.getY());
                         Coordenada_201404278 Derechaa=new Coordenada_201404278(item14.getX(),item14.getY()+80);
                Coordenada_201404278 Izquierdaaa=new Coordenada_201404278(item14.getX(),item14.getY()-80);
                Coordenada_201404278 medioa=new Coordenada_201404278(item14.getX(),item14.getY());
                
                             if (Corbalaa.getY()>Izquierdaaa.getY()&&Corbalaa.getY()<Derechaa.getY()&&Corbalaa.getX()<medioa.getX()&&Corbalaa.getX()+75>medioa.getX()) {
                                    //me vuelve a pintar el nuevo punteo
                                    puntoss=puntoss+50;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos); 
                                 
                                balaa.pintar(Color.BLACK);
                                balaa.setX(2000);
                                nave.balas.remove(balaa);
                                
                                 iitem14=false;
                            }
                         }
                     }  
                 }
        }.start();
    }
    
    public void Colisiones(){
        
        for (int i = 0; i < nave.balas.size(); i++) {
            
            circuloGrafico_201404278 bala=(circuloGrafico_201404278)nave.balas.get(i);
            
            for (int j = 0; j < aste.size(); j++) {
                
                RectanguloGrafico_201404278 astee=(RectanguloGrafico_201404278)aste.get(j);
                
                Coordenada_201404278 Corbala=new Coordenada_201404278(bala.getX(),bala.getY());
                
                Coordenada_201404278 Derecha=new Coordenada_201404278(astee.getX(),astee.getY()+80);
                Coordenada_201404278 Izquierda=new Coordenada_201404278(astee.getX(),astee.getY()-80);
                Coordenada_201404278 medio=new Coordenada_201404278(astee.getX(),astee.getY());
                
                //if para que si la bala pega en una de las naves enemigas
                if (Corbala.getY()>Izquierda.getY()&&Corbala.getY()<Derecha.getY()&&Corbala.getX()<medio.getX()&&Corbala.getX()+75>medio.getX()) {
                     
                    bala.pintar(Color.BLACK);
                    bala.setX(2000);
                    
                    nave.balas.remove(bala);
                    
                    contador+=1;
                    
                                //if con el contador para que cuando la bala pegue tres veces
                                if (contador==3) {
                                    astee.pintar(Color.BLACK);
                                    astee.setX(2000);
                                    aste.remove(astee);
                                    contadorAst --;
                                   
                                    //aqui se van sumando los puntos por nave destruida
                                    puntoss+=35;
                                    puntos.setColor(Color.BLACK);
                                    String nuevoPunto=""+puntoss;
                                    textoGrafico_201404278 Npuntos=new textoGrafico_201404278(nuevoPunto,Color.RED,1800,1050);
                                    Npuntos.setSize(35);
                                    puntos=Npuntos;
                                    v.add(puntos);
                                    
                                    //aqui se van sumando las naves destruidas
                                    nDestruidas+=1;
                                    destruidas.setColor(Color.BLACK);
                                    String nuevoDestruida=""+nDestruidas;
                                    textoGrafico_201404278 Ndestruida=new textoGrafico_201404278(nuevoDestruida,Color.RED,1310,1050);
                                    Ndestruida.setSize(35);
                                    destruidas=Ndestruida;
                                    v.add(destruidas);
                                    contador=0;
                                }
                }
               
                //if para que si una bala pega en mi nave
                if (medio.getX()>1090&&medio.getX()<1200&&(nave.getY()<medio.getY())&&(nave.cor2.getY()>medio.getY())) {//rango donde se encuentra mi nave
                   
                    //puntoss=puntoss-1;
                    vidass--;
                    //String nuevoPunteo=""+puntoss;
                    String nuevaVida=""+vidass;
                    vidas.setColor(Color.BLACK);
                    //puntos.setColor(Color.WHITE);
                    textoGrafico_201404278 nVidas=new textoGrafico_201404278(nuevaVida,Color.RED,350,1050);
                    nVidas.setSize(35);
                    vidas=nVidas;
                   
                    v.add(vidas);
                    aste.remove(astee);
                    astee.setX(8000);
                    contadorAst--;
                 }
                
                //if por si una nave llega al final de mi ventana
                if (medio.getX()>=1190) {//rango donde se encuentra mi nave
                   
                    //puntoss=puntoss-1;
                    vidass--;
                    //String nuevoPunteo=""+puntoss;
                    String nuevaVida=""+vidass;
                    vidas.setColor(Color.BLACK);
                    //puntos.setColor(Color.WHITE);
                    textoGrafico_201404278 nVidas=new textoGrafico_201404278(nuevaVida,Color.RED,350,1050);
                    nVidas.setSize(35);
                    vidas=nVidas;
                   
                    v.add(vidas);
                    aste.remove(astee);
                    astee.setX(8000);
                    contadorAst--;
                 }
               
            }
        }
        
    }
    
    public void iniciar(){
        
        while(finJuego){
            
            try{
                if(!nave.balas.isEmpty()){ //diferente de vacio
                    nave.Ciclo();
                }
                
                 Thread.sleep(50);
                 
                 int i;
                 for(i=0;i<aste.size();i++){
                    RectanguloGrafico_201404278 rect= (RectanguloGrafico_201404278)aste.get(i);
                    rect.Ciclo();
                    
                     if (rect.getX()>=1200) {//hasta donde llega la nave
                        int rango=Aleatorio(350,50);
                        int rango2=Aleatorio(700,50);
                        rect.setX(-300);
                        rect.setY(rango);
                     }
                     
                    
                 }
                 
                 if (contadorAst<5) {
                    int rango=Aleatorio(350,50);
                    int rango2=Aleatorio(700,50);
                    Coordenada_201404278 inicio=new Coordenada_201404278(rango2*-1,rango);
                    RectanguloGrafico_201404278 nuevo=new RectanguloGrafico_201404278(inicio,100,100,Color.BLACK);
                    aste.add(nuevo);
                    v.add(nuevo);
                    nuevo.Ciclo();
                    contadorAst++;
                }
                 
                 if (vidass<=0) {
                     
                     finJuego=false;
                     finTiempo=false;
                     v.add(finall);
                     JOptionPane.showMessageDialog(null, "EL JUEGO A FINALIZADO! \nSe a quedado sin vidas! \nSus numeros son: \nPuntos: "+puntoss+"\nNaves Destruidas: "+nDestruidas);
                    
                }
                 
                if (nTiempo==0) {
                     
                     finJuego=false;
                     v.add(finall);
                     JOptionPane.showMessageDialog(null, "EL JUEGO A FINALIZADO! \nSe acabo el tiempo! \nSus numeros son: \nPuntos: "+puntoss+"\nNaves Destruidas: "+nDestruidas);
                    
                }
                 
                 Colisiones();
                 
                 
            }catch(InterruptedException err){
               
                System.out.println(err);
            }
            
          repaint();  
        }
        
    }
    
}
