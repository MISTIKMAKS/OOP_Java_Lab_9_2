package Lab9_2;

import java.util.Scanner;

import Lab9_2.Linear;
import Lab9_2.Root;
import Lab9_2.Square;

import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Linear:");
        Root line_r = new Linear(2, 3);
        System.out.println(line_r.Result());
        Print line_p = new Linear(2, 3);
        line_p.Print();

        System.out.println("");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("");

        System.out.println("Square:");
        Root square_r = new Square(9, -12, -5);
        System.out.println((double) Math.round(square_r.Result_A() * 100) / 100);
        System.out.println((double) Math.round(square_r.Result_B() * 100) / 100);
        Print square_p = new Square(9, -12, -5);
        square_p.Print();

	}

}
