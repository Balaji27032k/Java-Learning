package _2;

/*
let's say we want to read data out of a database,that has a table of Student records.
Student
    Id,Name,DateOfBirth,ClassList -> Strings (later we'll make them as custom types like date,time etc)
let's make this normal class (Student) into a POJO.
A POJO in its simplest form,requires a way to populate data and we can do this with a constructor.
 */
public class C_POJO
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {//Student s = new Student(.......);
            C_Record s = new C_Record("S92300"+i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }
                    ,"05/11/1985","Java Masterclass");
            System.out.println(s);//Every object when passed to sout will have the toString method implicitly executed,
            //if you've created such a method on your class.
            /*
            This was a contrived example ,but you can imagine,if you were reading data from a database or a comma delimitted
            file, how you could create a whole set of POJO's to collect all the data elements, in all your records.Once
            you have all this information in the POJO,you can pass these objects to whatever code would process it,that would
            need to do something with it,perhaps generate a mailing list or whatever.
             */

            Student pojoStudent = new Student("S923006","Ann","05/11/1985","Java Masterclass");
            C_Record recordStudent = new C_Record("S923007","Bill","O5/11/1985","Java Masterclass");

            System.out.println(pojoStudent);
            System.out.println(recordStudent);
            //if you print you'll see that the bracket and quotation are different between our pojo and record.
            pojoStudent.setClassList(pojoStudent.getClassList()+", Java OCP Exam 829");
            //recordStudent.setClassList(recordStudent.classList()+", Java OCP Exam 829");
            /*
            you'll get compiler error because record doesn't have a setter at all.There is no way to set the class list
            other than by passing the value in on the record header or through the use of constructors.This is by design
            because the record's goal is to be immutable.
             */
            System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList());
            //System.out.println(recordStudent.getName()+" is taking "+recordStudent.getClassList()); you get compiler error as no get prefix for our accessor in record
            System.out.println(recordStudent.name()+" is taking "+recordStudent.classList());

        }
    }
}
class Student
{
    private String id,name,dateOfBirth,classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
