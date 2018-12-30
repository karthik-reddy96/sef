package calculator;

/**
 * <p> Title: TestCharCode. </p>
 * 
 * <p> Description: A component of the Calculator application </p>
 * 
 * <p> Copyright: Lynn Robert Carter Â© 2017 </p>
 * 
 * @author Lynn Robert Carter
 * @author  karthik
 * 
 * @version 12 The mainline of a JavaFX-based GUI implementation of a UNumber calculator 
 * 
 */

public class TestBusinessLogiccc {

	/**********
	 * This class roots the execution of the test of the BusinessLogic class.  The application 
	 * tests the class by invoking the class methods and checking the result to see if the results 
	 * are proper.
	 * 
	 */
	
	/*********************************************************************************************/
	
	/**********
	 * The check method compares an Expected String to an Actual String and returns true if the 
	 * Strings match and false otherwise.  In addition, the Strings are displayed to the console
	 * and a message is display stating whether or not there is a difference.  If there is a
	 * difference, the character at the point of the difference in the actual String is replaced
	 * with a "?" and both are displayed making it clear what character is the start of the
	 * difference
	 * 
	 * @param Expected	The String object of the expected value
	 * @param Actual		The String object of the actual value
	 */
	private static boolean check(String expected, String actual) {
		// Display the input parameters
		System.out.println("***Expected String");
		System.out.println(expected);
		System.out.println("***Actual String");
		System.out.println(actual);
		
		// Check to see if there is a difference
		int lesserLength = expected.length();
		if (lesserLength > actual.length()) lesserLength = actual.length();
		int ndx = 0;
		while (ndx < lesserLength && expected.charAt(ndx) == actual.charAt(ndx))
			ndx++;
		
		// Explain why the loop terminated and if there is a difference make it clear to the user
		if (ndx < lesserLength || lesserLength < expected.length() || lesserLength < actual.length()) {
			System.out.println("*** There is a difference!\n" + expected.substring(0, ndx) + "? <-----");
			return false;
		}
		System.out.println("*** There is no difference!\n");
		return true;
	}
	
	/*********************************************************************************************/
	
