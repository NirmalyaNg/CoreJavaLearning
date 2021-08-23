package objectOrientedProgramming;

public class OOPS_24_Wrapper_Class {
	public static void main(String[] args) {
		int a = 10;
		byte b = 5;
		char ch = 'a';
		boolean bool = true;
		double d = 10.23;
		float f = 10.10f;
		short s = 15;
		long l = 13547l;
		
		Integer aObj = Integer.valueOf(a);  // Boxing
		Byte bObj = Byte.valueOf(b); 
		Character cObj = Character.valueOf(ch);
		Boolean boolObj = Boolean.valueOf(bool);
		Double dObj = Double.valueOf(d);
		Float fObj = Float.valueOf(f);
		Short sObj = Short.valueOf(s);
		Long lObj = Long.valueOf(l);
		
		Integer aObj1 = 10; // Autoboxing
		Byte bObj1 = 5;
		Character cObj1 = 'x';
		Boolean boolObj1 = false;
		Double dObj1 = 10.147;
		Float fObj1 = 7.44f;
		Short sObj1 = 5;
		Long lObj1 = 10074L;
		
		int a1 = aObj1.intValue(); // Unboxing
		byte b1 = bObj1.byteValue();
		char ch1 = cObj1.charValue();
		boolean bool1 = boolObj1.booleanValue();
		double d1 = dObj1.doubleValue();
		float f1 = fObj1.floatValue();
		short s1 = sObj1.shortValue();
		Long l1 = lObj1.longValue();
		 
		int a2 = aObj1; // Autoboxing
		byte b2 = bObj1;
		char c2 = cObj1;
		boolean bool2 = boolObj1;
		double d2 = dObj1;
		float f2 = fObj1;
		short s2 = sObj1;
		long l2 = lObj1;
		
		
		
	}
}
