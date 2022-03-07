//Scott Shannon     Mod 8 Assignment        20 Feb 2022

//Write a program with four methods for calculating the cost of a yearly auto service visit. 
// public class AutoService {
    //Write a main method that will test each of these methods two times.
//     public static void main(String[] args) {
      
//         System.out.println(yearlyService());
      
//       	System.out.println("The standard service charge and oil change fee costs: $" + yearlyService(100)); // Prints 600
//       	System.out.println("The standard service charge and oil change fee costs: $" + yearlyService(120)); // Prints 620
      
//       	System.out.println("The standard service charge, oil change fee, and tire rotation charge costs: $" + yearlyService(100, 20)); //prints 620
//       	System.out.println("The standard service charge, oil change fee, and tire rotation charge costs: $" + yearlyService(120, 40)); //prints 660
      
//       	System.out.println("The standard service charge, oil change fee, and tire rotation charge, with this coupon costs: $" + yearlyService(100, 20, 120)); //prints 500
//       	System.out.println("The standard service charge, oil change fee, and tire rotation charge, with this coupon costs: $" + yearlyService(120, 40, 140)); //prints 520
//     }
  
//     private static final int STANDARD_SERVICE_CHARGE = 500;

//     //The methods will be titled yearlyService.
//     //yearlyService(no parameters) - Will return the standard service charge.
//     private static int yearlyService(){
//         return STANDARD_SERVICE_CHARGE;
//     }

//     //yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
//     private static int yearlyService(int oilChangeFee){
//         return yearlyService() + oilChangeFee;
//     }

//     //yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
//     private static int yearlyService(int oilChangeFee, int tireRotationCharge){
//         return yearlyService(oilChangeFee) + tireRotationCharge;
//     }

//     //yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
//     private static int yearlyService(int oilChangeFee, int tireRotationCharge, int coupon){
//         return yearlyService(oilChangeFee, tireRotationCharge) - coupon;
//     }
// };
