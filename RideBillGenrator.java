import java.util.*;
public class RideBillGenrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ride bill genrator");
        System.out.println("Input of Height in cm");
        int height = sc.nextInt();
        if(height < 120){
            System.out.println("Can't Ride");
        }else{
            System.out.println("Can ride! \n What is the age?");
            int age = sc.nextInt();
            if(age < 12){
                System.out.println("Do you want to click photos? Yes/no");
                String age12 = sc.next();
                if(age12.equalsIgnoreCase("yes")){
                    System.out.println("your total bill is"+ 5+3 +"$" );
                }else if(age12.equalsIgnoreCase("no")){
                    System.out.println("Your total bill is="+5);
                }else{
                    System.out.println("Invalid input");
                }
            }else if(age == 12 && age < 18){
                System.out.println("Do you want to click photos? Yes/no");
                String age18 = sc.next();
                if(age18.equalsIgnoreCase("yes")){
                    System.out.println("your total bill is"+ 7+3 +"$" );
                }else if(age18.equalsIgnoreCase("no")){
                    System.out.println("Your total bill is="+7+"$");
                }else{
                    System.out.println("Invalid input");
                }
            }else if (age == 18 && age < 45 ){
                System.out.println("Do you want to click photos? Yes/no");
                String age45 = sc.next();
                if(age45.equalsIgnoreCase("yes")){
                    System.out.println("your total bill is"+ 12+3 +"$" );
                }else if(age45.equalsIgnoreCase("no")){
                    System.out.println("Your total bill is="+12+ "$");
                }else{
                    System.out.println("Invalid input");
                }
            }else if(age == 45 && age < 56){
               System.out.println("Do you want to click photos? Yes/no");
                String age55 = sc.next();
                if(age55.equalsIgnoreCase("yes")){
                    System.out.println("your total bill is"+ 0+3 +"$" );
                }else if(age55.equalsIgnoreCase("no")){
                    System.out.println("Your total bill is="+0+ "$");
                }else{
                    System.out.println("Invalid input");
                } 
            }else{
                System.out.println("Cant Ride");
            }
        }
        
    }
    
}