public class Student {
 public Student(int a){

 }
 public void print(){
     System.out.println("The statment printed");
 }
}
class ZSGSStudent extends Student{
    int a,b,c;
public ZSGSStudent(int a, int b){
    super(a);
    this.a=a;
    this.b=b;
}
public void print(){
    System.out.println("The statement is printed A value :"+a+" B value : "+b );
}

}
class Display{
    public static void main(String[] args) {
        Student student = new ZSGSStudent(2,3);
        student.print();
    }
}
