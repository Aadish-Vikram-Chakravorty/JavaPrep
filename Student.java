public class Student {
    int rollno;
    String name;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "Aaditya";
        System.out.println(s1.rollno);
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.rollno = 102;
        s2.name = "Aakash";
        System.out.println(s2.rollno);
        System.out.println(s2.name);
    }
}
