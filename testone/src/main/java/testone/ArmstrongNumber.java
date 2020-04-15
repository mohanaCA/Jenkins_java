package testone;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int r=0;
int temp=num;
while(num!=0) {
	int n=num%10;
	n=n*n*n;
	r=r+n;
	num=num/10;
}
System.out.println(r);	}

}
