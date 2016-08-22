package first;

public class SecondClass {
	
	FirstClass firstClass;

	public void callMethodOfFirstClassButNotHandle() {
		firstClass = new FirstClass();
		// Call Method Of First Class Without Handling.
		firstClass.generateException();
	}
}
