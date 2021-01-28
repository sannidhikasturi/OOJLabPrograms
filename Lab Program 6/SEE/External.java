package SEE;
import java.util.Scanner;
public class External extends CIE.Student 
{
    public External(String usn, String name, int sem)
    {
        super(usn,name,sem);
    }
    Scanner in = new Scanner(System.in);
    public int[] see = new int[5];
    public void get_data()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter SEE marks of the student in Subject " + (i+1) + " (out of 100) : ");
            see[i] = in.nextInt();
        }
    }
}
