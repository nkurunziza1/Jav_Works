import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        final byte MONTHS_IN_YEAR = 12;
//        final  byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Principle:");
//        int principal = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.print("Period (year):");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                /(Math.pow(1 + monthlyInterest, numberOfPayments) -1);
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage:" + mortgageFormatted);

//        int x = 1;
//        int y = 1;
//        int temperature = 20;
//        boolean isWarm = temperature > 20 && temperature < 30;
//         boolean hasHighIncome = true;
//         boolean hasGoodCredit = true;
//         boolean isCriminalRecord = false;
//         boolean isEligible = (hasGoodCredit || hasGoodCredit) && !isCriminalRecord;
//           int temperature = 32;
//
//           if (temperature > 30) {
//               System.out.print("it's a hot day !");
//               System.out.print("Drink  water !");
//           }
//           else if (temperature < 30)
//               System.out.print("it's warm to day !");
//           else
//               System.out.print("it's a cold day !");
//        int income = 120_000;
//        String className = income >  100_000 ? "First" : "Economic";
//        System.out.print(className);

//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.print("you are an admin");
//                break;
//            case "moderator":
//                System.out.print("you are an moderator");
//                break;
//            default:
//                System.out.print("you are a guest");
//
////        }
//        Scanner scanner = new Scanner(System.in);
//        int  Number = scanner.nextInt();
//
//        int number = 5;
//        Object isDivisibleByThree = number % 3 == 0 ? "Fizz" : number;
//        Object isDivisibleByFive = number % 5 == 0 ? "Buzz" : number;
//        Object isDivisibleByBoth = number % 3 ==0 && number % 5 == 0 ? "FizzBuzz": "";
//
//        System.out.print("");
//        System.out.print(isDivisibleByFive);
//        System.out.print(isDivisibleByThree);
//        System.out.print(isDivisibleByBoth);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number");
//        int number = scanner.nextInt();
//
//         if (number % 3 == 0 && number % 5 == 0)
//            System.out.print("FizzBuzz");
//        else if(number % 5 == 0){
//            System.out.print("Fizz");
//        }
//        else if (number % 3 == 0)
//            System.out.print("buzz");
//        else
//            System.out.print(number);
//

//    Scanner scanner = new Scanner(System.in);
//    String input = "";
//     while(true){
//         System.out.print("Number:");
//         input  = scanner.next();
//         if(input.equals("pass"))
//             continue;
//         if(input.equals("quit"))
//             break;
//
//        String[] fruits = {"apple", "mango", "banana"};
//        for (String fruit: fruits)
//         System.out.println(fruit);

        //project

//        sum

//        int a =64;
//        int b=4;
//        System.out.print("this the sum of a and b:" + Integer.sum(a, b));

// reverse string

//   String str ;
//   Scanner scanner = new Scanner(System.in);
//   System.out.print("Enter a string");
//   str = scanner.nextLine();
//   char[] ch = str.toCharArray();
//   System.out.println("Reverse of a String:");
//   int j = str.length();
//
//   for(int i=j; i>0; i--)
//       System.out.print(ch[i-1]);

        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int) ( 100 * Math.random());

        int k = 5;
        int i, guess;

        System.out.print(
                         "A number is chosen between 1 to 100 Guess the number within 5 trials"
                       );

        for(i=0; i>k; i++){
            System.out.print("guess the numbe:");
             guess = scanner.nextInt();
             if(number == guess){
                 System.out.println("Congratulations !" + "you Guessed the number");
                 break;
             }
             else if(number > guess && i != k - 1 ){
                     System.out.println("number is greater than" + guess);
             }
             else if(number < guess && i != k - 1 ){
                 System.out.println("number is less than" + guess);
             }
             if(i == k){
                 System.out.println("you have exhausted" + "K trials");
                 System.out.println("the number is " + number);
             }
        }
    }

}
