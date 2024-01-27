public class Student {
    int stuNum;
    static int insNum=0;
    Student(){
        insNum += 1;
    }
    Student(int a){
        stuNum = a;
        insNum += 1;
    }

    static int value(){
        return insNum;
    }
    public static void main(String[] args) {
        Student student = new Student(10);
        Student stu = new Student();
        Student stu3 = new Student();
        System.out.println("The student number is " + student.stuNum);
        System.out.println("The number of instance created is " + value());
    }
}