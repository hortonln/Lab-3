import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  
    System.out.println("Enter a number to count down or up from: ");
    Scanner s = new Scanner(System.in);
    
  
    // This is the number the user will type in
    int number = s.nextInt();
    
    //This is counting down
    if (number >= 0){
      while (number >=  0){ 
      System.out.println(number);
      number--;}
    }

    //This is counting up
      else {
        while (number <=  0) {
      System.out.println(number);
      number++;
        }
      }
      
        System.out.println("Blast Off!");
    
    }
  
  
}
