
public class ArmstrongRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<1000;i++)
		{
			int x,rem,a=0;
			x=i;
			while(x>0)
			{
				rem=x%10;
				a+=(rem*rem*rem);
				x=x/10;
			}
			if(a==i)
			{
				System.out.println(a);
			}
		}

	}

}