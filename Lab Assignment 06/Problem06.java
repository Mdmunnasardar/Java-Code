import java.math.BigInteger;

class BoroIntErModdheNumberCharaArKisuDeyaJaiNaException extends Exception {
    public BoroIntErModdheNumberCharaArKisuDeyaJaiNaException(String message) {
        super(message);
    }
}

class BoroInt {
    private String val;

    public BoroInt() {
        this.val = "0";
    }

    public BoroInt(String val) {
        try {
            if (!validValue(val)) {
                throw new BoroIntErModdheNumberCharaArKisuDeyaJaiNaException("Invalid input: Only numerical values allowed.");
            }
            this.val = trim(val);
        } catch (BoroIntErModdheNumberCharaArKisuDeyaJaiNaException e) {
            System.out.println(e.getMessage());
            this.val = "0";
        }
    }

    public BoroInt(int val) {
        this.val = String.valueOf(val);
    }

    public BoroInt(BoroInt other) {
        this.val = other.val;
    }

    public String trim(String _val) {
        return _val.replaceAll("\\s", "");
    }

    public boolean validValue(String _val) {
        return _val.matches("\\d+");
    }

    public BoroInt add(BoroInt _val) {
        BigInteger result = new BigInteger(this.val).add(new BigInteger(_val.val));
        return new BoroInt(result.toString());
    }

    public BoroInt subtract(BoroInt _val) {
        BigInteger result = new BigInteger(this.val).subtract(new BigInteger(_val.val));
        return new BoroInt(result.toString());
    }

    public BoroInt multiply(BoroInt _val) {
        BigInteger result = new BigInteger(this.val).multiply(new BigInteger(_val.val));
        return new BoroInt(result.toString());
    }

    public BoroInt divide(BoroInt _val) {
        try {
            if (_val.val.equals("0")) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            BigInteger result = new BigInteger(this.val).divide(new BigInteger(_val.val));
            return new BoroInt(result.toString());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return new BoroInt("0");
        }
    }

    @Override
    public String toString() {
        return this.val;
    }
}

public class Problem06 {
    public static void main(String[] args) {
        try {
            BoroInt num1 = new BoroInt("6999");
            BoroInt num2 = new BoroInt("1540");

            BoroInt sum = num1.add(num2);
            BoroInt difference = num1.subtract(num2);
            BoroInt product = num1.multiply(num2);
            BoroInt quotient = num1.divide(num2);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

