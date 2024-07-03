package br.unisinos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class CarregarArrayTexto {

    // Método para carregar o array de um arquivo de texto
    @SuppressWarnings("unchecked")
    public <T extends Number> T[] carregarArray(String fileName, Class<T> clazz) {
    	
    	/*ALTERE AQUI O TAMANHO DO ARRAY ANTES DE FAZER OS TESTES*/
        T[] arr = (T[]) Array.newInstance(clazz, 65536);

        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null && i < arr.length) {
                arr[i] = (T) Integer.valueOf(line);  // Casting string to generic type
                i++;
            }
            System.out.println("Array carregado de " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }
}
