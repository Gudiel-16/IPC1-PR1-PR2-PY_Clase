
package practica2_201404278_1;


public class circulo_201404278 extends Coordenada_201404278{
    
    private float radio;
    
    public circulo_201404278(){
        super();
        
        this.radio=0;
        
    }
    
    public circulo_201404278(Coordenada_201404278 nvc, float r){
        
        super(nvc);
        this.radio=r;
        
    }
    
    public circulo_201404278(circulo_201404278 cir){
        
        super(cir);
        this.radio=cir.radio;
        
    }
    
    public float getRadio(){
        return this.radio;
    }
    
    public void setRadio(float r){
        this.radio=r;
    }
    
    public Coordenada_201404278 getCentro(){
        Coordenada_201404278 nva= new Coordenada_201404278(this.getX(),this.getY());
        return nva;
   }
    
}
