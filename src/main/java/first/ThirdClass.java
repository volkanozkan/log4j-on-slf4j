package first;

public class ThirdClass {

	SecondClass secondClass;

	// Call Method Of Second Class And Handle.
	public void callMethodOfSecondClass() throws CustomException {
		try {
			secondClass = new SecondClass();
			secondClass.callMethodOfFirstClassButNotHandle();
		} catch (ArithmeticException e) {
			throw new CustomException("Arithmetic Exception On: " + ThirdClass.class.getName(), e);
		}
	}

}