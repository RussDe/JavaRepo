package interview.solutions;

public class Power {

    int toPower(int number, int power) {
        if (number == 0)
            return 0;
        //base condition
        if (power == 0)
            return 1;
        else {
            return number * toPower(number, power - 1);
        }

    }
    public static void main(String[] args) {
//        Power ex = new Power();
//        System.out.print("Enter number and power: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int power = sc.nextInt();
//        Assert.check(number > 0 && power > 0, "not positive");
//        int result = ex.toPower(number, power);
//        Assert.check(result == 27, "not correct");
//        System.out.print("Result = " + result);

    }
}
