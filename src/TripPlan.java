import java.util.Scanner;
public class TripPlan {
    public static void main(String[] args)
    {
        Intro();


    }

    public static void Intro()
    {
        String Name,Destination;//Variables Defined
        Scanner Input = new Scanner(System.in);//Input Initialize
        /*LOGO*/
        System.out.println("****************************************************************************************");
        System.out.println("                               Welcome to Trip Planner                                  ");
        System.out.println("****************************************************************************************");
        System.out.println("May I know your name?");

        Name = Input.nextLine();//Input name

        System.out.println("Nice to meet you "+ Name + "\nNow tell me where are you traveling?");

        Destination = Input.nextLine();

        System.out.println("What a great place to visit "+ Destination + " is!!!");
        System.out.println("");
        System.out.println("*************************************************************************************");



    }

    public static void Destination()
    {
        Scanner Input = new Scanner(System.in);

    }

    public static void Time()
    {
        Scanner Input = new Scanner(System.in);

    }

    public static void Area()
    {
        Scanner Input = new Scanner(System.in);

    }
}
