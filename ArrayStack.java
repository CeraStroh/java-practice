public class ArrayStack<E> implements Stack<E> {
   private E[] data;
   private int top = -1;
   private static final int DEFAULT_CAPACITY = 10;
   
   @SuppressWarnings("unchecked")
   public ArrayStack() {
      data = (E[]) new Object[DEFAULT_CAPACITY];
   }
   
   public E pop() {
      E result = data[top];
      data[top--] = null;
      return result;
   }
}