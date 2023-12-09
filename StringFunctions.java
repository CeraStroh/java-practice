public class StringFunctions {
   public static int count(String s, String target) {
      int count = 0;
      int n = target.length();
      for (int i=0; i<=s.length()-n; i++) {
         String piece = s.substring(i, i + n);
         if (piece.equals(target)) count++;
      }
      return count;
   }
   
   public static int count2(String s, String target) {
      int count = 0;
      int n = s.length();
      int i = 0;
      int index = 0;
      while (i < n) {
         index = s.indexOf(target, i);
         if (index >= 0) {
            count++;
         } else break;
         i = index + target.length();
      }
      return count;
   }
   
   public static int countIgnoreCase(String s, String target) {
      int count = 0;
      int n = target.length();
      for (int i=0; i<=s.length()-n; i++) {
         String piece = s.substring(i, i+n);
         if (piece.equalsIgnoreCase(target)) count++;
      }
      return count;
   }
   
   public static String acronym(String phrase) {
      StringBuilder result = new StringBuilder();
      for (String token : phrase.split("\\s+")) {
         result.append(token.toUpperCase().charAt(0));
      }
      return result.toString();
   }
   
   public static String acronym2(String phrase) {
      StringBuilder result = new StringBuilder();
      String[] splitArray = phrase.split("\\s+");
      for (int i=0; i<splitArray.length; i++) {
         result.append(splitArray[i].toUpperCase().charAt(0));
      }
      return result.toString();
   }
   
   public static int countWord(String s, String target) {
      int count = 0;
      for (String token : s.split("\\s+")) {
         if (token.equals(target)) count++;
      }
      return count;
   }
   
   public static int countWordIgnoreCase(String s, String target) {
      int count = 0;
      for (String token : s.split("\\s+")) {
         if (token.equalsIgnoreCase(target)) count++;
      }
      return count;
   }
   
   public static String reverse(String s) {
      String reverse = "";
      for (int i=s.length()-1; i>=0; i--) {
         reverse += s.charAt(i);
      }
      return reverse;
   }
   
   public static void main(String[] args) {
      /*System.out.println("Number of this's: " + count("This and This and that and this", "this"));
      System.out.println("Number of this's: " + countIgnoreCase("This and This and that and this", "this"));
      System.out.println("Number of this's: " + count2("this and This and that and this", "this"));
      System.out.println(acronym2("talk to you later!"));
      System.out.println(countWordIgnoreCase("This and This and that and this", "this"));*/
      System.out.println(reverse("abcdefghijk"));
   }
}