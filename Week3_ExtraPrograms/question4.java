import java.util.*;
class Array3{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n,sum=0,avg=0,min=0,max=0;
System.out.println("Enter size of array:");
n=in.nextInt();
int[] a=new int[n];
int[] b=new int[n];
int[] c=new int[n];
int j=0;
int k=0;
System.out.println("Enter the elements:\n");
for(int i=0;i<n;i++)
{
  a[i]=in.nextInt();
  if(a[i]%2!=0)
  {
   b[j]=a[i];
  j++;
}
else 
{
c[k]=a[i];
 max=c[0];
 min=c[0];
 sum=sum+c[k];
if(c[k]>max)
max=c[k];
else
min=c[k];
k++;
}
}
avg=sum/k;
for(int i=0;i<j;i++)
System.out.println(b[i]);
for(int i=0;i<k;i++)
System.out.println(c[i]);
System.out.println("Array C:\n Sum:"+sum+"\nAverage:"+avg+"Max:"+max+"Min:"+min);
}
}


