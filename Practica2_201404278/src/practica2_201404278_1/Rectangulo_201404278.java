
package practica2_201404278_1;


public class Rectangulo_201404278 extends Coordenada_201404278{
    
    private float lado1;
    private float lado2;
    
    public Rectangulo_201404278(){
        
        super();
        this.lado1=0;
        this.lado2=0;
        
    }
    
    public Rectangulo_201404278(Coordenada_201404278 cor,float x,float y){
        
        super(cor);
        this.lado1=x;
        this.lado2=y;
    }
    
    public Rectangulo_201404278(Rectangulo_201404278 nvc){
        
        super(nvc.getX(),nvc.getY());
        this.lado1=nvc.lado1;
        this.lado2=nvc.lado2;
        
    }
    
    public float Getlado(int lado){
        if (lado==1) {
            
            return this.lado1;
            
        }
        if (lado==2) {
            return this.lado2;
        }
        if (lado!=1&&lado!=2) {
            return 0;
        }
        return 0;
    }
    
    
    
    
}
