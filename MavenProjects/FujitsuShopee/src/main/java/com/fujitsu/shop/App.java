package com.fujitsu.shop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("Welcome");
        
		Product product = new Product(1001,"LED TV","Sony",45000.00f);
		product.display();
		try{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC Driver Loaded ");
		
		
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		
    }
}
