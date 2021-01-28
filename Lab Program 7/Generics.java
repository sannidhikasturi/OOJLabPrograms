class TwoGen<T,V>{
T obj1;
V obj2;
TwoGen(T ob1, V ob2){
obj1=ob1;
obj2=ob2;
}
void showTypes(){
System.out.println("\n Type of T is "+obj1.getClass().getName());
System.out.println("\n Type of V is "+obj2.getClass().getName());
}
T getobj1(){
return obj1;
}
V getobj2(){
return obj2;
}
}
class Generics{
public static void main(String args[]){
TwoGen<Integer,String>object1=new TwoGen<Integer,String>(29,"Generics");
object1.showTypes();
int i=object1.getobj1();
System.out.println("Value of type T : "+i);
String str=object1.getobj2();
System.out.println("Value of type V : "+str);
TwoGen<String,Double>object2=new TwoGen<String,Double>("This is Generics",3.14);
object2.showTypes();
String str1=object2.getobj1();
System.out.println("Value of type T : "+str1);
double j=object2.getobj2();
System.out.println("Value of type V : "+j);
}
}

