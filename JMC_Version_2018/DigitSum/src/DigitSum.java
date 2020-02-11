public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number) {
        int digitONES=0;
        int digitTENS =0;
        int digitHUNDREDS=0;
        int digitTHOUSANDS=0;
        if (number < 10){
            return -1;
        }
        if (number >= 10) {
            digitONES = number % 10;
            digitTENS = number/10;
            digitHUNDREDS = number / 100;
            digitTHOUSANDS = number / 1000;
            return (digitONES + digitTENS + digitHUNDREDS + digitTHOUSANDS);
        } else {
            return -1;
        }


    }
}