import java.util.Scanner;

public abstract class Animal
{

    protected static int health;
    protected static int killCount;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health=health;
    }



    public int getKillCount() {
        return killCount;

    }

    public boolean attack(Object object) {
        int targetHealth=((Attacker) object).getHealth();
        if(!(object instanceof AngryDuck) && health>0 && targetHealth > 0) //if not of same type then and alive then attack
        {
            if(targetHealth==1) {
                this.killCount++;
            }
            ((Attacker) object).setHealth(targetHealth-1);
            System.out.println("AngryDuck attacked "+object.getClass().getSimpleName()+", KillCount :"+this.killCount);
            return true;
        }
        else {
            System.out.println("AngryDuck cannot attack "+object.getClass().getSimpleName());
            return false;
        }

    }

    public interface Attacker {
        int getKillCount();
        int getHealth();
        void setHealth(int health);
        boolean attack(Object object);

    }

    /*


    public Animal(String name, String primaryColor)
    {
        super();
        count ++;
        Animal.name = name;
        this.primaryColor = primaryColor;

    }

    // set & get name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        Animal.name = name;
    }

    // set & get primaryColor
    public String getPrimaryColor()
    {

        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor)
    {
        this.primaryColor = primaryColor;
    }

    // s%g Health
    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        Animal.health = health;
    }


    // hit & isAlive status
    public static void attack()
    {
        //User can choose which animal start fight
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the name of animal to test:");
        System.out.println("CB for CuriousBunny");
        System.out.println("HP for HappyPig");
        System.out.println("LG for LoudGoose");
        System.out.println("AD for AngryDuck");

        String userInputContent = s.next();

        switch (userInputContent) {
            case "CB":

                System.out.println("CuriousBunny is not a attacker!");
                if (isAlive) {
                    System.out.println("The animal started attacking!");
                    health--;
                    if (!isAlive()) {
                        System.out.println("Animal is already fainted, can't hit it again!");
                        return;
                    }
                }
                if (health == 0) {
                    isAlive = false;
                    count--;
                    System.out.println("*************************************************");
                    System.out.println(name + " The enemy fainted and it scored points!");
                    System.out.println("*************************************************");
                }
                break;
            case "HP":
                System.out.println("HappyPig Can not attack!");
                if (isAlive) {
                    System.out.println("The animal started attacking!");
                    health--;
                    if (!isAlive()) {
                        System.out.println("Animal is already fainted, can't hit it again!");
                        return;
                    }
                }
                if (health == 0) {
                    isAlive = false;
                    count--;
                    System.out.println("*************************************************");
                    System.out.println(name + " The enemy fainted and it scored points!");
                    System.out.println("*************************************************");
                }
                break;
            case "LG":
                System.out.println("LoudGoose Can attack!");
                if (isAlive) {
                    System.out.println("The animal started attacking!");
                    health--;
                    if (!isAlive()) {
                        System.out.println("Animal is already fainted, can't hit it again!");
                        return;
                    }
                }
                if (health == 0) {
                    isAlive = false;
                    count--;
                    System.out.println("*************************************************");
                    System.out.println(name + " The enemy fainted and it scored points!");
                    System.out.println("*************************************************");
                }
                break;
            case "AD":
                System.out.println("AngryDuck Can attack!");
                if (isAlive) {
                    System.out.println("The animal started attacking!");
                    health--;
                    if (!isAlive()) {
                        System.out.println("Animal is already fainted, can't hit it again!");
                        return;
                    }
                }
                if (health == 0) {
                    isAlive = false;
                    count--;
                    System.out.println("*************************************************");
                    System.out.println(name + " The enemy fainted and it scored points!");
                    System.out.println("*************************************************");
                }
                break;
            default:
                System.out.println("Please enter CB, HP, LG or AD.");
                attack();
        }
    }

    public String toString()
    {
        return "Name:" + name +
                "\nColor:" + primaryColor +
                "\nhealth:" + health;
    }

    public static boolean isAlive()
    {
        return isAlive;
    }

     */
}
