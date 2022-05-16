import java.util.Scanner;

public class Rotacion_arreglo_izquierda {
     
    public static void main(String [] args){
        
        int[] A = {1,2,3,4,5};
        
        System.out.println("El arreglo es: ");
        for (int i : A) {
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        int[] Ain = rotarIzquierdaArray(A);
        
        System.out.println("\nEl arreglo rotado a la izquierda es: ");
        for (int i : Ain) {
            System.out.print(i+" ");
        }
        
        System.out.println();
        
    }
    
    public static int[] rotarIzquierdaArray(int[] A){
        
        Scanner sc = new Scanner(System.in);
        int[] Aiz = new int[A.length];
        
        System.out.println("\n¿Cuanto desea rotar?");
        int d = sc.nextInt();
        
        //Moviendo numeros por posicion
        for (int i = 0; i < A.length; i++) {
            if (i-d < 0) {
                Aiz[A.length+(i-d)] = A[i];
            } else {
                Aiz[i-d] = A[i];
            }
        }
        
        return Aiz;
    }
}
