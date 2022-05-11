package Exercicio2;

public class Data {
	private int day;
	private int month;
	private int year;
	
	public Data() {
		
	}
	
	public Data(int dia, int mes, int ano) {
		setDay(dia);
		setMonth(mes);
		setYeaar(ano);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day > 0 && day < 31) {
			this.day = day;
		}else {
			System.out.println("Valor para dia invalido");
		}
		
		
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 0 && month <13) {
			this.month = month;
		}else {
			System.out.println("Valor para mês invalido");
		}
		
	}

	public int getYeaar() {
		return year;
	}

	public void setYeaar(int year) {
		if(year > 1800 && year < 2023) {
			this.year = year;
		}else {
			System.out.println("Valor para ano invalido");
		}
		
	}

	public void ToString() {
		System.out.println(day+"/"+month+"/"+year+"\n");
	}

}
