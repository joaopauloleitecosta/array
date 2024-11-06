import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aprendendo sobre Arrays em Java");

        int[] numeros = {1,2,3,4,5,6};

        //Acessando um elemento do array pelo índice
        System.out.println("Primeiro elemento do array: " + numeros[0]);

        System.out.println("Percorrendo o Array com for-each");
        for(int numero: numeros) {
            System.out.println(numero);
        }

        //Exibindo o array completo como String
        System.out.println("Array completo: " + Arrays.toString(numeros));
        System.out.println("Tamanho: " + numeros.length);

        //Array Multidimensionais
        int[][] matrix = {
            {22,31,30},
            {23,23,17},
            {20,19,11}
        };
        System.out.println(matrix[2][2]);

    }
}
