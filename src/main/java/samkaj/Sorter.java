package samkaj;

public class Sorter {

  /**
   * Takes an integer array and returns a sorted version of it.
   */
  public int[] sort(int[] toSort) {
    int[] sorted = toSort.clone();
    if (sorted.length < 1)
      return sorted;
     
    for (int i = 0; i < sorted.length - 1; i++) {
      for (int j = 0; j < sorted.length - i - 1; j++) {
        if (sorted[j] > toSort[j + 1]) {
          swap(sorted[j], toSort[j+1]); 
        }
      }
    }

    return sorted;
  } 

  private void swap(int x, int y) {
    int tmp = x;
    x = y;
    y = tmp;
  }
}
