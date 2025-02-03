package Practice_OOPS_in_Java;

public class _02_ObjectsInJava {
    public static void main(String[] args) {
        student indra = new student(45, "indra reddy", 8.9f);
        System.out.println(indra.rollno);
        System.out.println(indra.name);
        System.out.println(indra.finalgpa);

    }
}
class student{
    int rollno;
    String name;
    float finalgpa;
    student(int rollno, String naem,float finalgpa ){
        this.rollno = rollno;
        name = naem;
        this.finalgpa = finalgpa;
    }

}

