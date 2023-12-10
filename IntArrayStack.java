import java.util.EmptyStackException;

public class IntArrayStack implements IntStack {
   private int top = -1;
   private int[] data;
   private static final int DEFAULT_CAPACITY = 10;
   
   public IntArrayStack() {
      data = new int[DEFAULT_CAPACITY];
   }
   
   public void push(int item) {
      if (top == data.length - 1) resize(2 * data.length);
      data[++top] = item;
   }
   
   public int pop() {
      if (isEmpty()) throw new EmptyStackException();
      return data[top--];
   }
   
   private void resize(int newCapacity) {
      int[] newData = new int[newCapacity];
      for (int i=0; i<=top; i++) {
         newData[i] = data[i];
      }
      data = newData;
   }
   
   public static void main(String[] args) {
      IntStack s = new IntArrayStack();
      for (int i=0; i<5; i++) {
         s.push(i);
      }
   }
}