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
      System.out.print("hi");*/
      System.out.println("Search for That: " + linearSearch("This and this and that and this", "That"));
   }
}