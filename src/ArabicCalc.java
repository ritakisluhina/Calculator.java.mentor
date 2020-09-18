public class ArabicCalc extends Calculator {
    @Override
    protected int handleOperand(String operand) throws IllegalArgumentException {
        if (Integer.parseInt(operand) > 10 || Integer.parseInt(operand) < 0) {
            throw new IllegalArgumentException("You can only use numbers from 0 to 10.");
        }
        return Integer.parseInt(operand);
    }
    @Override
    public String intToRoman (int num) {
        return Integer.toString(num);
    }
}