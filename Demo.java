class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        EvenOddNumber checker = new EvenOddNumber();
        int numberToCheck = 5;
        boolean isEven = checker.findEvenOrOdd(numberToCheck);

        if (isEven) {
            System.out.println(numberToCheck + " is an even number");
        } else {
            System.out.println(numberToCheck + " is an odd number");
        }
    }
}