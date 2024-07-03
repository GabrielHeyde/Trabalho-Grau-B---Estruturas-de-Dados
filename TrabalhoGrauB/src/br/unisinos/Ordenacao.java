package br.unisinos;

public class Ordenacao {

	public static <T extends Comparable<? super T>> void bubbleSort(T[] a) {
		boolean exchange;
		do {
			exchange = false;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i].compareTo(a[i + 1]) > 0) {
					exchange(a, i, i + 1);
					exchange = true;
				}
			}
		} while (exchange);
	}

	private static <T extends Comparable<? super T>> void exchange(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && a[j - 1].compareTo(a[j]) > 0; j--) {
				exchange(a, j - 1, j);
			}
		}
	}

	public static <T extends Comparable<? super T>> void selectionSort(T[] a) {
		for (int min, i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[min]) < 0) {
					min = j;
				}
			}
			exchange(a, min, i);
		}
	}

	public static <T extends Comparable<? super T>> void quickSort(T[] a) {
		sort(a, 0, a.length - 1);
	}
	private static <T extends Comparable<? super T>> void sort(T[] a, int low,
			int high) {
		if (low >= high) return;
		int p = partition(a, low, high);
		sort(a, low, p - 1);
		sort(a, p + 1, high);
	}
	private static <T extends Comparable<? super T>> int partition(T[] a, int low, int
			high) {
		T pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j].compareTo(pivot) <= 0) {
				exchange(a, ++i, j);
			}
		}
		exchange(a, i + 1, high);
		return i + 1;
	}
}
