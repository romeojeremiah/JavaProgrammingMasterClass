public class FeetAndInches {
    public static void main(String[] args){
         calcFeetAndInchesToCentimeters(6, 0);

        calcFeetAndInches(156);


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >=0) && (inches >=0 && inches <=12)){
            double feetToCentimeters = feet*12*2.54;
            double inchesToCentimeters = inches*2.54;
            double totalCentimeters = feetToCentimeters + inchesToCentimeters;
            System.out.println("Total number of centimeters: " + totalCentimeters);
            return totalCentimeters;
        } else
            System.out.println("Invalid");
            return -1;
    }

    public static double calcFeetAndInches(double inches){
        if (inches >=0 ){

            double feet = (int) inches /12;
            double inchesRemaining = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + inchesRemaining + " inches");
            return calcFeetAndInchesToCentimeters(feet, inchesRemaining);
        } else
            return -1;
    }
}
