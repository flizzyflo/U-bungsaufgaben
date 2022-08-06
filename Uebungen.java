import java.util.Arrays;
import java.util.List;


public class Uebungen {

    private static boolean compareLetter (char letter1, char letter2) {

        int abstand = 'a' - 'A';

        return (letter1 == letter2
                            ||letter1 == letter2 - abstand
                            ||letter2 == letter1 - abstand);

    };

    private static double checkVars (double x, double y) {

        double erg = 0;
        erg = x + y;
        x = x ++;
        System.out.println("x: " + x + ", y: " + y);
        return erg;
    };

    private static long calcInterest (long betragInCent, int prozentsatz) {

        return betragInCent * prozentsatz / 100;

    };

    private static int calcTemperature (int fahrenheit) {

        int celsius =  (fahrenheit  - 32) * 5/9;

        return celsius;
    };

    private static double calcAverage(long a, long b, long c) {

        return (double) ((a + b + c)/ 3);
    }

    private static boolean isBigLetter (char letter) {
        return letter <= 'Z' && letter >= 'A';
    };

    private static String hourCount(int startTime, int endTime) {

        if (startTime == endTime) {
            int minDiff = 0;
            int hourDiff = 24;

            return hourDiff + " Stunden" + "\n" + minDiff + " Minuten";
        };

        int startHours = startTime / 100;
        int startMin = (startTime % 100);
        int endHours = endTime / 100;
        int endMin = (endTime % 100);
        int hourDiff = Math.abs(endHours - startHours);
        int minDiff = 0;


        if (endHours < startHours) {
            hourDiff = 24 - hourDiff;
        };

        if (endMin != 0) {
            minDiff = Math.abs(endMin - startMin);

        }

        else if (startMin == endMin) {
            minDiff = 0;
        }

        else {
            minDiff = Math.abs(60 - startMin);
        };


        if (endMin > startMin) {
            hourDiff ++;
        }

        else if (endMin < startMin) {
            hourDiff --;
        };

        return hourDiff + " Stunden" + "\n" + minDiff + " Minuten";
    };

    private static double calcPower(int p, int n) {

        if (n == 0 || p == 0){
            return p;
        };


        double res = Math.pow(p, n);

        return res;
    }

    private static String returnRectangle(int hoehe, int breite) {

        String result = new String();

        if (hoehe < 0 || breite < 0) {
            return result;
        };

        int curHeight = 0;

        while (curHeight < hoehe)
        {
            for (int i = 0; i < breite; i++) {
                result += "*";
            }
            result += "\n";
            curHeight ++;
        };

        return result;
    };

    private static void returnDivisiors (int testZahl) {
        
        System.out.println("Folgende Zahlen sind Teiler von '" + testZahl + "'':");
        for (int i = 1; i < testZahl; i++) {
            if (testZahl % i == 0){
                System.out.println(i);
            }
        };
    };

    private static void returnDaysPerMonth(int monat){
        if (monat < 1 || monat > 12) {
            System.out.println("Es gibt keinen solchen Monat");
        }

        else if (monat == 2){
            System.out.println("28/29 Tage");
        }

        else if (monat < 8){
            if (monat % 2 == 0){
            System.out.println("30 Tage");
            }
            else {
                System.out.println("31 Tage");
            };
        }

        else {
            if (monat % 2 == 0){
                System.out.println("31 Tage");
                }
                else {
                    System.out.println("30 Tage");
                };
        };
    };

    private static Double[][][] createEinheitsmatrix(int rows, int cols, int cols2) {

        Double [][][] res =  new Double[rows][cols][cols2];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols2; k++) {
                    
                    if (j == i) {
                        res[j][i][k] = 1.00;
                    }
                    else{
                        res[j][i][k] = (double)j * i * k;
                    }
                }
            }
        }
        return res;
    }

    private static String first(String a, String b) {
        int firstLetterToCompare = 0;
        int boundary = 1;

        if (a.compareTo(b) < 0) {
            return a;
        }
        return b;
        
    };

    private static void firsttt (String a, String b, String c) {
        System.out.println(first(a, first(b, c)));
    }

    private static boolean nameChecker(String name) {
        return name.toLowerCase().charAt(0) <= 122 && name.toLowerCase().charAt(0) >= 97 && name.contains("-");
    };

    private static void checkName(String name) {
        if (nameChecker(name)) {
            System.out.println(name.substring(0, 1).toUpperCase()+name.substring(1));
        };
    }

    private static int countValue(int val, int[] array) {
        int count = 0;
        if (array.length == 0){
            return 0;
        }
        else {
            for (int value: array) {
                if (val == value) {
                    count ++;
                };
            };
        }

        return count;
    };

    private static boolean stringEnthalten(String wert, String[] stringArray) {
        
        for (String wort: stringArray) {
            
            try{
                if (wort.equals(null)) {
                    continue;
                }
                else if (wort.equals(wert)) {
                    return true;
                };
            }
            catch (NullPointerException e) {
                continue;
            };
        };

        return false;
    }

    

    public static void main(String[] args) {
        
        // System.out.println(Uebungen.compareLetter('b', 'c'));
        // System.out.println(checkVars(010, 2.5));
        // System.out.println(calcTemperature(80));
        // System.out.println(isBigLetter('5'));
        // System.out.println(calcAverage(2, 3, 4));
        // System.out.println(hourCount(1445, 1445));
        // System.out.println(returnRectangle(4, 5));
        // returnDivisiors(8);
        // returnDaysPerMonth(8);
        List <Double[][]> arr = Arrays.asList(createEinheitsmatrix(3, 3, 3));
        double curMin = 0;
        double curMax = 0;


        for (Double[][] ar : arr) {
            for (Double[] ar2: ar) {
                for (double dou: ar2){

                    if (dou < curMin) {
                        curMin = dou;
                    }
                    else if (dou > curMax) {
                        curMax = dou;
                    };
                 }
            }
        }
        
        String[] stringArray = {"Test", "String", "Array", "Java", "Python", "Cool"};
        //{"Test", "String", "Array", "Java", "Python", "Cool"};
        System.out.println(stringEnthalten("Python", stringArray));
        // int[] array = {2, 3, 4, 5, 6, 2, 3, 4 , 5 , 6 ,7 ,8 ,9 ,1 ,1 ,2, 0, 0 , 2};
        // System.out.println(countValue(0, array));

    };

}

