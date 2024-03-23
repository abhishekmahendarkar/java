public class StudentImpl {
    public static void main(String[] args){
        Student s = new Student("james","1232");
        Factorial.main(null);
        s.display();
    }
}
class Student{
    String nam,rn;
    Student(String name,String rno){
        nam=name;
        rn=rno;
    }
    public void display(){
        System.out.printf("welcome %s rno is %s");
    }
}