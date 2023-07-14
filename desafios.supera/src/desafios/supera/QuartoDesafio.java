package desafios.supera;
import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] casosTeste = new String[n];
        
        for (int i = 0; i < n; i++) {
            casosTeste[i] = scanner.nextLine();
        }
        
        String[] resultados = new String[n];
        for (int i = 0; i < n; i++) {
            String linha = casosTeste[i];
        
            String linhaDecifrada = desembaralharLinha(linha);

            resultados[i] = linhaDecifrada;
        }
       
        for (int i = 0; i < n; i++) {
            System.out.println(resultados[i]);
        }
    }

    private static String desembaralharLinha(String linha) {
        int tamanho = linha.length();
        StringBuilder linhaDecifrada = new StringBuilder(tamanho);
   
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }
       
        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }

        return linhaDecifrada.toString();
    }
}
