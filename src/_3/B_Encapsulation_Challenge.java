package _3;

public class B_Encapsulation_Challenge
{
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
//        System.out.println(printer.addToner(51));
//        System.out.println(printer.printPages(10));
        System.out.println("initial page count = "+printer.getPagesPrinted());
        //printer.printPages(13);
        //System.out.println("final page count = "+printer.getPagesPrinted());
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",printer.printPages(5),printer.getPagesPrinted());
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",printer.printPages(10),printer.getPagesPrinted());
    }
}
class Printer
{
    private int tonerLevel,pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted=0;
        this.tonerLevel = (tonerLevel>= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount)
    {
        int tempAmount = tonerAmount+tonerLevel;

        if(tempAmount<0 || tempAmount>100)
            return -1;
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages)
    {
        int jobPages = (duplex) ? ((pages/2)+(pages%2)) : pages;
        pagesPrinted += jobPages;
        return jobPages;
/*        if(duplex)
        {
            pages/=2;
            pagesPrinted+=pages;
            System.out.println("it's a duplex printer");
            return pagesPrinted;
        }
        return pagesPrinted+pages;
*/
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}