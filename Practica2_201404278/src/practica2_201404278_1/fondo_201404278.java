
package practica2_201404278_1;

public class fondo_201404278 extends Coordenada_201404278{
    
    private float lado11;
    private float lado12;
    
    public fondo_201404278(){
        
        super();
        this.lado11=0;
        this.lado12=0;
        
    }
    
    public fondo_201404278(Coordenada_201404278 cor,float x,float y){
        
        super(cor);
        this.lado11=x;
        this.lado12=y;
    }
    
    public fondo_201404278(fondo_201404278 nvc){
        
        super(nvc.getX(),nvc.getY());
        this.lado11=nvc.lado11;
        this.lado12=nvc.lado12;
        
    }
    
    public float Getlado(int lado){
        if (lado==1) {
            
            return this.lado11;
            
        }
        if (lado==2) {
            return this.lado12;
        }
        if (lado!=1&&lado!=2) {
            return 0;
        }
        return 0;
    }
    
    
    
    
}

