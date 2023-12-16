public class IntLinkedStack implements IntStack {
   private Node top;
   
   public void push(int item) {
      top = new Node(item, top);
   }
   
   public int pop() {
      int result = top.data;
      top = top.next;
      return result;
   }
   
   private class Node {
      private int data;
      private Node next;
      
      private Node(int data, Node next) {
         this.data = data;
         this.next = next;
      }
   }
}