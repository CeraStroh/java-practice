import java.util.Random;

public class ArrayFunctions {
   public static int linearSearch(int[] data, int target) {
      for (int i=0; i<data.length; i++) {
         if (target == data[i]) return i;
      }
      return -1;
   }
   
   public static int linearSearch(String s, String target) {
      StringBuilder result = new StringBuilder();
      String[] splitArray = s.split("\\s+");
      for (int i=0; i<splitArray.length; i++) {
         if (target.equals(splitArray[i])) return i;
      }
      return -1;
   }
   
   public static int sum(int[] data) {
      int total = 0;
      for (int d : data) {
         total += d;
      }
      return total;
   }
   
   public static int max(int[] data) {
      int max = 0;
      for (int d : data) {
         if (d > max) max = d;
      }
      return max;
   }
   
   public static int min(int[] data) {
      int min = max(data);
      for (int d : data) {
         if (d < min) min = d;
      }
      return min;
   }
   
   public static void display(int[] data) {
      for (int d : data) {
         System.out.print(d + " ");
      }
      System.out.println("");
   }
   
   public static void selectionSort(int[] data) {
      for (int j=0; j<data.length; j++) {
         int min = j;
         for (int i=j+1; i<data.length; i++) {
            if (data[i] < data[min]) {
               min = i;
            }
         }
         int h = data[j];
         data[j] = data[min];
         data[min] = h;
      }
   }
   
   public static void insertionSort(int[] data) {  //worst case is O(n^2)
      for (int i=1; i<data.length; i++) {
         int key = data[i];
         int j = i - 1;
         while (j >= 0 && key < data[j]) {
            data[j+1] = data[j];
            j--;
         }
         data[j+1] = key;
      }
   }
   
   public static int binarySearch(int[] data, int target) { //worst case is O(log n)
      int left = 0;
      int right = data.length - 1;
      while (left <= right) {
         int mid = (left + right) / 2;
         if (target == data[mid]) {
            return mid;
         } else if (target < data[mid]) {
            right = mid - 1;
         } else {
            left = mid + 1;
         }
      }
      return -1;
   }
   
   public static boolean isSorted(int[] data) {
      for (int i=1; i<data.length-1; i++) {
         if (data[i] > data[i+1]) return false;
      }
      return true;
   }
   
   public static void randomFill(int[] data, int max) {
      Random gen = new Random();
      for (int i=0; i<data.length; i++) {
         data[i] = gen.nextInt(max);
      }
   }
   
   public static void randomFill(int[] data) {
      Random gen = new Random();
      for (int i=0; i<data.length; i++) {
         data[i] = gen.nextInt();
      }
   }
   
   public static void main(String[] args) {
      int[] data = {3, 14, 7, 22, 45, 12, 19, 42, 6};
      /*System.out.println("Search for 7: " + linearSearch(data, 7));
      System.out.println("Search for 100: " + linearSearch(data, 100));
      for (int d : data) {
         System.out.println("Search for " + d + ": " + linearSearch(data, d));
      }
      System.out.println("Total sum of data: " + sum(data));
      System.out.println("Max of data: " + max(data));
      System.out.println("Min of data: " + min(data));
      display(data);
      System.out.print("hi");
      System.out.println("Search for That: " + linearSearch("This and this and that and this", "That"));
      int[] data2 = new int[100];
      randomFill(data2, 1000);
      System.out.println("data 2: " + isSorted(data2));*/
      int[] data3 = {1, 1, 4, 5, 8, 90};
      /*System.out.println("data 3: " + isSorted(data3));
      System.out.println("Before insertionSort()");
      for (int d : data2) {
         System.out.print(d + " ");
      }
      System.out.println("");
      System.out.println("After insertionSort()");
      insertionSort(data2);
      //selectionSort(data2);
      for (int d : data2) {
         System.out.print(d + " ");
      }
      System.out.println("");*/
      System.out.println("binarySearch for 90: " + binarySearch(data3, 90));
   }
}