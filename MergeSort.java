import java.util.*;
public class MergeSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int sd = sc.nextInt(); 
    int arr[] = new int[sd];
    System.out.println("Enter Array Elements ");
    for (int i = 0; i < sd; i++)
      arr[i] = sc.nextInt(); 
    arr = Merge_sort(arr, sd);
    System.out.println("Array after Merge Sort is: ");
    for (int i = 0; i < sd; i++)
      System.out.print(arr[i] + " ");
    System.out.println("\n");
  }
 static int[] Merge_sort(int arr[], int size) {
    if (size > 1) {
      int mid = size / 2;
      int[] first = Arrays.copyOfRange(arr, 0, mid);
      first = Merge_sort(first, mid); // recursive call for first half array
      int[] second = Arrays.copyOfRange(arr, mid, size);
      second = Merge_sort(second, size - mid); // recursive call for second half array
      arr = Merge_arrays(first, second, mid, size - mid);
    }
    return arr;
  }

  static int[] Merge_arrays(int first[], int second[], int n, int m) // respectively
  {
    int arr[] = new int[n + m];
    int i = 0, f = 0, s = 0;
    while (f < n && s < m) {
      if (first[f] < second[s])
        arr[i++] = first[f++];
      else
        arr[i++] = second[s++];
    }
    while (f < n)
      arr[i++] = first[f++];
    while (s < m)
      arr[i++] = second[s++];
    return arr;
  }
}