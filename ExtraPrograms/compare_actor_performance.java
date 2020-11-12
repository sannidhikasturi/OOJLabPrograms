import java.util.*;
class Actor{
int id;
String name;
int no_of_movies;
int no_of_years_exp;
int average_performance;
Actor()
{}
void Accept(){
Scanner s=new Scanner(System.in);
System.out.println("Enter actor id:\n");
id=s.nextInt();
System.out.println("Enter actor name:\n");
name=s.next();
System.out.println("Enter no of movies:\n");
no_of_movies=s.nextInt();
System.out.println("Enter no of years of exp:\n");
no_of_years_exp=s.nextInt();
}
int Compare(){
average_performance=(no_of_movies+no_of_years_exp)/2;
return average_performance;
}
}
class CompareActor{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n;
System.out.println("Enter the number of actors:\n");
n=in.nextInt();
Actor a[]=new Actor[n];
for(int i=0;i<n;i++)
a[i]=new Actor();
for(int i=0;i<n;i++){
System.out.println("Enter details of actor "+(i+1));
a[i].Accept();
}
int better_average=0;
for(int i=0;i<n;i++){
if(a[i].Compare()>a[better_average].Compare())
better_average=i;
}
System.out.println("Actor who has better performance average:"+a[better_average].name);
}
}
