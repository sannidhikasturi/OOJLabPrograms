import java.util.*;
class Numbers{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter size of the array:\n");
n=in.nextInt();
double[] arr=new double[n];
for(int i=0;i<n;i++){
System.out.println("Element "+(i+1));
arr[i]=in.nextDouble();
}
int npos=0,nneg=0;
for(int i=0;i<n;i++){
if(arr[i]>0)
npos++;
else if(arr[i]<0)
nneg++;
else
continue;
}
double[] pos=new double[npos];
double[] neg=new double[nneg];
int zeroes=0,j=0,k=0;
for(int i=0;i<n;i++){
if(arr[i]>0){
pos[j]=arr[i];
j++;
}
else if(arr[i]==0)
zeroes++;
else{
neg[k]=arr[i];
k++;
}
}
System.out.println("Array of all the Positive Numbers:\n");
for(int i=0;i<npos;i++){
System.out.println(pos[i]);
}
System.out.println("Array of all the Negative Numbers:\n");
for(int i=0;i<nneg;i++){
System.out.println(neg[i]);
}
System.out.println("Number of positive numbers: "+npos);
System.out.println("Number of negative numbers: "+nneg);
System.out.println("Number of zeroes: "+zeroes);
}
}
