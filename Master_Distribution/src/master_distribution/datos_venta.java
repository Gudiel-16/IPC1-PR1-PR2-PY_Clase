
package master_distribution;

public class datos_venta {
    
    String client;
    String tipo_vent;
    String cantidad_vent;
    String precio_vent;
    String sub_vent;
    
    //contructor
    datos_venta(String client, String tipo_vent, String cantidad_vent, String precio_vent, String sub_vent){
        
        this.client=client;
        this.tipo_vent=tipo_vent;
        this.cantidad_vent=cantidad_vent;
        this.precio_vent=precio_vent;
        this.sub_vent=sub_vent;
    }
    

    //creando get 
    public String getClient(){
        return this.client;
    }
    
    public String getTipoVent(){
        return this.tipo_vent;
    }
     public String getCantidadVent(){
        return this.cantidad_vent;
    }
    
    public String getPrecioVent(){
        return this.precio_vent;
    }
     public String getSubVent(){
        return this.sub_vent;
    }
    
}
