class Complex { 
    private double realPart; 
    private double imaginaryPart; 

    // Default constructor 
    public Complex() { 
        this.realPart = 0; 
        this.imaginaryPart = 0; 
    } 

    // Parameterized constructor 
    public Complex(double realPart, double imaginaryPart) { 
        this.realPart = realPart; 
        this.imaginaryPart = imaginaryPart; 
    } 

    // Addition method 
    public Complex add(Complex otherNumber) { 
        return new Complex(this.realPart + otherNumber.realPart, 
        this.imaginaryPart + otherNumber.imaginaryPart); 
    } 

    // Subtraction method 
    public Complex subtract(Complex otherNumber) { 
        return new Complex(this.realPart - otherNumber.realPart, 
        this.imaginaryPart - otherNumber.imaginaryPart); 
    } 

    // Multiplication method 
    public Complex multiply(Complex otherNumber) { 
        double real = this.realPart * otherNumber.realPart - 
        this.imaginaryPart * otherNumber.imaginaryPart; 
        double imaginary = this.realPart * otherNumber.imaginaryPart + 
        this.imaginaryPart * otherNumber.realPart; 
        return new Complex(real, imaginary); 
    } 

    // Division method 
    public Complex divide(Complex otherNumber) { 
        double denominator = otherNumber.realPart * otherNumber.realPart + 
        otherNumber.imaginaryPart * otherNumber.imaginaryPart; 
        if (denominator == 0) { 
            throw new ArithmeticException("Division by zero is not allowed"); 
        } 
        double real = (this.realPart * otherNumber.realPart + 
        this.imaginaryPart * otherNumber.imaginaryPart) / denominator; 
        double imaginary = (this.imaginaryPart * otherNumber.realPart - 
        this.realPart * otherNumber.imaginaryPart) / denominator; 
        return new Complex(real, imaginary); 
    } 

    // Setters 
    public void setRealPart(double realPart) { 
        this.realPart = realPart; 
    } 

    public void setImaginaryPart(double imaginaryPart) { 
        this.imaginaryPart = imaginaryPart; 
    } 

    // Getters 
    public double getRealPart() { 
        return realPart; 
    } 

    public double getImaginaryPart() { 
        return imaginaryPart; 
    } 

    // toString method 
    @Override 
    public String toString() { 
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i"; 
        } else {
            return realPart + " - " + Math.abs(imaginaryPart) + "i"; 
        }
    } 
}

public class Problem07 { 
    public static void main(String[] args) { 
        Complex n1 = new Complex(1, 5); 
        Complex n2 = new Complex(4, -2); 

        Complex summation = n1.add(n2); 
        Complex difference = n1.subtract(n2); 
        Complex product = n1.multiply(n2); 
        Complex quotient = n1.divide(n2); 

        System.out.println("First Complex Number: " + n1); 
        System.out.println("Second Complex Number: " + n2); 
        System.out.println("Addition: " + summation); 
        System.out.println("Subtraction: " + difference); 
        System.out.println("Multiplication: " + product); 
        System.out.println("Division: " + quotient); 
    } 
} 
