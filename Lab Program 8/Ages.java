import java.util.*;
class WrongAge extends Exception{
int f,s;
WrongAge(int fAge, int sAge){
f=fAge;
s=sAge;
}
public String toString(){
return ("Invalid! Enter correct age as Father's age cannot be less than or equal to Son's age.");
}
}
class NegativeAge extends Exception{
int x;
NegativeAge(int fAge){
x=fAge;
}
public String toString(){
return("Invalid! Age cannot be negative.");
}
}
class Father{
int fAge;
Scanner in=new Scanner(System.in);
Father() throws NegativeAge{
System.out.println("Enter the father's age: ");
fAge=in.nextInt();
if (fAge<0){
throw new NegativeAge(fAge);
}
}
}
class Son extends Father{
int sAge;
Scanner in=new Scanner(System.in);
Son() throws NegativeAge,WrongAge{
super();
System.out.println("Enter the son's age: ");
sAge=in.nextInt();
if (sAge<0){
throw new NegativeAge(sAge);
}
if(sAge>=fAge){
throw new WrongAge(fAge,sAge);
}
}
}
class Ages{
public static void main(String args[]){
try{
Son s=new Son();
}
catch(NegativeAge n){
System.out.println("Exception: "+n);
}
catch(WrongAge w){
System.out.println("Exception: "+w);
}
}
}

