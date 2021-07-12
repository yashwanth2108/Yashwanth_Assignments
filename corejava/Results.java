import java.util.*;
public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      int z=s.nextInt();
      if(x>60&&y>60&&z>60)
      {
    	  System.out.println("Passed");
      }
      else if((x>60&&y>60)||(y>60&&z>60)||(z>60&&x>60))
      {
    	  System.out.println("Promoted");
      }
      else if((x>60||y>60||z>60)||(x<60&&y<60&&z<60))
      {
    	  System.out.println("Failed");
      }
	}

}