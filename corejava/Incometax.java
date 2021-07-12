import java.util.*;
public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s=new Scanner(System.in);
          int income=s.nextInt();
          if(income>0&&income<=180000)
          {
        	  System.out.println("Tax paid is Nil");
          }
          else if(income>180000&&income<=300000)
          {
        	  int tax=(income*10)/100;
        	  System.out.println("Tax paid is "+tax);
        	  
          }
          else if(income>300000&&income<=500000)
          {
        	  int tax=(income*20)/100;
        	  System.out.println("Tax paid is "+tax);
        	  
          }
          else if(income>500000&&income<=1000000)
          {
        	  int tax=(income*30)/100;
        	  System.out.println("Tax paid is "+tax);
        	  
          }
          
	}

}