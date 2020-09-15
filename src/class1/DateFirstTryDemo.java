package class1;

public class DateFirstTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFirstTry date1,date2;
		date1=new DateFirstTry();
		date2=new DateFirstTry();
		date1.month="December";
		date1.day=31;
		date1.year=2012;
		
		System.out.println("date 1:");
		date1.writeOutput();
		date1.yellIfNewYear();
		
		
		date2.month="January";
		date2.day=1;
		date2.year=2020;
		System.out.println("date 2:");
		date2.writeOutput();
		date2.yellIfNewYear();

	}

}
