import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CarregarArrayTexto {

    // Método para carregar o array de um arquivo de texto
    public int[] carregarArray(String fileName, int tamanho) {
        int[] arr = new int[tamanho];

        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null && i < arr.length) {
                arr[i] = Integer.parseInt(line);
                i++;
            }
            System.out.println("Array carregado de " + fileName);
        } catch (IOException i) {
        }

        return arr;
    }
}
