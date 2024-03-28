import java.util.Scanner;

public class customerChoice {
    Scanner scanner = new Scanner(System.in);

    public void cuatomerChoice() {
        int customerChoice = scanner.nextInt();
        
        switch(customerChoice){
        case 1: BMW3();
        break;
        case 2: BMW5();
        break;
        case 3: AUDIA6();
        break;
        case 4: AUDIA7();
           }
          }
          
    public void BMW3(){
        System.out.println("You choose good car");
        System.out.println("Rent for BMW series 3 is 300$");
            }
        
            public void BMW5(){
                System.out.println("You choose nice car");
                System.out.println("Rent for BMW series 5 is 400$");
                    }
        
                    public void AUDIA6(){
                        System.out.println("You choose very strength car.");
                        System.out.println("Rent for AUDI A6 is 500$");
                            }
        
                            public void AUDIA7(){
                                System.out.println("You choose our best car");
                                System.out.println("Rent for AUDI A7 is 650$");
                                    }
}