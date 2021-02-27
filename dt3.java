//Methods of LocalDate
//minusDays(int)
//plusDays(int)
//wap to display todays date yesterdate and tommorow date
package dt;
import java.time.*;

public class dt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ob=LocalDate.now();
		System.out.println("today's date is :"+ob);
		LocalDate ob1= ob.minusDays(1);
		System.out.println("yesterday date is :"+ob1);
		LocalDate ob2=ob1.plusDays(2);
		System.out.println("tommorow date is :"+ob2);
		LocalDate ob3=ob2.plusDays(2);
		System.out.println("day after tommorow date is :"+ob3);
		
		
		
		/*System.out.println("today's date:"+ob);
	    System.out.println("yesterday's date"+ob.minusDays(1));
	    System.out.println("tomorrow's date"+ob.plusDays(1));*/
	
	}
	

}
