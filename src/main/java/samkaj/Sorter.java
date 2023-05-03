package samkaj;

public class Sorter {

  /**
   * Takes an integer array and returns a sorted version of it.
   */
  public int[] sort(int[] toSort) {
    int[] sorted = toSort.clone();
    if (sorted.length < 1)
      return sorted;

    quickSort(sorted, 0, sorted.length - 1);

    return sorted;
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr[i], arr[j]);
      }
    }
    swap(arr[i + 1], arr[high]);
    return (i + 1);
  }

  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  /**
   * Swaps two integers.
   */
  static void swap(int x, int y) {
    int tmp = x;
    x = y;
    y = tmp;
  }
}
