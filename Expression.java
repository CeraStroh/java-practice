public class Expression {
   private static int rank(String op) {
      switch (op) {
         case "*":
         case "/":
            return 2;
         case "+":
         case "-":
            return -1;
         default:
            return -1;
      }
   }
}