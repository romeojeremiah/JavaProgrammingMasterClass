public class ForLoop {
    public static void main (String[] args) {
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(14));

        int number = 13;
        int finishNumber = 40;
        int evenCount = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }else {
                evenCount++;
                if (evenCount == 5)
                    break;
                }


            System.out.println("Even number " + number);
        }
        System.out.println("Found " + evenCount + " even numbers");

    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
}
