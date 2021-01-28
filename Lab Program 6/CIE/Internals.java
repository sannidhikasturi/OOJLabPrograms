package CIE;
import java.util.Scanner;
public class Internals extends Student
{
    Scanner in = new Scanner(System.in);
    public int[] cie = new int[5];
    public Internals(String usn, String name, int sem)
    {
        super(usn,name,sem);
    }
    public void get_data()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter CIE marks of the student in Subject " + (i+1) + " (out of 50) : ");
            cie[i] = in.nextInt();
        }
    }
}
