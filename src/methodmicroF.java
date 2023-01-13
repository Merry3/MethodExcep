import java.util.Scanner;

public class methodmicroF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Greeting();
        System.out.print("HELLO, PLEASE INSERT YOUR NAME");
        String name = input.next();
        System.out.println("Hello " + name + " Please insert your date of birth");
        int dob = input.nextInt();

        String loanType = null;
        int moneyToLoan = 0;
        if (statusCheck(dob).equalsIgnoreCase("adult")) {
            System.out.println("Please answer the next few questions");
            System.out.println("Enter type of loan.  \n" + " 1, Business" + "\n" + " 2, car " + "\n" + " 3, House" + "\n");
            loanType = input.next();

            conditionsave();
            System.out.println("how much is your saving amount?");
            int savingAmount = input.nextInt();
            System.out.println("how much money you want to take as a loan?");
            moneyToLoan = input.nextInt();
            double loan = savingAmount * 4;
            if (moneyToLoan > loan) {
                System.out.println("you have insufficient saving amount for the loan");
            }
        } else {

            System.out.println("under age");
        }
           interest(loanType, moneyToLoan);
            }
            static void Greeting() {
                System.out.println(" ");
                System.out.println("WELCOME TO THE COMPANY!");
                System.out.println("This microfinance has been established in 2013 by the help of volunteer youths.");
                System.out.println("Now we have more than hundred employee and in this year we are going to celebrate our 10th anniversary ");
                System.out.println(" ");
            }
            static String statusCheck(int dob) {
                int age = 2023 - dob;
                if (age > 18)
                    return "adult";
                else
                    return "under age";
            }
            static void conditionsave() {
                Scanner input = new Scanner(System.in);

                System.out.println("How long you are saving in this microfinance? ");
                int savingMonth = input.nextInt();
                if (savingMonth < 6) {
                    System.out.println(" SORRY,You are not eligible for the loan.");
                } else {
                    System.out.println("we are going to check your saving amount ");
                }
            }

            static String  interest(String loanType,int moneyToLoan) {
                Scanner input = new Scanner(System.in);
                System.out.println("Within how many years you will payback the loan?");
                int interest = input.nextInt();
                if (loanType.equalsIgnoreCase("car")) {
                    double interestOfCar = interest * (0.13) * moneyToLoan;
                    System.out.println("Your interest is " + interestOfCar);
                } else if (loanType.equalsIgnoreCase("Business")) {
                    double interestOfBusiness = interest * (0.08) * moneyToLoan;
                    return "Your interest is " + interestOfBusiness;
                } else if (loanType.equalsIgnoreCase("house")) {
                    double interestOfHouse = interest * (0.15) * moneyToLoan;
                    return "Your interest is " + interestOfHouse;
                }
                return loanType;
            }
        }


