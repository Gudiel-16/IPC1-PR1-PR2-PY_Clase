
package practica2_201404278_1;


public class Coordenada_201404278 {
    
    private float x;
    private float y;
    
    public Coordenada_201404278(){
        
        this.x=0;
        this.y=0;
        
    }
    
    public Coordenada_201404278(float x, float y){
        
        this.x=x;
        this.y=y;
        
    }
    
    public Coordenada_201404278(Coordenada_201404278 nva){
    
        this.x=nva.x;
        this.y=nva.y;
        
    }
    
    public float getX(){
        return this.x;
    }
    
    public float getY(){
        return this.y;
    }
    
    public void setX(float x){
        this.x=x;
    }
    
    public void setY(float y){
        this.y=y;
    }
    
    public Coordenada_201404278 suma(Coordenada_201404278 s){
        
        float sumaX=x+s.getX();
        float sumaY=y+s.getY();
        
        Coordenada_201404278 Cor=new Coordenada_201404278(sumaX,sumaY);
        
        return Cor;
        
    }
    
}
