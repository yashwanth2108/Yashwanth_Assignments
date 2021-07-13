
public class BubbleSort {

	public static void main(String[] args) {
		int [] numList={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int i,j,temp;
		for(i=0;i<numList.length;i++){
			for(j=i;j<numList.length;j++){
				if(numList[i]>numList[j]){
					temp=numList[i];
					numList[i]=numList[j];
					numList[j]=temp;
				}
			}
		}
		for(i=0;i<numList.length;i++){
			System.out.print(numList[i]+" ");
		}
	}
}
