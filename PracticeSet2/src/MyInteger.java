// Justin Mercado
// Problem Set 2
// https://github.com/justinmercado/PS2.git

public class MyInteger {

	private int value;

	// Constructor
	public MyInteger(int value) {
		this.value = value;
	}

	// Getter
	public int getValue() {
		return value;
	}

	// Methods
	public boolean isEven() {
		return (value % 2 == 0);
	}

	public boolean isOdd() {
		return (this.value % 2 != 0);
	}

	public boolean isPrime() {
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Static methods using INT
	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}

	public static boolean isPrime(int value) {

		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Static methods using MyInteger
	public static boolean isEven(MyInteger MyInt) {
		return (MyInt.value % 2 == 0);
	}

	public static boolean isOdd(MyInteger MyInt) {
		return (MyInt.value % 2 != 0);
	}

	public static boolean isPrime(MyInteger MyInt) {
		for (int i = 2; i < MyInt.value; i++) {
			if (MyInt.value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Returns TRUE if the value in the object is equal to the specified value.
	public boolean equals(int value) {
		return (value == getValue());
	}

	// Returns TRUE if the value in the object is equal to the specified value.
	public boolean equals(MyInteger MyInt) {
		return (MyInt.value == getValue());
	}

	// Calculates the sum of an array (numeric values).
	public static int parseInt(char[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}

	// Converts a String into a Integer value.
	public static int parseInt(String value) {
		int NewValue = Integer.parseInt(value);
		return NewValue;
	}

}
