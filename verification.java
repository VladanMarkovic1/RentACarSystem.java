import java.util.Random;
import java.util.Scanner;

public class verification {

Scanner scanner = new Scanner(System.in);
    Random randomNuber = new Random();
int digitCode;
int customerConfirmation;

    public void lastStep(){
System.out.println("To make a deal, we need your verification");
System.out.println("We will send you 4 digit number ");
System.out.println("You must rewrite it to verify your self");

digitCode= randomNuber.nextInt(1000,9999);
System.out.println(digitCode);


while(true){
    customerConfirmation = scanner.nextInt();
    scanner.nextLine();
if(digitCode==customerConfirmation){
System.out.println("Car is succesfully rented");
break;
}   
 else {System.out.println(customerConfirmation + " Code is wrong.Please try again!");
}
}
}
}