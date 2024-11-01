package Stack;
public class Stackarray {
    
int top=-1;

void push(int data, int[] a){
    top++;
    a[top]=data;
}
void pop(int[] a){
int res=a[top];
top--;
System.out.println("Popped  : " +res);
}
    public static void main(String[] args) {
        int[] a=new int[3];
        Stackarray l=new Stackarray();
        l.push(5,a);
        l.push(7, a);
        l.pop(a);

    }
}
