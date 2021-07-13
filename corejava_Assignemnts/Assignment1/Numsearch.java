import java.util.*;
public class Numsearch
{

	public static void main(String[] args) {
		
		int[] arr=new int[15];
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(num==arr[i])
			{
				System.out.println("Element "+num+" is present in array");
				break;
				
			}
		}
		

	}

}