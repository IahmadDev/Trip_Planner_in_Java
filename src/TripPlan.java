import java.util.Scanner;
public class TripPlan {
    public static void main(String[] args)
    {
        Intro();
        Destination();
        Time();
        Area();
        AskAgain();


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
        double USDPerDay = Math.floor((USD/(double)Days)*100)/100;
        double ConvCurrencyPerDay = Math.floor((ConvertedCurrency/(double)Days)*100)/100;



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
        System.out.println("************************************************************************************");



    }

    public static void Area()
    {
        double KilometerSq;
        Scanner Input = new Scanner(System.in);
        System.out.println("Let me tell you few countries use imperial system so get you started I need to know few more things.");
        System.out.println("Tell me the area of destination in kilometerSquares: ");
        KilometerSq = Input.nextDouble();
        /*Calculations*/
        double MilesSq  = Math.floor((KilometerSq * 1.76)*100)/100;

        System.out.println("In miles^2 that will be: "+ MilesSq + ".");

    }
    public static void AskAgain()
    {
        int Answer;
        Scanner Input = new Scanner(System.in);
        System.out.println("Would you like to plan another trip (1 for YES and 2 for NO): ");
        Answer = Input.nextInt();
        if(Answer == 1){
            Intro();
            Destination();
            Time();
            Area();

        }else if(Answer == 2){
            System.out.println("****************************************************************************************");
            System.out.println("                               Thanks for visiting, See you again.                      ");
            System.out.println("****************************************************************************************");
            System.exit(0);

        }else{
            System.out.println("Enter your Answer again, correctly this time!!!");
            AskAgain();

    }
    }
}
