package _2;

import java.util.Locale;

public class A_Car  {//we haven't done anything yet.we just created a blueprint for creating a car.
    /*we need to create some variables that are part of this class.till now you've seen variables used inside a method or
    code block.These were local variables because these were local to,or actually belonged to that method or code block.
    But we couldn't access those local variables outside of the method or block we declare them.Classes allow us to create
    variables that can be seen or are accessible by any code block within that class.But we can also allow access from outside
    the class itself.
    When we're designing our class,there are some things we want the public to know,and somethings that aren't necessary for the
    public to know.we can have a public interface.This is only the information the outside world needs to know to use our class.
    But we'll also have a non-public interface.This is information we may want to share but not always and not with everyone.
    We may need to share some information with our own company and other departments,while other data might need to be shared
    with our manufacturers and dealers,but not with the public.
    Java gives us the ability to have this kind of control by specifying different access modifiers for each member in class.
    Refer Access Modifiers for class members in OOPs notes.
     */
    //Now we're going to define fields for this class
    private String make="Tesla",model="Model X",color="Gray";
    private int doors=2;
    private boolean convertible=true;
    /*
    These are fields because they are defined in the class's code block or the body of the class and not in a method,
    When I create an object from this class,then the values I assign to these fields represent the state of the object.
    Unlike local variables,class variables should have some type of access modifier declared for it.if you don't declare one,
    Java declares the default one(package private),implicitly.
    So,here,I've set the access modifier to be private in all cases,which I've said will help us encapsulate this class.
    I'll want to control access to these fields,and this starts by making them private.
    Later,I'll add the methods to  access them.The other thing you might have noticed is that I'm not actually assigning any
    values yet.This is because,at this point,I don't know what these values might be,and they'll likely be different for each
    instance anyway.If I were creating a real application,I'd likely to have a lot more fields,but I'll keep this simple to
    start with.
     */
    //Let's add a method now that will print out this information about the car object.I'll call this method describe car
    //and make the method public,This method is not static because I'm accessing instance fields on the class.
    //Methods,unlike fields,will often be public because we want to give users a way to interact with the object.
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make)
    {
        //make=make;  //refer this section in OOP's notes.
        //this.make = make;//so what we meant here is that we're updating the contents of String make ->parameter to the
                        // field named private String make.
        //that's a way of updating the make attribute on car using a method instead of accessing it directly.
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden","porsche","tesla" -> this.make = make;
            default -> this.make = "Unsupported ";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar()
    {
        System.out.println(doors+"-Door "+color+" "+make+" "+model+" "+(convertible ? "Convertible":""));
    }
}
class Main
{
    public static void main(String[] args) {
        //The next thing we need to do is to create an object for the car class.
        //A_Car car = new A_Car();
        //if you run this you'll get -> 0-Door null null null
        /*
        Why the model,color and make null ?
        All of these fields are declared with the string data type,and we haven't assigned values to them.we know that
        Strings are really objects,not primitive data types so java assigned each a null reference.
        The other thing I want you to notice about is that Doors printed with value 0 and the word convertible wasn't
        printed in the output
         */
          //A_Car car = new A_Car();
          A_Car car = new A_Car();
          car.setMake("Porsche");//car.make="Porsche";
          car.setModel("Carrera");//car.model = "Carrera";
          car.setColor("Black");//car.color = "Red";
          car.setDoors(2);
          car.setConvertible(true);
          //to see the advantage of this refer OOP's notes this advantage
        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());
        car.describeCar();

        A_Car targa = new A_Car();
        targa.setMake("Porsche");//car.make="Porsche";
        targa.setModel("Targa");//car.model = "Carrera";
        targa.setColor("Red");//car.color = "Red";
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();
        /*
        But I think you will agree that this code is ugly.There's a lot of duplication of code and is somewhat painful to
        set data one field at a time,on each car object we create.And I've go five fields set up on it,so imagine if you
        had many more.we'll be looking at a better way to set data on an object -> Constructor.
         */
    }
    /*
    In last class,we saw that the best practice for fields is making them private,and creating a getter method to access
    those fields.This provides encapsulation of the internals of our class and supports maintenance of a public interface
    that doesn't have to change even though our class might.In this we'll see about setter methods which allow us to set or
    assign values to our fields.
     */

    /*
    what happens if we don't do the line 107
    Car car = new Car(); -> if you comment out the second bit ,you got only a variable -> Car car;
    but the line's after that will throw error as we haven't initialized it.
    You can't use a uninitialized variable,which car is,because I haven't assigned any object reference to it.
    What happens if we assign null reference to car ?
    Car car = null;
    Intellij won't show any errors if we do this step.But we'll get null pointer exception
    What it assumes is I have created a reference to a car,but it doesn't reference to a valid instance of a car.So,I can't run
    a method on null,and I couldn't set or get attributes on null.So,there's a distinction here I want to point between an
    uninitialized variable and a variable with null reference.
     */
}