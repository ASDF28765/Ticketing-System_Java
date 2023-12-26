import java.util.Scanner;

public class bookingmovies{
    public static void main(String [] args){
        String name;
        int age;
        int Movie_number;



        System.out.println("Welcome to MovieBooking.com");
        System.out.println(" ");

       
        

        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your name: ");
        name = scnr.nextLine();
        System.out.print("What is your age: ");
        age = scnr.nextInt();


        //Display the Movies;
        System.out.println(" ");
        System.out.println("Monives Display below:");
        System.out.println("1. Aladin, Price $15");
        System.out.println("2. Robot, Price $10");
        System.out.println("3. Spiderman, Price $20");
        System.out.println("4. Robotron, Price $5");
        System.out.println("5. The Last Of US, Price $25");



        //Selecting The Movies
        System.out.println(" ");
        System.out.print("Selected the Follow Movie Number: ");
        Movie_number = scnr.nextInt();

        
        switch(Movie_number){
            case 1: System.out.println("You Selected Aladin, Price $15");
                  break;

            case 2: System.out.println("You Selected Robot, Price $10");
                  break;
                     
            case 3: System.out.println("You Selected Spiderman, Price $20");
                  break;

            case 4: System.out.println("You Selected Robotron, Price $5");
                  break;

            case 5: System.out.println("You Selected The Last of US, Price $25");
                  break;
            default:System.out.println("Invalid, Try Again!");
                   break; 
    
    

    }

       
        if((Movie_number >= 1) && (Movie_number <=5) ){ // 1-5
        System.out.println(" ");
        System.out.println("Ticket ID");
        System.out.println("Name: " + name);
        System.out.println("Movie: "+ Movie_number);
        System.out.println("Thank You for Booking With US!");
        } 
        else{
            System.out.println("Try Again");
        }



    }
}