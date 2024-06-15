package _3;

public class A_Compositon
{
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"2540 x 1440");
        Motherboard theMotherBoard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherBoard);
        /*
        Here we're creating thePc object by passing 3 other objects to it as well as model and manufacturer.In previous section
        with inheritance,we were able to use a method from the base class.But how do we get access to composite objects methods?
        How do we make it to do anything?or we can say one of its parts to do something.For example,if we want to draw something
        on monitor,but how do we access this method.well,we can get the Personal Computer's monitor object using the getter method.
        and then call drawPixelAt on that object,so let's do that:
         */
        //thePC.getMonitor().drawPixelAt(10,10,"red");
        /*that's one way of executing functionality by using the getter method form personal computer to get the instance of
        the monitor class,that the personal computer contains.In this code,from that returned object,we're chaining the call
        to the method drawPixelAt.And that's invoking that method for us.Likewise,we could call the method loadprogram on the
        motherboard,passing it windows OS ,for example as the program we want to run.
        */
        //thePC.getMotherboard().loadProgram("Windows OS");
        //thePC.getComputerCase().pressPowerButton();
        /*In all the 3 cases theCase,Motherboard,theMonitor we're accessing the functions in other classes but we're accessing
        them through thePC object.This is what composition is,this is what difference from inheritance.What we did to call the
        PC object was,we created our case,our monitor and our motherboard.And in reality,when you're putting a computer together,
        that's what you'd be doing.You'd buy the computer case ,you'd buy the monitor and you'd buy the motherboard,and you'd
        then put them together to build the PC.Let's continue now and look at another scenario whereby we can hide the functionality
        further.In this case we're not going to allow the calling program,to access those objects,the parts directly.
        We don't want anybody to access the Monitor,Motherboard or ComputerCase directly
        */
        //we comment out those methods and instead we're calling the powerUp function
        thePC.powerUp();
        /*
        From the calling code's perspective,this code in main didn't have to know anything about PersonalComputer's parts,
        to get the PC to do something.
        Composition is creating Objects within Objects.
        It's like we're creating a master object.In this case,the personal computer is managing and looking after its parts,
        and it uses composition to achieve that.
         */
    }
}
class Product
{
    private String model,manufacturer;
    private int width,height,depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
class Monitor extends Product{
    private int size;
    private String resolution;
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAt(int x,int y,String color)
    {
        System.out.println(String.format(
                "Drawing pixel at %d,%d in color %s ",x,y,color
        ));
    }
}
class Motherboard extends Product{
    private int ramSlots,cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program "+programName+"is now loading......");
    }
}
class ComputerCase extends Product{
    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton()
    {
        System.out.println("Power button Pressed");
    }
}
class PersonalComputer extends Product {
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor,
                            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //As part of hiding functionality ,let's hide these getters.
/*    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }*/
    /*
    By commenting these getters we're encapsulating these attributes from calling code.
    Now we get error in main method because those methods no longer exist.We really don't want the main class or any class except
    the Personal Computer class,to make calls on this parts.Let's create methods on PersonalComputer.
     */
    //We'll implement the drawLogo() in a private method.We'll just call that drawPixelAt in the monitor attribute of our computer.
//we're making this private,because the only code we want to draw the computer manufacturer logo,is the personal computer itself.
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    //Next we can call this method ,from the method called power up.if you think about a computer when it starts up,you
    //press the power button,and then you see a logo come up on the screen.
    public void powerUp()
    {
        computerCase.pressPowerButton();
        drawLogo();
    }
    /*
    Here we have a public function called PowerUp and private function called draw logo.The power up function of the
    personal computer will draw that logo on the screen,as part of starting up the computer.
     */
}
