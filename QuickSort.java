public class QuickSort{

    public void quickSort(int[] arrei) {
        if (arrei == null || arrei.length == 0) {
            return;
        }

        int tamanho = arrei.length;
        quicksortRecursivo(arrei, 0, tamanho - 1);
    
    }

    public void quicksortRecursivo(int[] arrei, int inicio, int fim){
        int i = inicio;
        int j = fim;

        int pivo = arrei[(inicio + fim) /2];

        while(i <= j){
            while(arrei[i] < pivo){
                i++;
            }
            while (arrei[j] > pivo){
                j--;
            }
            if(i <= j){
                trocarElementos(arrei, i, j);
                i++;
                j--;
            }

        }

        if(inicio < j){
            quicksortRecursivo(arrei, inicio, j);
        }
        if (i < fim) {
            quicksortRecursivo(arrei, i, fim);
        }

    }

    public void trocarElementos(int[] arrei, int i, int j) {
        int temp = arrei[i];
        arrei[i] = arrei[j];
        arrei[j] = temp;
    }

    public void exibirArray(int[] arrei){
        for (int valor : arrei) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}