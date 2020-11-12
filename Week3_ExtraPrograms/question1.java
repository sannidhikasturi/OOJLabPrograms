import java.util.*;
class Array1{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,even=0,odd=0;
System.out.println("Enter size of the array:\n");
n=in.nextInt();
int[] a=new int[n];
System.out.println("Enter the elements:\n");
for(int i=0;i<n;i++)
{
 a[i]=in.nextInt();
 if(i%2==0)
even=even+a[i];
else
odd=odd+a[i];
}
System.out.println("Even Sum="+even+"Odd sum="+odd);
}
}

