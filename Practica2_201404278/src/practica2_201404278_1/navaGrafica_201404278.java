
package practica2_201404278_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.ImageIcon;

public class navaGrafica_201404278 extends nave_201404278 implements dibujable_201404278{

    Color color;
    
    ImageIcon dibujo=new ImageIcon(new ImageIcon(getClass().getResource("/img_201404278/nave.png")).getImage());
    
    
    public navaGrafica_201404278(Coordenada_201404278 a,Coordenada_201404278 b, Coordenada_201404278 c, Color uncolor){
        
        super(a,b,c);
        this.color=uncolor;
       
    }
    
    @Override
    public void dibujar(Graphics dw) {
        
        dw.setColor(color);
        int x[]={(int)this.getX(),(int)this.cor1.getX(),(int)this.cor2.getX()};
        int y[]={(int)this.getY(),(int)this.cor1.getY(),(int)this.cor2.getY()};
        
        Polygon p=new Polygon(x,y,3);
        dw.fillPolygon(p);
        
        dw.drawImage(dibujo.getImage(),(int)this.getX(),(int)this.getY()+15,115,115,null);
        
    }
    
    public void pintar(Graphics dw, Color uncolor) {
        
        dw.setColor(uncolor);
        int x[]={(int)this.getX(),(int)this.cor1.getX(),(int)this.cor2.getX()};
        int y[]={(int)this.getY(),(int)this.cor1.getY(),(int)this.cor2.getY()};
        
        Polygon p=new Polygon(x,y,3);
        dw.fillPolygon(p);
        
    }
    //metodo para las balas, aqui se manipula el tama;o y las coordenas de donde sale la bala
    public circuloGrafico_201404278 Bala(){
        
        Coordenada_201404278 salida= new Coordenada_201404278(this.getX(),this.getY()+70);
        circuloGrafico_201404278 bala=new circuloGrafico_201404278(salida,25,Color.black);
        return bala;
    }
    
    public void Ciclo(){
        
        for (int i = 0; i < this.balas.size(); i++) {//recorre el arreglo de balas
            circuloGrafico_201404278 y=(circuloGrafico_201404278)this.balas.get(i);
            float x=y.getX();
            y.setX(x-=5);
        }
    }
    
}
