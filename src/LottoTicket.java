import java.util.Arrays;

public class LottoTicket
{
    /* No instance variables */
    private final int[] numbers;
    private final int superBall;

    // Generates a lotto ticket with regNums numbers between 1 and regMax, and one power number between 1 and powMax:
    public LottoTicket(int regNums, int regMax, int powMax) {
        numbers = new int[regNums];
        superBall = randomIntegerBetween(1,powMax);

        for (int i=0; i<regNums; i++) {
            numbers[i] = randomIntegerBetween(1,regMax);
        }

        Arrays.sort(numbers);
    }

    // Generates a random number between min and max, inclusive, returns that random number:
    public int randomIntegerBetween(int min, int max) {
        return (int)(Math.random() * (max-min+1)) + min;
    }

    // Generates and returns a String containing ticket numbers:
    public String getLuckyNumbers() {
        StringBuilder str = new StringBuilder();
        for (int num : numbers) {str.append(num).append(", ");}
        return str.append(superBall).toString();
    }
}
