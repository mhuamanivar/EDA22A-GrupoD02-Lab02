
public class Invertir_arreglo_enteros {
    public static void main(String [] args){
        
        int[] A = {1,2,3};
        
        System.out.println("El arreglo es: ");
        for (int i : A) {
            System.out.print(i+" ");
        }
        
        int[] Ain = invertirArray(A);
        
        System.out.println("\nEl arreglo invertido es: ");
        for (int i : Ain) {
            System.out.print(i+" ");
        }
        
        System.out.println();
    }
    
    public static int[] invertirArray(int[] A){
        
        int[] Ain = new int[A.length];
        
        //Bucle para invertir arreglo
        for (int i = 0; i < A.length; i++) {
            Ain[i] = A[A.length-(i+1)];
        }
        
        return Ain;
    }
}
