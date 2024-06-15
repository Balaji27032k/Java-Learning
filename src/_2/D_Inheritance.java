package _2;

public class D_Inheritance
{
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");
        /*
        Did you notice,here we are passing Dog object as argument when the type was declared as animal,why is this ok?
        it works because Dog inherits from Animal,it's a type of animal as we've said.we can pass a dog instance to any method
        that takes an animal.
        we created a dog with a default constructor so nothing got set on this class,but you can see dog has inherited all of
        animals attributes on the last line ->Animal{type='null',size='null',weight=0.0}
        The values have the default values for their type,because we didn't create a way to pass any data to these fields on Dog.
         */

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("Labrador Retreiever",65,"Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"slow ");

        Fish goldie = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(goldie,"fast");
        /*
        We used Animals's fields and behaviours,the ones we wanted to use,and then added some more specific elements to
        the Fish class.And we passed Fish to a method,that never even had to know a Fish class existed.We're going to be
        coming back to this particular feature a lot,because it has a special name,Polymorphism.
        Polymorphism
        Ploymorphism simply means 'many forms'.
        Advantages of Polymorphism are:
            it makes code simpler - we can write code once,using the base class or super class,as we did with our doAnimalStuff
            method.We wrote that code without ever having to know about subclass types.We didn't have to write code to check the
            type of the object,and then decide what method to call,Java did all that at runtime.
            It encourages code extensibility - it's very easy to subclass,and override or extend the method,that'll be called as
            we demonstrated.
            In Java all classes and that includes any we create implicitly inherit from a single built in java class.
         */

    }
    /*
    Before we create any instances,I want to create a method on the Main class,that'll take any Animal object and execute its
    3 methods.
     */
    public static void doAnimalStuff(Animal animal,String speed)
    {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
/*
A class diagram allows us to design our classes before we build them.This diagram shows the animal class,with the attributes
we think that every kind of animal has.
Below the fields,we have the behaviour that animals have in common,move and makeNoise.
Animal
    type:String
    size:String
    weight:double
    -------------
    move(String speed)
    makeNoise()
 */
class Animal
{
    protected String type;  //changing the type from private to protected so that we can access this field in subclass is
    private String size;    //called conditional encapsulation.we're allowing some limited access,to our internal fields and
    //that's to subclasses.
    private double weight;

    public Animal()
    {

    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed)
    {
        System.out.println(type+" moves "+speed);
    }
    public void makeNoise()
    {
        System.out.println(type+" make some kind of noise");
    }
}
/*
Dog
    earShape:String
    tailShape:String
    ----------------
    bark()
    run()
    walk()
    wagTail()
 */
class Dog extends Animal
{
    /*public Dog()
    {
        super();//it's a way to call constructor on the super class
    }*/
    private String earShape,tailShape;

    public Dog(String type,double weight){
        this(type,weight,"Perky","Curled");
    }//This constructor makes it simpler to create a dog object for the majority of dogs(if their ears are perky & tails
    //curled).it calls other dog constructor that has 4 params,which in turn calls the animal constructor.
    public Dog(String type, double weight, String earShape, String tailShape) {//remove size here
        super(type, weight<15?"small":(weight<35?"medium":"large"), weight);//based on weight we calculate size here.
        this.earShape = earShape;//we couldn't do this opeartion before the call to super that's y do in super param itself
        this.tailShape = tailShape;//using ternary operator.
        //This is one way to perform calculations,in your constructor and pass the result to super call.
    }

    public Dog()
    {
        super("Mutt","Big",50);
    }

    @Override
    public String  toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();//this is different from the super() call.it's a lot like using the this keyword
    }//with the dot notation,to access a field on the current instance.this code allows us to call super class's method.
    public void makeNoise()
    {
        bark();
        System.out.println();
    }
    /*
    Yorkie make some kind of noise
    _ _ _ _
    Labrador Retreiever make some kind of noise
    These outputs we are unable to see after creating this method in Dog class.As this method which doesn't do anything
    was called and not the one we defined in Animal class was called.i.e we've overridden animal's makenoise method.
     */

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail ");
        if(speed=="slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
    }
    /*
    look at the difference between our makeNoise()->manually overridden and move(String speed) automatically generated
    from intellij tool,Intellj code has @override symbol and the automatically generated code simply makes a call to
    the parent class's method using the keyword super.move().it's simply executes the animal class's move method,which
    would have happened if we didn't create this method at all.why would we do this? well most likely we'll want to change
    or extend the code here.we change the makeNoise method by having a method with no code at all.This changed the
    behaviour of makeNoise for all Dog objects(it made all our dogs silent for the moment).Next,lets extend the
    functionality for the move method.this means we'll do what the animal class does,but we'll do additional stuff as well.
    So,we extended the functional behaviour of Animal for Dogs.We used what was there(with the call to super.move() but
    then added our own code to it.
     */
    /*Inheritance 3
    Let's continue our example by adding other methods that are specific to Dog.
    let's make our methods private as we are calling those methods from move method.It is a reminder to you that
    not all methods needs to be exposed,especially if you only intend them to be called internally from the current class.
    You can separate the functionality that's just for a dog,and only include it in the dog class.
     */
    private void bark()
    {
        if(type=="Wolf")//if we try to refernce the type we'll get a compiler error.type=="Wolf" so change type to protected.
        {
            System.out.print("Ow wooooo!");
        }
        System.out.println("Woof! ");
    }
    private void run()
    {
        System.out.print("Dog Running ");
    }
    private void walk()
    {
        System.out.print("Dog Walking ");
    }
    private void wagTail()
    {
        System.out.print("Tail Wagging ");
    }
}
/*
class diagram with additional class,Fish
Fish
    fins:int
    gills:int
    moveMuscles()
    moveBackFins()
 */
class Fish extends Animal {
    private int gills, fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.print("muscles moving ");
    }

    private void moveBackfin() {
        System.out.print("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackfin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
