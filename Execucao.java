//Classe criada para realizar a execução dos métodos de ordenação
public class Execucao {

    public static void main(String[] args) {

        //Criação dos objetos com as classes que contém os métodos de ordenação
        HeapSort heapSort = new HeapSort();
        ShellSort shellSort = new ShellSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        //Criação do objeto que irá carregar os arrays armazenados nos documentos .txt
        CarregarArrayTexto carregarArrayTexto = new CarregarArrayTexto();

        //Variável para alterar o tamanho do array, e assim facilitar o carregamento do mesmo
        int valor = 65536;

        //Array que será ordenado
        int[] arr = new int[valor];

        //Carregando o array com o arquivo .txt necessário
        arr = carregarArrayTexto.carregarArray("", valor);

        //Início da contagem em Nanosegundos
        long inicio = System.nanoTime();

        //métodos de ordenação utilizados
        heapSort.heapSort(arr);
        shellSort.shellSort(arr);
        mergeSort.mergeSort(arr);
        quickSort.quickSort(arr);

        //Fim da contagem em Nanosegundos(e cálculo da diferença para calcular o tempo total para realizar a ordenação)
        long fim = System.nanoTime();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo decorrido: " + tempoDecorrido + " nanossegundos");

    }
}
