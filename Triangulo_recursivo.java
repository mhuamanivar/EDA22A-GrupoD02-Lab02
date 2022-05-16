import java.util.Scanner;

public class Triangulo_recursivo {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual sera la base del triangulo?");
        int base = sc.nextInt();
        
        System.out.println();
        
        //Verificando si existe el triangulo
        if (base < 2) {
            System.out.println("No existe triangulo de esa base.");
        } else {
            trianguloRecursivo(base);
        }
    }
    
    public static void trianguloRecursivo(int base){
        
        //Formando el triangulo linea por linea
        if (base == 1) {
            System.out.println("*");
        } else {
            trianguloRecursivo(base-1);
            for (int i = 0; i < base; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
