package ActividadClase1;

public class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int anoPublicacion;

    //Metodo explicito
    public Publicacion(String codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }
    //Metodo Por Defecto
    public Publicacion(){}
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return "Publicación \n" 
                + "Código: " + codigo + "\n"
                + "Título: " + titulo + "\n"
                + "Ano de publicación: " + anoPublicacion+ "\n";
    }
    
    
    
}
