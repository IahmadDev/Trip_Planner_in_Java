import java.util.Scanner;
public class TripPlan {
    public static void main(String[] args)
    {
        Intro();
        Destination();
        Time();


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
        int Days;
        double USD,Conversion;
        String Currency;

        Scanner Input = new Scanner(System.in);

        System.out.println("");
        System.out.println("How many days you will be travelling? ");
        Days = Input.nextInt();
        System.out.println("What is your budget for this trip in USD: $");
        USD = Input.nextDouble();
        System.out.println("To convert your currency write the first three letters of destination currency: ");
        Currency = Input.next();
        System.out.println("What is conversion rate W.R.T 1 USD: ");
        Conversion = Input.nextDouble();

        System.out.println("");
        System.out.println("************************************************************************************");

        /*Calculations*/
        int Hours = Days * 24;
        int Minutes = Hours * 60;
        double ConvertedCurrency = USD * Conversion;
        double USDPerDay = USD / Days;
        double ConvCurrencyPerDay = ConvertedCurrency / Days ;


        System.out.println("Your trip will be as long as "+ Days + " or "+ Hours + " hours or "+ Minutes + " Minutes.");
        System.out.println("If your budget in USD is $"+ USD + " then you can spend $"+ USDPerDay + " per day.");
        System.out.println("And your converted currency in "+ Currency +" is " + ConvertedCurrency + Currency + " and you can spend "+ ConvCurrencyPerDay + Currency+" per day."  );
        System.out.println("************************************************************************************");


    }

    public static void Time()
    {
        int TimeDiff;
        Scanner Input = new Scanner(System.in);
        System.out.println("");
        System.out.println("What is time difference between your home and destination(-ve if behind): ");
        TimeDiff = Input.nextInt();
        /*Time Difference Calculations*/
        int TimeHome = 24;
        int TimeDestinationMidnight = (24 + (TimeDiff)) % 24;
        int TimeDestinationNoon = (12 + (TimeDiff)) % 24;

        System.out.println("It means that if its midnight at home there will be "+TimeDestinationMidnight+":00 at destination.");
        System.out.println(" and if its noon at home there will be "+TimeDestinationNoon+":00 at destination.");



    }

    public static void Area()
    {
        Scanner Input = new Scanner(System.in);

    }
}
