package _3;

public class B_Encapsulation
{
    public static void main(String[] args) {
        /*Player player = new Player();
        player.fullName="Tim";//previously it's name.
        player.health=20;
        player.weapon="Sword";
        //Even though we're not in that class we can access the fields directly.Since we set the access modifier to public.
        int damage = 10;
        player.loseHealth(damage);
        /*
        Problem 1: we've created a method in here,lostHealth which the code that should manage the process of player losing
        health.This is where we want to put in all our formulas for making sure that we're calculating health correctly,when
        some damage happens.But what happens if the calling code,decides to just access the player's health directly,any time
        it wants? and sets the player health to anything it wants?lets say 200.it lead to unexpected results.
        "Allowing direct access to data on an object,can potentially bypass checks,and additional processing,your class has in
        place to manage the data"
        By being able to access fields directly like this,we're really potentially opening up our application,to be accessed
        in ways that it shouldn't be.May be we don't ever want the code to be able to change the health like that,because we
        really wanted the restore health method to be called,and the right set of conditions to be set.
        But because these fields are public to everyone,we can't control when they get accessed.
        let's say we want to change the player name from name -> fullName.
        again we need to change the instances where we are using the name variable as well in all the places we used that var.
        Problem 2:Allowing direct access to fields,means calling code would need to change,when you edit any of fields.
        The third issue with this approach is we're manually initalizing our objects with these calls at the start.
        This means the calling code is responsible for making all the right method calls, to initialize a player,at the start
        of the play.But the code might actually forget to initialize this all together.And consequently when the class is
        called for the first time,the player may be starting out with health=0.In other words,we're not guaranteeing or ensuring
        that to access the player class,we can only access it,when the data is valid.we can do that with a constructor.we can
        actually make sure that the data is valid and that the object is valid before the game starts.
        Problem 3:Omitting a constructor,that would accept initialization data,may mean the calling code is responsible for setup
        this data,on the new object.
        And this is what encapsulation does for us,and why we don't want to code like this,we want the ability to ensure certain
        conditions are met before playing,and that access to the player data during the game,is controlled and protected.
         */
        /*System.out.println("Remaining Health =  "+player.healthRemaining());
        player.health=200;
        player.loseHealth(11);
        System.out.println("Remaining Health =  "+player.healthRemaining());
        */
        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"Sword");
        //This is encapsulation ,even though we pass large data ,we have control over the data and make sure our fields are
        //private.The calling code has no idea what the internal naming was for the health field and it doesn't have to.
        System.out.println("Initial health is "+tim.healthRemaining());

    }
}
/*
Let's create a class that doesn't use encapsulation and understand why we need encapsulation in the first place.let the non
encapsulated class be Player.
Player
    name:String
    health:int
    weapon:String
    loseHealth(int damage)
    restoreHealth(int extraHealth)
    healthRemaining():int
 */
class Player
{
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        health-=damage;
        if(health <= 0)
        {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining()
    {
        return health;
    }
    public void restoreHealth(int extraHealth)
    {
        health+=extraHealth;
        if(health>100)
        {
            System.out.println("Player restored to 100%");
            health=100;
        }

    }

}

class EnhancedPlayer
{
    private String fullName,weapon;
    private int healthPercentage ;

    public EnhancedPlayer(String fullName) {
        this(fullName,100,"Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health <=0)
            this.healthPercentage =1;
        else if (health>100) {
            this.healthPercentage =100;
        }
        else
            this.healthPercentage =health;

        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        healthPercentage -=damage;
        if(healthPercentage <= 0)
        {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining()
    {
        return healthPercentage;
    }
    public void restoreHealth(int extraHealth)
    {
        healthPercentage +=extraHealth;
        if(healthPercentage >100)
        {
            System.out.println("Player restored to 100%");
            healthPercentage =100;
        }

    }

}