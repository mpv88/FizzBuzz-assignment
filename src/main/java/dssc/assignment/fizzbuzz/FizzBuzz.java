package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {
        String buzz = "buzz", fizz = "fizz", fizzbuzz = "fizzBuzz"; //initialise string variables
        int number = Integer.parseInt(args[0]);
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(fizzbuzz);
            } else if (i % 3 == 0) {
                System.out.println(fizz);
            } else if (i % 5 == 0) {
                System.out.println(buzz);
            } else System.out.println(i);
        }
    }
}