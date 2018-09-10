package com.sun.java8;

public class Main {

	public static void main(String[] args) {
		/*Calculator calc = new CalculatorImpl();
		int squareOf7 = calc.square(7);
		System.out.println(squareOf7);*/
		
		/*Calculator calc = new Calculator(){
			public int square(int value){
				return (value*value);
			}
		};		
		int squareOf6 = calc.square(6);
		System.out.println(squareOf6);*/
		
		
		Calculator calc = value ->  (value*value);
		
		int squareOf10 = calc.square(10);
		System.out.println(squareOf10);
		
	}

}
