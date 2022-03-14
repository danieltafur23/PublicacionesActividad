package ActividadClase1;

import java.util.Scanner;

public class Biblioteca2 {
    
    static Scanner x= new Scanner(System.in);
    static Publicacion publicaciones[] = new Publicacion[3]; //Veector de objetos de tipo Publicacion

    public static void main(String[] args) {
        
        ingresoDatos();
        
        publicaciones[0] = publicaciones[2]; //Conversion hacia arriba
                
        Libro l1;
        Revista r1;
        
        for (int i = 0; i < publicaciones.length; i++) {
            if (publicaciones[i]instanceof Libro) {
                l1 =(Libro)publicaciones[i]; //Conversion hacia abajo
                System.out.println("La informacion del libro es: "+ l1.toString());
            }
            if (publicaciones[i]instanceof Revista) {
                r1 = (Revista)publicaciones[i]; //Conversion hacia abajo
                System.out.println("La informacion de la revista es: " + r1.toString());
            }
        }
        
    }

    public static void ingresoDatos() {
      String codigo, titulo, numero;
      int añoPublicacion,tipoPublicacion;
      
        for (int i = 0; i < publicaciones.length; i++) {
            System.out.println("Selecione una opcion de registro: \n"
                                + "1. Libro \n"
                                + "2. Revista \n");
            tipoPublicacion = x.nextInt();
            System.out.print("Codigo: ");
            codigo=x.next();
            System.out.print("Titulo: ");
            titulo=x.next();
            System.out.print("Año de la publicacion: ");
            añoPublicacion=x.nextInt();
            
            if (tipoPublicacion == 1) {
                publicaciones[i] = new Libro(codigo, titulo, añoPublicacion);
            }
            if (tipoPublicacion == 2) {
                System.out.println("Numero: ");
                numero = x.next();
                publicaciones[i] = new Revista(numero, codigo, titulo, añoPublicacion );
            }
            if ((tipoPublicacion!=1)&&(tipoPublicacion!=2)) {
                System.out.println("Ingreso un valor incorrecto."
                        + "Selecciones de nuevo la opcion: \n"
                        + "1. Libro \n"
                        + "2. Revista ");
                        i--;
            }
        }
        }
    }

