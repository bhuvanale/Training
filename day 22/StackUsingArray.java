
public class StackUsingArray{

  int top ,size;
  int stack[];

  public StackUsingArray(int size){
    this.size=size;
    top = -1;
    stack = new int[size];
  }

  public boolean isEmpty(){
    if (top == -1) {
      return true;
    }
    else{
      return false;
    }
  }

  public void push(int value){
    if(top == size-1){
      System.out.println("stsck is overflow.....");
      return;
    }
    stack[++top]=value;
    display();
  }


  public void display(){
    if(top == -1){
      System.out.println("stack is empty . no elements to display");
      return;
    }
    System.out.println("Stack structure");
    for(int i=top;i>=0;i--){
      System.out.println("\t"+i+" -> "+stack[i]);
    }
  }

  public void pop(){
      if(top == -1){
      System.out.println("stack is underflow.");
      return;
    }
    System.out.println(stack[top--]+" is deleted");
    display();

  }

  public void peek(){
    System.out.println("Top Element: "+stack[top]);
  }
    public static void main(String[] args) {

      StackUsingArray s = new StackUsingArray(5);
      System.out.println("is stack empty: "+s.isEmpty());
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(50);
      s.push(90);
      
      s.pop();
      s.pop();
      s.push(100);
      s.peek();

       
    }
}