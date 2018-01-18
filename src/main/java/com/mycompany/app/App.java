package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        addTwoNumber(3,5);
    }

    public static int addTwoNumber(int a, int b){
    	int result = a + b;
    	System.out.println( "input is " + a + " and " + b + " result is " + result );
    	return a + b;
    }
}
