import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ex1
        System.out.println(isPrime(5));

        //Ex2
        System.out.println(isPerfect(6));

        //Ex3
        System.out.println(isPalindrome("azerty ytreza"));
        System.out.println(isPalindrome("azertyytreza"));
        System.out.println(jeopardy(50,generateRandom(100)));
    }

    public static boolean isPrime(int number) {
        if(number <=1) return false;

        //for (int i =2; i<= number/2; i++) {
        for (int i =2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfect(int number) {
        if(number <1) return false;

        int sum =1;
        for (int i =2; i < number; i++) {

            if (number % i == 0) {
                sum+=i;
            }
        }
        /*
        if (number== sum){
            return true;
        }
        return false; */
        return (number==sum);
    }

    public static boolean isPalindrome(String string) {
        if (string.length()<1) return false;
        string.toLowerCase(); //*
        for (int i= 0; i< string.length()/2;i++) { // string.length()/2=1 si string.length()=3
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }
/* 2° Façon
    public static boolean isPalindrome2(String string) {
        if (string.length()<1) return false;
        string.toLowerCase(); //*

        Stringbuilder stringbuilder = new StringBuilder();

        return (stringBuilder.Reverse().equals(word));
    }

 */

    public static int generateRandom (int max){
    return generateRandom (0, max);
        }

    public static int generateRandom (int min,int max){
        Random rand= new Random();
        return rand.nextInt(max-min+1)+min;
    }


    public static String jeopardy(int number, int goal) {

        if (number<goal)
        {
            return "<";
        }else { /*
            if (number==goal) {
                return "=";
            }else {
                return ">";
                }

        */
        String string= (number==goal)? "=": ">";
        return string;
        }

    }


}
