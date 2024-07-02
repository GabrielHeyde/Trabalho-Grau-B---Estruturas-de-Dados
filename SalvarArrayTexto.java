
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SalvarArrayTexto {

    // Método para salvar o array em um arquivo de texto
    private void salvarArray(int[] arr, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName); PrintWriter printWriter = new PrintWriter(fileWriter)) {
            for (int i = 0; i < arr.length; i++) {
                printWriter.println(arr[i]);
            }
            System.out.println("Array salvo em " + fileName);
        } catch (IOException i) {
        }
    }

    // Método para criar e salvar um array em ordem crescente, sem valores repetidos
    public void criarESalvarArrayCrescente(int tamanho, String fileName) {
        int[] arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            arr[i] = i + 1;
        }
        salvarArray(arr, fileName);
    }

    // Método para criar e salvar um array em ordem decrescente, sem valores repetidos
    public void criarESalvarArrayDecrescente(int tamanho, String fileName) {
        int[] arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            arr[i] = tamanho - i;
        }
        salvarArray(arr, fileName);
    }

    // Método para criar e salvar um array aleatório, sem valores repetidos
    public void criarESalvarArrayAleatorioSemRepeticao(int tamanho, String fileName) {
        int[] arr = new int[tamanho];
        Set<Integer> numerosUsados = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            int numero;
            do {
                numero = random.nextInt(tamanho) + 1;
            } while (numerosUsados.contains(numero));
            numerosUsados.add(numero);
            arr[i] = numero;
        }
        salvarArray(arr, fileName);
    }

    // Método para criar e salvar um array aleatório, com valores repetidos
    public void criarESalvarArrayAleatorioComRepeticao(int tamanho, String fileName) {
        int[] arr = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            arr[i] = random.nextInt(tamanho) + 1;
        }
        salvarArray(arr, fileName);
    }
}
