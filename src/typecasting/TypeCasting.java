package typecasting;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		
		byte byteResult;
		short shortResult;
		int   intResult;
		long  longResult;
		float floatResult;
		double doubleResult;
		
		Scanner scc= new Scanner(System.in);
		
		System.out.println("Type Any Byte value below to check typcasting ");
		
		byte byteValue = scc.nextByte();
		
		System.out.println("\n");
		System.out.println("WIDENING:");
		System.out.println("\n");		
		System.out.println("Byte Value =" + " " + (byteResult = byteValue) + " " + "," +"short value = " + " " + 
		(shortResult=byteResult) + " " + "," + " int value =" + " " + (intResult = byteValue) + " " + "," + " " +  "long value ="+ " " +(longResult = byteValue)
		 + " " + "," + " " + " float value =" + " " + (floatResult= byteValue) + " " + "," + " " + "double value =" + " " + (doubleResult= byteValue));
		
		System.out.println("\n");
		System.out.println("Type Any short value below to check typcasting ");
		short shortValue= scc.nextShort();
		System.out.println("\n");
		System.out.println("Byte Value =" + " " + (shortResult = (byte)shortValue) + "(Narrowing)" + " " + "," +"short value = " + " " + (shortResult=(short)shortValue) + "(Narrowing)" +  " " + "," + " int value =" + " " + (shortResult = shortValue) + " " + "," + " " +  "long value ="+ " " +(shortResult = shortValue)
		+ " " + "," + " " + " float value =" + " " + (shortResult= shortValue) + " " + "," + " " + "double value =" + " " + (shortResult= shortValue));
		
		
		System.out.println("\n");
		System.out.println("Type Any int value below to check typcasting ");
		int intValue= scc.nextInt();
		System.out.println("\n");
		System.out.println("Byte Value =" + " " + (byteResult = (byte)intValue) + "(Narrowing)" + " " + "," +"short value = " + " " + (shortResult=(short)intValue) + "(Narrowing)" +  " " + "," + " int value =" + " " + (intResult = intValue) + " " + "," + " " +  "long value ="+ " " +(longResult = intValue)
		+ " " + "," + " " + " float value =" + " " + (floatResult= intValue) + " " + "," + " " + "double value =" + " " + (doubleResult= intValue));
		
		System.out.println("\n");
		System.out.println("Type Any long value below to check typcasting ");
		long longValue= scc.nextLong();
		System.out.println("\n");
		System.out.println("Byte Value =" + " " + (byteResult = (byte)longValue) + "(Narrowing)" + " " + "," +"short value = " + " " + (shortResult=(short)longValue) + "(Narrowing)" +  " " + "," + " int value =" + " " + (intResult = (int) longValue)+ "(Narrowing)" + " " + "," + " " +  "long value ="+ " " +(longResult = longValue)
		+ " " + "," + " " + " float value =" + " " + (floatResult= longValue) + " " + "," + " " + "double value =" + " " + (doubleResult= longValue));
		
		System.out.println("\n");
		System.out.println("Type Any float value below to check typcasting ");
		float floatValue= scc.nextFloat();
		System.out.println("\n");
		System.out.println("Byte Value =" + " " + (byteResult =(byte) floatValue) + "(Narrowing)" + " " + "," +"short value = " + " " + (shortResult=(short)floatValue) + "(Narrowing)" +  " " + "," + " int value =" + " " + (intResult = (int) floatValue)+ "(Narrowing)" + " " + "," + " " +  "long value ="+ " " +(longResult = (long)floatValue)
		+ "(Narrowing)" + " " + "," + " " + " float value =" + " " + (floatResult= floatValue) + " " + "," + " " + "double value =" + " " + (doubleResult= floatValue));
		
		System.out.println("\n");
		System.out.println("Type Any double value below to check typcasting ");
		double doubleValue= scc.nextDouble();
		System.out.println("\n");
		System.out.println("Byte Value =" + " " + (byteResult =(byte) doubleValue) + "(Narrowing)" + " " + "," +"short value = " + " " + (shortResult=(short)doubleValue) + "(Narrowing)" +  " " + "," + " int value =" + " " + (intResult = (int)doubleValue)+ "(Narrowing)" + " " + "," + " " +  "long value ="+ " " +(longResult = (long)doubleValue)
		+ "(Narrowing)" + " " + "," + " " + " float value =" + " " + (floatResult=(float)doubleValue)+ "(Narrowing)" + " " + "," + " " + "double value =" + " " + (doubleResult= doubleValue));
		
		System.out.println("\n");
		System.out.println("THANK YOU");
	}

}
