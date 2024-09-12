public class Main {

    public static void main(String[] args) {
        printFactors(6);
        System.out.println("");
        printFactors(32);
        System.out.println("");
        printFactors(10);
        System.out.println("");
        printFactors(-1);

    }

    private static void printFactors(int number) {
        //Check if number is negative. If so return -1
        if (number < 0){
            System.out.println("Invalid");
        }

        for(int i = 1; i <= number; i++){
            //check if number mod i is 0
            if (number % i == 0) {
                //If so print it use System.out.print() not System.out.println().  Don't forget a space between
                System.out.print(i + " ");
                //If not don't do anything
            }else {
                System.out.print("");
            }
        }


    }

}