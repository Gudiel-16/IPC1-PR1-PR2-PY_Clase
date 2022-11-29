
package practica2_201404278_1;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static int Aleatorio(int max, int min){
        return (int)(Math.random()*(max-min));
    }
    
   
   public static void main(String[] args) {
      
        ventana_201404278 ventana=new ventana_201404278("Juego de naves");
        ArrayList ArregloDeObjetos=new ArrayList();
        
        /*Coordenada_201404278 cor2=new Coordenada_201404278(0,0);
        fondoGrafico_201404278 fondo=new fondoGrafico_201404278(cor2,1300,600,Color.BLACK);
        ArregloDeObjetos.add(fondo);*/
        
        textoGrafico_201404278 vidas=new textoGrafico_201404278("VIDAS:",Color.YELLOW,200,1050);
        vidas.setSize(35);
        ArregloDeObjetos.add(vidas);
        
        textoGrafico_201404278 Nvida=new textoGrafico_201404278("1",Color.red,355,1050);
        Nvida.setSize(35);
        ArregloDeObjetos.add(Nvida);
        
        textoGrafico_201404278 navesED=new textoGrafico_201404278("NAVES DESTRUIDAS:",Color.YELLOW,900,1050);
        navesED.setSize(35);
        ArregloDeObjetos.add(navesED);
        
        textoGrafico_201404278 nnavesED=new textoGrafico_201404278("0",Color.red,1310,1050);
        nnavesED.setSize(35);
        ArregloDeObjetos.add(nnavesED);
        
        textoGrafico_201404278 punteo=new textoGrafico_201404278("PUNTOS:",Color.YELLOW,1580,1050);
        punteo.setSize(35);
        ArregloDeObjetos.add(punteo);
        
        textoGrafico_201404278 puntaje=new textoGrafico_201404278("0",Color.red,1800,1050);
        puntaje.setSize(35);
        ArregloDeObjetos.add(puntaje);
        
        textoGrafico_201404278 tiempo=new textoGrafico_201404278("TIEMPO:",Color.YELLOW,2125,1050);
        tiempo.setSize(35);
        ArregloDeObjetos.add(tiempo);
        
        textoGrafico_201404278 nTiempo=new textoGrafico_201404278("120",Color.red,2375,1050);
        nTiempo.setSize(35);
        ArregloDeObjetos.add(nTiempo);
        
        textoGrafico_201404278 textoFinal=new textoGrafico_201404278("FIN DE JUEGO",Color.red,1220,550);
        textoFinal.setSize(150);
       
        Coordenada_201404278 cor3=new Coordenada_201404278(1175,300);
        Coordenada_201404278 cor4=new Coordenada_201404278(1125,375);
        Coordenada_201404278 cor5=new Coordenada_201404278(1225,375);
        navaGrafica_201404278 nava=new navaGrafica_201404278(cor3,cor4,cor5,Color.BLACK);
        
        int rango=Aleatorio(350,50);
        Coordenada_201404278 salida=new Coordenada_201404278(-10,rango);
        RectanguloGrafico_201404278 ast=new RectanguloGrafico_201404278(salida,100,100,Color.BLACK);
        int rango1=Aleatorio(350,50);
        Coordenada_201404278 salida1=new Coordenada_201404278(-500,rango1);
        RectanguloGrafico_201404278 ast1=new RectanguloGrafico_201404278(salida1,100,100,Color.BLACK);
        int rango2=Aleatorio(350,50);
        Coordenada_201404278 salida2=new Coordenada_201404278(-900,rango2);
        RectanguloGrafico_201404278 ast2=new RectanguloGrafico_201404278(salida2,100,100,Color.BLACK);
        int rango3=Aleatorio(350,50);
        Coordenada_201404278 salida3=new Coordenada_201404278(-1200,rango3);
        RectanguloGrafico_201404278 ast3=new RectanguloGrafico_201404278(salida3,100,100,Color.BLACK);
        
        ArregloDeObjetos.add(ast);
        ArregloDeObjetos.add(ast1);
        ArregloDeObjetos.add(ast2);
        ArregloDeObjetos.add(ast3);
        
        ArregloDeObjetos.add(nava);
        
        
        Panel_201404278 panel=new Panel_201404278(ArregloDeObjetos);
        
        panel.refNave(nava);
        panel.refAst(ast, ast1, ast2, ast3);
        panel.refPuntos(puntaje);
        panel.refFinal(textoFinal);
        panel.refVidas(Nvida);
        panel.refDestruidas(nnavesED);
        panel.refTiempo(nTiempo);
        ventana.add(panel);
        ventana.setSize(1300,600);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setBackground(Color.BLACK);
        
        //llamada de los hilos
        panel.tiempo();
        panel.iniciar();
       
    }
    
}
