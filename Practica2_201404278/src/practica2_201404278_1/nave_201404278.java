
package practica2_201404278_1;

import java.util.ArrayList;

public class nave_201404278 extends Coordenada_201404278{
    
    public Coordenada_201404278 cor1=new Coordenada_201404278();
    public Coordenada_201404278 cor2=new Coordenada_201404278();
    ArrayList balas=new ArrayList();
    
    public nave_201404278(){
        
        super();
        this.cor1.setX(0);
        this.cor1.setY(0);
        
        this.cor2.setX(0);
        this.cor2.setY(0);
                
    }
    
    public nave_201404278(Coordenada_201404278 a, Coordenada_201404278 b,Coordenada_201404278 c){
        
        super(a.getX(),a.getY());
        
        this.cor1.setX(b.getX());
        this.cor1.setY(b.getY());
        
        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
        
    }
    
    public nave_201404278(nave_201404278 c){
        
        super(c.getX(),c.getY());
        
        this.cor1.setX(c.getX());
        this.cor1.setY(c.getY());
        
        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
        
    }
    
    public void SetVertice(Coordenada_201404278 nva, int lado){
        
        if(lado==1){
            
            this.setX(nva.getX());
            this.setY(nva.getY());
        }
        if(lado==2){
            
            this.cor1.setX(nva.getX());
            this.cor1.setY(nva.getY());
        }
        if(lado==3){
         
            this.cor2.setX(nva.getX());
            this.cor2.setY(nva.getY());
        }
        
    }
    
    public void mover(Coordenada_201404278 nvaCor){
        
        SetVertice(this.suma(nvaCor),1);
        SetVertice(this.cor1.suma(nvaCor),2);
        SetVertice(this.cor2.suma(nvaCor),3);
        
    }
    
}
