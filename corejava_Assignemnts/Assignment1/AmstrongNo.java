
public class AmstrongNo {
	public static void main(String[] args) {
		int n=153,y,newNo=0,oldNo;
		oldNo=n;
		while(n!=0){
			y=n%10;
			newNo=newNo+y*y*y;
			n/=10;
		}
		if(oldNo==newNo)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
	}
}