	/**********
	 * This main method roots the execution of this test.  The method ignores the program
	 * parameters.  After initializing several local variables, it performs a sequence of
	 * tests, displaying information accordingly and tallying the number of successes and
	 * failures.
	 * 
	 * @param args	Ignored by this application.
	 */
	public static void main(String[] args) {
		// Display the header message to the console and initialize local variables
		System.out.println("Test BusinessLogic Class\n");
		int numPassed = 0;
		int numFailed = 0;
		
		// 1. Perform a default constructor test
		BusinessLogic test = new BusinessLogic();								// Perform the test
		
		System.out.println("1. No input given");								// No input that was given

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.00000000000000000000E+0\n" + 
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = false\n" + 
				"operand2 = +0.00000000000000000000E+0\n" + 
				"     operand2ErrorMessage = \n" + 
				"     operand2_error_ErrorMessage = \n" + 
				"     operand2Defined = false\n" + 
				"result = +0.00000000000000000000E+0\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" +
				"*******************\n\n", test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();
		
		/*
		// 2. Perform setOperand1 test
		test = new BusinessLogic();											// Set up for the test
		
		boolean flag1 = test.setOperand1("1234567890123456"); // Perform the test
		boolean flag2=test.setOperand1_error("0.01");
		
		System.out.println("2. Input = \"1234567890123456\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\nReturned boolean = truetrue\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.12345678901234560E+16\n" + 
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = true\n" + 
				"operand2 = +0.00000000000000000000E+0\n" + 
				"     operand2ErrorMessage = \n" + 
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = false\n" + 
				"result = +0.00000000000000000000E+0\n" +
				"     resultErrorMessage = \n" +
				"     result_error_ErrorMessage = \n" +
				"*******************\n\n", "\nReturned boolean = " + flag1 +flag2+ test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();
		
		/*
		// 3. Perform setOperand2 test
		test = new BusinessLogic();											// Set up for the test
		
		flag = test.setOperand2("123");							// Perform the test
		
		System.out.println("3. Input = \"123\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\nReturned boolean = true\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n"+
				"operand1 = +0.00000000000000000000E+0\n" +
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = false\n" +
				"operand2 = +0.1230E+3\n" +
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = true\n" +
				"result = +0.00000000000000000000E+0\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" + 
				"*******************\n\n", "\nReturned boolean = " + flag + test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();

		
		// 4. Perform setResult test
		test = new BusinessLogic();											// Set up for the test
		
		flag = test.setResult("123456","0.2");							// Perform the test
		
		System.out.println("4. Input = \"123456\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\nReturned boolean = true\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" +
				"operand1 = +0.00000000000000000000E+0\n" +
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = false\n" +
				"operand2 = +0.00000000000000000000E+0\n" +
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = false\n" +
				"result = +0.1234560E+6\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" +
				"*******************\n\n", "\nReturned boolean = " + flag + test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();

		
		// 5. Perform setOperand1ErrorMessage test
		test = new BusinessLogic();											// Set up for the test
		
		test.setoperand1ErrorMessage("Test message for operand1");				// Perform the test
		
		System.out.println("5. Input = \"Test message for operand1\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.00000000000000000000E+0\n" +
				"     operand1ErrorMessage = Test message for operand1\n" +
				"     operand1_error_ErrorMessage = \n"+
				"     operand1Defined = false\n" +
				"operand2 = +0.00000000000000000000E+0\n" +
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n"+
				"     operand2Defined = false\n" + 
				"result = +0.00000000000000000000E+0\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" + 
				"*******************\n\n", test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();

		
		// 6. Perform getOperand1ErrorMessage test
		test = new BusinessLogic();											// Set up for the test
		
		test.setoperand1ErrorMessage("Test message for operand1");				// Perform the test
		
		System.out.println("6. Input = \"Test message for operand1\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("Test message for operand1", test.getoperand1ErrorMessage())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();

		
		// 7. Perform setOperand2ErrorMessage test
		test = new BusinessLogic();											// Set up for the test
		
		test.setoperand2ErrorMessage("Test message for operand2");				// Perform the test
		
		System.out.println("7. Input = \"Test message for operand2\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.00000000000000000000E+0\n" +
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = false\n" + 
				"operand2 = +0.00000000000000000000E+0\n" +
				"     operand2ErrorMessage = Test message for operand2\n" +
				"     operand2_error_ErrorMessage = \n"+
				"     operand2Defined = false\n" + 
				"result = +0.00000000000000000000E+0\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" +
				"*******************\n\n", test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();

		
		// 8. Perform getOperand2ErrorMessage test
		test = new BusinessLogic();											// Set up for the test
		
		test.setoperand2ErrorMessage("Test message for operand2");				// Perform the test
		
		System.out.println("8. Input = \"Test message for operand2\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("Test message for operand2", test.getoperand2ErrorMessage())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();


		
		// 9. Perform setResultErrorMessage test
		test = new BusinessLogic();											// Set up for the test
		
		test.setResultErrorMessage("Test message for result");					// Perform the test
		
		System.out.println("9. Input = \"Test message for result\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.00000000000000000000E+0\n" +
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = false\n" + 
				"operand2 = +0.00000000000000000000E+0\n" +
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = false\n" + 
				"result = +0.00000000000000000000E+0\n" +
				"     resultErrorMessage = Test message for result\n" +
				"     result_errorErrorMessage = \n"+
				"*******************\n\n", test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();

		
		//10. Perform getResultErrorMessage test
		test = new BusinessLogic();											// Set up for the test
		
		test.setResultErrorMessage("Test message for result");					// Perform the test
		
		System.out.println("10. Input = \"Test message for result\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("Test message for result", test.getResultErrorMessage())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();
		
		
		//11. Perform addition test
		test = new BusinessLogic();											// Set up for the test
		
		test.setOperand1("12345678");
		test.setOperand2("87654321");
		String answer = test.addition();
		
		System.out.println("11. Input = \n\"12345678\"\n\"87654321\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\nReturned string = +0.999999990E+8;0.0\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.123456780E+8\n" +
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = true\n" + 
				"operand2 = +0.876543210E+8\n" +
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = true\n" + 
				"result = +0.999999990E+8\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" +
				"*******************\n\n", "\nReturned string = " + answer + test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();
		
		
		//12. Perform subtraction test
		test = new BusinessLogic();											// Set up for the test
		
		test.setOperand1("1234");
		test.setOperand2("8765");
		answer = test.subtraction();
		
		System.out.println("12. Input = \n\"1234\"\n\"8765\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\nReturned string = -0.75310E+4;0.0\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.12340E+4\n" +
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = true\n" + 
				"operand2 = +0.87650E+4\n" +
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = true\n" + 
				"result = -0.75310E+4\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" +
				"*******************\n\n", "\nReturned string = " + answer + test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();
		
		*/
		//13. Perform multiplication test
		test = new BusinessLogic();											// Set up for the test
		
		test.setOperand1("1234");
		test.setOperand1_error("0.1");
		test.setOperand2("8765");
		test.setOperand2_error("0.1");
		answer = test.multiplication();
		
		System.out.println("13. Input = \n\"1234.0\"\n\"8765.0\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\nReturned string = +0.10816E+8;+0.100340E+4\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.12340E+4\n" + 
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = true\n" + 
				"operand2 = +0.87650E+4\n" + 
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = true\n" +  
				"result = +0.10816E+8\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" + 
				"*******************\n\n", "\nReturned string = " + answer + test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();
		
		*/
		//14. Perform division test
		test = new BusinessLogic();											// Set up for the test
		
		test.setOperand1("12345678");
		test.setOperand2("87654321");
		String answer = test.division();
		
		System.out.println("13. Input = \n\"12345678\"\n\"87654321\"");

		// Check the actual output against the expected.  If they match, the test has been passed and display the proper
		// message and tally the result
		if (check("\nReturned string = +0.1408450588534021043868447740300218628127E+0\n******************\n" + 
				"*\n" + 
				"* Business Logic\n" + 
				"*\n" + 
				"******************\n" + 
				"operand1 = +0.1234567800000000000000000000000000000000E+8\n" +
				"     operand1ErrorMessage = \n" +
				"     operand1_error_ErrorMessage = \n" +
				"     operand1Defined = true\n" + 
				"operand2 = +0.8765432100000000000000000000000000000000E+8\n" +
				"     operand2ErrorMessage = \n" +
				"     operand2_error_ErrorMessage = \n" +
				"     operand2Defined = true\n" + 
				"result = +0.1234567800000000000000000000000000000000E+8\n" +
				"     resultErrorMessage = \n" +
				"     result_errorErrorMessage = \n" + 
				"*******************\n\n", "\nReturned string = " + answer + test.debugToString())) {
			numPassed++;
			System.out.println("\tPass");
		}
		// If they do not match, display that there was a failure and tally that result
		else {
			numFailed++;
			System.out.println("\tFail");
		}
		System.out.println();


		
		System.out.println("Number of tests passed: " + numPassed);
		System.out.println("Number of tests failed: " + numFailed);

	}
}
