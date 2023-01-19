package org.datatype;


public class Variables<string> {
	public void number() {
		byte dig = 127;
		short empid = 32767;
		int rollno = 12345678;
		long phno = 9876543210l;
		float salary = 100000.42142f;
		double presalary = 150000.421421;
		char gender = 'M';
		String name = "Ajay";
		boolean maritialstaus = false;
		
		System.out.println("Digital no. is "+"\n" +dig);
		System.out.println("Employe ID no.is " +empid);
		System.out.println(rollno);
		System.out.println(phno);
		System.out.println(salary);
		System.out.println(presalary);
		System.out.println(gender);
		System.out.println(name);
		System.out.println(maritialstaus);
	}
	public static void main(String[] args) {
		Variables d = new Variables();
		d.number();
		
	}
}
