public class NumericFunctions {
   public static long factorial(int n) {
      long result = 1;
      for (int i=2; i<=n; i++) {
         result *= i;
      }
      return result;
   }
   
   public static int pow(int m, int n) {
      int result = 1;
      for (int i=0; i<n; i++) {
         result *= m;
      }
      return result;
   }
   
   public static int gcd(int m, int n) {
      int prev = 0;
      while (n > 0) {
         prev = n;
         n = m % n;
         m = prev;
      }
      return m;
   }
   
   public static void main(String[] args) {
      /* for (int n=1; n<=30; n++) {
         System.out.print(n);
         System.out.print(" ");
         System.out.println(factorial(n));
      }
      System.out.println(factorial(0));
      System.out.println(factorial(3));
      for (int i=1; i<=9; i++) {
         for (int j=1; j<=9; j++) {
            System.out.println(i + "^" + j + " = " + pow(i, j));
         }
      }
      for (int i=2; i<=10; i++) {
         for (int j=2; j<=10; j++) {
            System.out.println(i + "%" + j + " = " + gcd(i, j));
         }
      } */
   }
}