package ActividadClase1;


public class Libro extends Publicacion {
    
 private boolean prestado;
 
 
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    public Libro(String codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = false;
    }
    
    public void prestar(){
        prestado = true;
    }
    
    public void devolver(){
        prestado = false;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Libro: \n"
                + "prestado: " + prestado + "\n";
    }
    
    
    
}
