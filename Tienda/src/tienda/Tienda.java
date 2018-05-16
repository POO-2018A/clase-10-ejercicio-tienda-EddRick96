package tienda;

/**
 *
 * @author Erick
 */
public class Tienda {
    private String nombre;
    private String direccion;
    private String ruc;
    private String[] producto;
    
    public Tienda(String nombre,String direccion, String ruc){
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRuc(){
        return ruc;
    }
    public void setRuc(){
        this.ruc = ruc;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String[] getProducto(){
        return producto;
    }
    public void setProducto(String[] producto){
        this.producto = producto;
    }
    /**
     * @param args the command line arguments
     */
   
    
}
