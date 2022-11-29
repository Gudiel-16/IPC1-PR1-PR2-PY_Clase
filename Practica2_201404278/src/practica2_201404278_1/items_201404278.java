
package practica2_201404278_1;


public class items_201404278 extends Coordenada_201404278{
    
    private float lado3;
    private float lado4;
    
    public items_201404278(){
        
         super();
        this.lado3=0;
        this.lado4=0;
        
    }
    
    public items_201404278(Coordenada_201404278 cor,float x,float y){
        
        super(cor);
        this.lado3=x;
        this.lado4=y;
    }
    
    public items_201404278(items_201404278 nvc){
        
        super(nvc.getX(),nvc.getY());
        this.lado3=nvc.lado3;
        this.lado4=nvc.lado4;
        
    }
    
    public float Getlado(int lado){
        if (lado==1) {
            
            return this.lado3;
            
        }
        if (lado==2) {
            return this.lado4;
        }
        if (lado!=1&&lado!=2) {
            return 0;
        }
        return 0;
    }
}
