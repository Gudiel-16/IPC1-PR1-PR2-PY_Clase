
package practica2_201404278_1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;



public class itemsGrafico2_201404278 extends items_201404278 implements dibujable_201404278 {

    Color color;
    ImageIcon dibujo=new ImageIcon(new ImageIcon(getClass().getResource("/img_201404278/pildoSuma.png")).getImage());
    
    public itemsGrafico2_201404278(Coordenada_201404278 cor,float x, float y, Color uncolor){
        
        super(cor,x,y);
        this.color=uncolor;
        
    }
    
    @Override
    public void dibujar(Graphics dw) {
        
        dw.setColor(color);
        dw.fillRect((int)this.getX(),(int) this.getY(),(int) this.Getlado(1), (int)this.Getlado(2));
        
        dw.drawImage(dibujo.getImage(),(int)this.getX(),(int) this.getY(),(int) this.Getlado(1), (int)this.Getlado(2),null);
        
        
    }
    
    void pintar(Color a){
        this.color=a;
    }
    
}

