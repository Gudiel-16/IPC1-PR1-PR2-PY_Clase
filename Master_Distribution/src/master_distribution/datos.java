
package master_distribution;


//aqui los get de compras para generar la tabla en el PDF de compras
public class datos {
    
    String proveedo;
    String tipo;
    String cantidad;
    String precio;
    String sub_compra;
    
    //contructor
    datos(String proveedo, String tipo, String cantidad, String precio, String sub_compra){
        
        this.proveedo=proveedo;
        this.cantidad=cantidad;
        this.tipo=tipo;
        this.precio=precio;
        this.sub_compra=sub_compra;
    }
    

    //creando get 
    public String getProvee(){
        return this.proveedo;
    }
    
    public String getCantid(){
        return this.cantidad;
    }
     public String getTip(){
        return this.tipo;
    }
    
    public String getPreci(){
        return this.precio;
    }
     public String getSubtt(){
        return this.sub_compra;
    }
    
}
