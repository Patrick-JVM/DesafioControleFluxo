import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        // Define o Locale para US para aceitar números com ponto decimal
        Locale.setDefault(Locale.US);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        double saldo = 0;
        double sacar = 0;
        boolean continuar = true;

        
        while (continuar) {
            try {
                
                int opcao = Integer.parseInt(reader.readLine());

                switch (opcao) {
                    case 1:
                        
                        double valorDeposito = Double.parseDouble(reader.readLine());
                        saldo += valorDeposito;
                        System.out.printf("Saldo atual: %.2f\n", saldo);
                        break;
                    case 2:
                        
                        sacar = Double.parseDouble(reader.readLine());
                        if (sacar <= saldo) {
                            saldo -= sacar;
                            System.out.printf("Saldo atual: %.2f\n", saldo);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    case 3:
                        System.out.printf("Saldo atual: %.2f\n", saldo);
                        break;
                    case 4:
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (IOException e) {
                System.out.println("Erro de entrada/saída: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }
        }

        // Fechar o BufferedReader
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao fechar o BufferedReader: " + e.getMessage());
        }
    }
}
