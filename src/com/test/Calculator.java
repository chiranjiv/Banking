package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Calculator {

	int[] data = {45,56,67};

	public void add(int a , int b) throws Exception{

		File file = new File("");

		//FileInputStream fis = 

		FileReader fr=new FileReader(file); 


		try{




			//int val = a/0;

			int val1 = data[5];

			//System.out.println("Calculator.add()"+ val);

			System.out.println("Calculator.add()");
		}catch(ArrayIndexOutOfBoundsException exception){

			throw new Exception("Isuue in geting the element in the array");

		}catch(NumberFormatException exception){
			//System.out.println("Calculator.add() getting issue while dividing the number");
			throw new Exception("Issue in dividing two numbers");
		}catch(Exception exception){
			//System.out.println("Calculator.add() Issue faced while adding two numbers");
			throw new Exception("Issue in adding two numbers");
		}

	}

	public void subtractNumber(int c , int d) throws ArrayIndexOutOfBoundsException,NumberFormatException,Exception{

		File file = new File("");

		//FileInputStream fis = 

		FileReader fr=new FileReader(file); 

	}

}
