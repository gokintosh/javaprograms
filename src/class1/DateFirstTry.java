package class1;

public class DateFirstTry {
	public String month;
	public int day;
	public int year;
	
	public void writeOutput() {
		System.out.println(month + " "+day+", "+year);
	}
	public void yellIfNewYear() {
		if(month=="January" && day==1) {
			System.out.println("hurray its new year!");
		}
		else {
			System.out.println("no its not new year yet!");
		}
	}

}
