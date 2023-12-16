public class Node<T> {
   private T data;
   private Node<T> next;
   
   public Node(T data, Node<t> next) {
      this.data = data;
      this.next = next;
   }
}