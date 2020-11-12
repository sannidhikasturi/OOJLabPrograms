import java.util.*;
class Age{
int years,months;
String name;
Age()
{}
void Accept(){
Scanner s=new Scanner(System.in);
System.out.println("Enter name of person:\n");
name=s.next();
System.out.println("Years:\n");
years=s.nextInt();
System.out.println("Months:\n");
months=s.nextInt();
}
int Compare(){
int age;
age=years*12+months;
return age;
}
}
class CompareAge{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter the number of people:\n");
n=in.nextInt();
Age a[]=new Age[n];
for(int i=0;i<n;i++)
 a[i]=new Age();
for(int i=0;i<n;i++){
System.out.println("Enter details of person"+(i+1));
a[i].Accept();
}
int elder=0;
for(int i=0;i<n;i++){
if(a[i].Compare()>elder)
elder=i;
}
System.out.println("The eldest person is:"+a[elder].name);
}
}
