
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        VerificadorNumeros verificador = new VerificadorNumeros();
        try {
            System.out.print(" digite um número: ");
            int numero1 = sc.nextInt();
            System.out.print(" digite o segundo número: ");
            int numero2 = sc.nextInt();
            
            verificador.verificaNumeros(numero1, numero2);
            numeros(numero1,numero2);
            sc.close();
            
        } catch (ParametroInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    static void numeros(int numero1, int numero2){
        int num1 = numero1;
        int num2 = numero2;
        int result = num1;

        int vet[]= new int[result];
        
        for (int num = 0 ; num < vet.length; num++ ) {
            System.out.println("Imprimindo o número " + (num + 1));
            
        }
        
    }
}
