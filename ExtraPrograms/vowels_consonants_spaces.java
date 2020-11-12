import java.util.*;
class Alphabet{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String input;
System.out.println("Enter the string:\n");
input=in.nextLine();
int vowels=0,consonants=0,spaces=0;
for(int i=0;i<input.length();i++){
char ch=input.charAt(i);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
vowels++;
else if(ch==' ')
spaces++;
else
consonants++;
}
System.out.println("Number of vowels:"+vowels);
System.out.println("Number of consonants:"+consonants);
System.out.println("Number of spaces:"+spaces);
}
}
