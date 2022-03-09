package ActividadClase1;

import java.util.Scanner;

public class Biblioteca {
    static Scanner x = new Scanner(System.in);
    static Publicacion p[] = new Publicacion[3];
    static int cont=0;
    
    public static void main(String[] args) {
        int op=1;
        while(op==1 || op == 2){
            switch(op){
                case 1: ingresoDatos();
                    break;
                case 2: mostrarDatos();
                    break;
                
            }
            System.out.println("Menu: \n"
                             + "1: Agregar una publicación \n"
                             + "2: Mostrar información de las publicaciones \n");
            op = x.nextInt();
        }
    }


    public static void ingresoDatos(){
    String c, t;
    int a;
    
        System.out.print("Ingrese el codigo de la publicacion: ");
        c = x.next();
        System.out.print("Ingrese el titulo de la publicacion: ");
        t = x.next();
        System.out.print("Ingrese el año de la publicacion: ");
        a = x.nextInt();
        
        p[cont]=new Publicacion(c,t,a);
        cont++;
    }
    
    public static void mostrarDatos(){
        for(int i=0;i<cont;i++){
            System.out.print(p[i].toString());
        }
    }
    
}
