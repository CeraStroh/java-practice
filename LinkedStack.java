public class LinkedStack<E> implements Stack<E> {
   private Node<E> top;
   
   //use E here
   
   private static class Node<T> {
      private T data;
      private Node<T> next;
      
      private Node(T data, Node<T> next) {
         this.data = data;
         this.next = next;
      }
   }
}