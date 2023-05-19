package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposite(int deposite) {
		System.out.println(deposite);
		super.deposite(10000);
		super.saving();
		this.fixed(60000);

	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposite(11000);

		System.out.println("welcome to java");
		System.out.println("welcome to selenium");

		System.out.println("maven project");
		System.out.println("Api project");

	}
}
