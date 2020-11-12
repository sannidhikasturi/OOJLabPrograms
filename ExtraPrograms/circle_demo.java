import java.util.*;
class CircleDemo{
double radius,area,perimeter;
void AcceptRadius(){
Scanner in=new Scanner(System.in);
System.out.println("Enter the radius of the circle:\n");
radius=in.nextFloat();
}
void Area(){
area=3.14*radius*radius;
}
void Perimeter(){
perimeter=2*3.14*radius;
}
void Display(){
System.out.println("Radius of the circle:"+radius);
System.out.println("Area of the circle:"+area);
System.out.println("Perimeter of the circle:"+perimeter);
}
 public static void main(String args[]){
CircleDemo cd=new CircleDemo();
cd.AcceptRadius();
cd.Area();
cd.Perimeter();
cd.Display();
}
}
