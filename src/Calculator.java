public abstract class Calculator {
    public int calculate(String aa, String bb, String operator) throws Exception {
        int a = handleOperand(aa);
        int b = handleOperand(bb);
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0){
                    throw new IllegalArgumentException("You cannot divide by 0.");
                }
                return (a / b + a % b);
            default:
                throw new IllegalArgumentException("Unsupported operator.");
        }
    }

    protected abstract int handleOperand(String ab) throws Exception;
}
