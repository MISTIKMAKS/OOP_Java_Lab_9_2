package Lab9_2;

import java.util.Scanner;
import java.lang.Math;

public class Square implements Root, Print {

	private double a;
	private double b;
	private double c;
    private double result_a;
    private double result_b;

    public Square(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
    	return a;
    }

    public void setA(double a) {
        	this.a = a;
    }

    public double getB() {
    	return b;
    }

    public void setB(double b) {
    	this.b = b;
    }

    public double get—() {
    	return c;
    }

    public void set—(double Ò) {
    	this.c = Ò;
    }

	public double Result_A() {
		double d = 0;
        d = Math.pow(b, 2) - (4 * a * c);
        result_a = (-b + Math.sqrt(d)) / (2 * a);
        return result_a;

	}

	public double Result_B() {
		double d = 0;
        d = Math.pow(b, 2) - (4 * a * c);
        result_b = (-b - Math.sqrt(d)) / (2 * a);
        return result_b;
	}

    public void Print()
    {
    	System.out.println("-------------------------");
    	System.out.print("Square Result_A: ");
    	System.out.println((double) Math.round(Result_A() * 100) / 100);
    	System.out.print("Square Result_B: ");
        System.out.println((double) Math.round(Result_B() * 100) / 100);

    	System.out.println("-------------------------");
    }

    public double Result()
    {
    	// TODO Auto-generated method stub
    	return 0;
    }

}
