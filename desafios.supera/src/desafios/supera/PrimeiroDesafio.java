package desafios.supera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }
        
        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for (int valor : pares) {
            System.out.println(valor);
        }
        
        for (int valor : impares) {
            System.out.println(valor);
        }
    }
}
