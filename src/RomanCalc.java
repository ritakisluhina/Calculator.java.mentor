import java.util.Objects;

public class RomanCalc extends Calculator {
    @Override
    public int handleOperand(String operand) throws IllegalArgumentException {
        if (Objects.equals(operand, "I")) {
            return 1;
        } else if (operand.equals("II")) {
            return 2;
        } else if (Objects.equals(operand, "III")) {
            return 3;
        } else if (Objects.equals(operand, "IV")) {
            return 4;
        } else if (Objects.equals(operand, "V")) {
            return 5;
        } else if (operand.equals("VI")) {
            return 6;
        } else if (Objects.equals(operand, "VII")) {
            return 7;
        } else if (Objects.equals(operand, "IIX")) {
            return 8;
        } else if (Objects.equals(operand, "IX")) {
            return 9;
        } else if (Objects.equals(operand, "X")) {
            return 10;
        }
        throw new IllegalArgumentException("Unsupported operand " + operand + ".");
    }
}
