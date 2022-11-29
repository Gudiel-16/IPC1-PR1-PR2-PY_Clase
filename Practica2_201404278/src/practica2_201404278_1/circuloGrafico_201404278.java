
package practica2_201404278_1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class circuloGrafico_201404278 extends circulo_201404278 implements dibujable_201404278{

    Color color;
    
    //para pasar imagen a bala
    JLabel aa;
    ImageIcon dibujo=new ImageIcon(new ImageIcon(getClass().getResource("/img_201404278/bola.gif")).getImage());
    
    public circuloGrafico_201404278(Coordenada_201404278 cor, float radio, Color uncolor){
        
        super(cor,radio);
        this.color=uncolor;
        aa=new JLabel("");
    }
    
    @Override
    public void dibujar(Graphics dw) {
        
        dw.setColor(color);
        dw.fillOval((int)(this.getX()-this.getRadio()), (int)(this.getY()-this.getRadio()), (int)(2*this.getRadio()), (int)(2*this.getRadio()));
        
        dw.drawImage(dibujo.getImage(),(int)(this.getX()-this.getRadio()),(int)(this.getY()-this.getRadio()),(int)(2*this.getRadio()), (int)(2*this.getRadio()),null);
        aa.setIcon(dibujo);
        
    }
    
    void pintar(Color a){
        this.color=a;
    }
    
    
}
