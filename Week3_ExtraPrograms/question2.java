import java.util.*;
class Array2{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int s,pos=0,neg=0,zeroes=0;
System.out.println("Enter size of the array:\n");
s=in.nextInt();
int[] n=new int[s];
System.out.println("Enter the elements:\n");
for(int i=0;i<s;i++)
{
 n[i]=in.nextInt();
 if(n[i]<0)
neg++;
else if(n[i]==0)
zeroes++;
else
pos++;

}
System.out.println("\nNumber of positive numbers="+pos+"\nNumber of negative numbers="+neg+"\nNumber of Zeroes="+zeroes);
}
}

