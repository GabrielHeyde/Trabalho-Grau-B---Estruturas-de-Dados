
public class ShellSort {

    public void shellSort(int[] arr) {
        int n = arr.length;

        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int chave = arr[i];
                int j = i;

                while (j >= intervalo && arr[j - intervalo] > chave) {
                    arr[j] = arr[j - intervalo];
                    j -= intervalo;
                }
                arr[j] = chave;
            }
        }
    }

}
