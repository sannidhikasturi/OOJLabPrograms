import java.util.*;
class SuperMarket{
public static void main(String args[]){
Scanner in =new Scanner(System.in);
int x;
System.out.println("Enter the number of items:");
x=in.nextInt();
double tot=0,disc,famt;
double[] rate=new double[x];
int[] qty=new int[x];
for(int i=0;i<x;i++)
{
 System.out.println("Enter rate of item "+i);
 rate[i]=in.nextDouble();
 System.out.println("Enter qty of item "+i);  
 qty[i]=in.nextInt();
 tot=tot+(rate[i]*qty[i]);
}
if(tot>=10000)
disc=0.05;
else if(tot>=7500&&tot<10000)
disc=0.03;
else if(tot>=5000)
disc=0.02;
else
disc=0;
famt=tot-tot*disc;
System.out.println("Total Bill Amount="+tot+"\nFinal Bill Amount after Discount="+famt);
}
}
