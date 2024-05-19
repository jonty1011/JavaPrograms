import java.util.Scanner;

public class Exceptionhand {

    /**
     * @param dividend
     * @param divisor
     * @throws ArithmaticException
     */
    public static void divisiondemo(int dividend , int divisor) throws ArithmeticException{
        System.out.println("The result is :" + dividend/divisor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int dividend = sc.nextInt();
        // int divisor = sc.nextInt();

        int arr[] = new int[5];
       
    //    try{
    //     int result = dividend/ divisor;
    //     System.out.println("Your Answer is :" + result);
    // }catch(ArithmeticException e){
    //     System.out.println("Divisor can't be 0!!!");
    // }

    // try{
    //     System.out.println("I am in first try block!!!");
    //      arr[6] = 10;
    // }catch(Exception e){
    //     System.out.println(e.getMessage());
    //  }
    // catch(Exception e){
    //     System.out.println(e.getMessage());
    //  }

    // int age = sc.nextInt();
    // if(age>18){
    //     throw new RuntimeException("Sorry you can't vote!!!");
    // }else{
    //     System.out.println("you are eligible to vote!!!");
    // }
 divisiondemo(10,0);
    
}
  
}
