
package practica2_201404278_1;

public class items2_201404278 extends Coordenada_201404278{
    
    private float lado5;
    private float lado6;
    
    public items2_201404278(){
        
         super();
        this.lado5=0;
        this.lado6=0;
        
    }
    
    public items2_201404278(Coordenada_201404278 cor,float x,float y){
        
        super(cor);
        this.lado5=x;
        this.lado6=y;
    }
    
    public items2_201404278(items2_201404278 nvc){
        
        super(nvc.getX(),nvc.getY());
        this.lado5=nvc.lado5;
        this.lado6=nvc.lado6;
        
    }
    
    public float Getlado(int lado){
        if (lado==1) {
            
            return this.lado5;
            
        }
        if (lado==2) {
            return this.lado6;
        }
        if (lado!=1&&lado!=2) {
            return 0;
        }
        return 0;
    }
}

