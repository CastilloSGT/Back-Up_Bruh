package Exercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DataZ {
	private int day;
	private int month;
	private int year;
	
	public DataZ(int dia, int mes, int ano) {
		setDay(dia);
		setMonth(mes);
		setYear(ano);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public void ToString() {
		try {
			LocalDate.of(year, month, day);
			System.out.println();
		}catch(DateTimeException e) {
			System.out.println("Erro:" +e);
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
