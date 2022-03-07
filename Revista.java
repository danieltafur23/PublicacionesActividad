package ActividadClase1;


public class Revista extends Publicacion{

    private String numero;

    public Revista(String numero, String codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }
   
    
    
    
}
