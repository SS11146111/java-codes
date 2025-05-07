package com.sangita.trycatch;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Exception1 obj = new Exception1(2,0); obj.divide();
		 */
		
		/*
		 * Exception2 obj = new Exception2(); obj.display();
		 */
		
		/*
		 * NestedTryCatch obj = new NestedTryCatch(); obj.display();
		 */

		/*
		 * TryCatchFinally obj = new TryCatchFinally(
		 * "C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\trycatch\\example.txt"
		 * ); obj.read();
		 */
		
		/*
		 * FinallyException obj = new FinallyException(); obj.method();
		 */
		
		/*
		 * ScannerTest obj = new ScannerTest(); obj.method();
		 */
		
		/*
		 * NegativeArgument exp = new NegativeArgument(-5); exp.findElement();
		 */
		
		/*
		 * ThrowsExample eg = new ThrowsExample(
		 * "C:\\\\Users\\\\User\\\\eclipse-workspace\\\\practice_codes\\\\codes\\\\src\\\\com\\\\sangita\\\\trycatch\\\\example.txt"
		 * ); try { eg.read(); } catch(IOException e) {
		 * System.out.println(e.getMessage()); }
		 */
		
		/*
		 * MultipleThrows obj = new MultipleThrows(
		 * "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\eclipse-workspace\\\\\\\\practice_codes\\\\\\\\codes\\\\\\\\src\\\\\\\\com\\\\\\\\sangita\\\\\\\\trycatch\\\\\\\\example.txt"
		 * ); try { obj.read(); } catch(IOException e) {
		 * System.out.println("IOException occurred"); } catch(NumberFormatException e)
		 * { System.out.println("NumberFormat Exception occurred"); }
		 */
		
		/*
		 * PropagateUnchecked p = new PropagateUnchecked(); try {
		 * 
		 * p.n(); } catch(ArithmeticException e) { System.out.println(e.getMessage()); }
		 */
		
		/*
		 * PropagateChecked obj = new PropagateChecked(); try { obj.n(); }
		 * catch(IOException e) { System.out.println(e.getMessage()); }
		 */
		
		/*
		 * ThrowLoop obj = new ThrowLoop(); try { obj.breakWithThrow(); }
		 * catch(IOException e) { System.out.println(e.getMessage()); }
		 */
		
		
		/*
		 * CheckAge age = new CheckAge(4); try { age.validate(); }
		 * catch(InvalidAgeException e) { System.out.println(e.getMessage()); }
		 */
		
		
		/*
		 * CustomCheckedUnchecked demo = new CustomCheckedUnchecked();
		 * 
		 * try { demo.readFile("data.pdf"); } catch (InvalidFileFormatException e) {
		 * System.err.println("File Error: " + e.getMessage()); }
		 * 
		 * try { demo.checkNumber(-10); } catch(NegativeNumberException e) {
		 * System.err.println("Input error: " + e.getMessage()); }
		 */
		
	
		/*
		 * Demo d = new Demo(); try { d.print(); } catch(ConstructorException e) {
		 * System.err.println(e.getMessage()); }
		 */
		
		/*
		 * Demo2 d = new Demo2(); try { d.display1(); } catch (DatabaseException e) {
		 * System.err.println("Caught: " + e.getMessage()); }
		 * 
		 * try { d.display2(); } catch (FileException e) { System.err.println("Caught: "
		 * + e.getMessage()); }
		 */
		
		BankingException obj = new BankingException();
		
		try
		{
			obj.withdraw(500);
		}
		catch(InsufficientBalanceException e)
		{
			System.err.println(e.getMessage());
		}
		finally {
			
			obj.deposit(1000);
			obj.withdraw(400);
		}
	
		
		
	}

}
