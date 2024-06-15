package _2;

public class D_Inheritance_TheObjectClass extends Object{//java.lang.Object you can put Object alone here

    public static void main(String[] args) {
        Student1 max = new Student1("Max",21);
        //System.out.println(max.toString()); //_2.Student1@7530d0a
        System.out.println(max);
        /*
        if we print the object without overriding toString method.we'll get the ClassName@hashCode of that object.
        Hashcode
        hashCode is an integer,that is unique to an instance(in the currently executing code)
        When an instance is created,it's assigned a hashCode,and that hashCode is what can tell us if our multiple references,
        are pointing to a single instance.it's a mechanism for comparison,in other words.This really like an address for a house
         */
        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy",8,"Carole");
        System.out.println(jimmy);

        //PrimarySchoolStudent
    }
}
class Student1
{
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name+" is "+age;
//        return "Student1{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}
/*
we've already built Student,which inherits from Object implicitly.
Next,we'll build primaruSchoolStudent,which will inherit from Student.
PrimarySchoolStudent
    parentName:String
    -----------------
    toString():String
 */
class PrimarySchoolStudent extends Student1
{
    private String parentName;
    PrimarySchoolStudent(String name,int age,String parentName)
    {
        super(name,age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s kid, "+super.toString();
    }
    /*
    Java only supports one class in its extends class.The inheritance tree is Cummulative meaning that PrimarySchoolStudent
    inherits both Student members and Object members.Object members are accessible as long as student doesn't override them.
    Because Student overrode toString(),we no longer can simply call the toString implementation on Object from PrimarySchoolStudent.
    
     */
}