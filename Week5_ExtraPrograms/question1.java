import java.util.*;
class Employee{
int empid;
String empname;
int empnohrs;
float empbasic;
float emphra;
float empda;
float empit;
float empgross;
Employee()
{}
void Accept(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the employee ID:\n");
empid=s.nextInt();
System.out.println("Enter the employee name:\n");
empname=s.next();
System.out.println("Enter the number of working hours:\n");
empnohrs=s.nextInt();
System.out.println("Enter the employee basic salary:\n");
empbasic=s.nextFloat();
System.out.println("Enter the employee HRA:\n");
emphra=s.nextFloat()/100;
System.out.println("Enter the employee DA:\n");
empda=s.nextFloat()/100;
System.out.println("Enter the employee IT:\n");
empit=s.nextFloat()/100;
}
float Calculate(){
empgross=empbasic+empbasic*emphra+empbasic*empda-empbasic*empit;
return empgross;
}
float OverTime(){
float variance,newempgross;
if(empnohrs>200)
variance=empnohrs*100;
else if(empnohrs<200)
variance=-(empnohrs*100);
else
variance=0;
newempgross=empgross+variance;
return newempgross;
}
}
class TestEmployee{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter the number of employees:\n");
n=in.nextInt();
Employee e[]=new Employee[n];
for(int i=0;i<n;i++){
e[i]=new Employee();
}
for(int i=0;i<n;i++){
System.out.println("Enter details of employee"+(i+1));
e[i].Accept();
}
for(int i=0;i<n;i++){
System.out.println("The gross salary of the employee" +i+ " is:"+e[i].Calculate());
}
for(int i=0;i<n;i++){
System.out.println("The updated gross salary of the employee" +i+ " is:"+e[i].OverTime());
}
}
}

