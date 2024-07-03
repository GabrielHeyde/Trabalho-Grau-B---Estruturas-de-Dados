package br.unisinos;
import java.lang.*;
import java.lang.reflect.Array;

public class Main {


	public static <T extends Comparable<? super T>> void main(String [] args) {

		Ordenacao order = new Ordenacao();
		
		CarregarArrayTexto arrayTexto = new CarregarArrayTexto();
		
		


		int i = 0;

		while(i<=10) {
			
			Integer[] array = arrayTexto.carregarArray("C:\\Users\\T-Gamer\\eclipse-workspace\\TrabalhoGrauB\\src\\br\\unisinos\\65536\\65536aleatoriocomrepeticao", Integer.class);
			long inicio = System.nanoTime();

			order.bubbleSort(array);

			long fim = System.nanoTime();
			long tempoDecorrido = fim - inicio;
			System.out.println("Tempo decorrido : " + tempoDecorrido + " nanossegundos");
			i++;
		}
		

	}
}