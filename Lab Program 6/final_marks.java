import CIE.*;
import SEE.*;
import java.util.Scanner;
class final_marks
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = in.nextInt();
        CIE.Internals obj[] = new CIE.Internals[5];
        SEE.External obj1[] = new SEE.External[5];
        int total=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter details of Student " + (i+1) + " :");
            System.out.print("USN : ");
            String usn = in.next();
            System.out.print("Name : ");
            String name = in.next();
            System.out.print("Semester : ");
            int sem = in.nextInt();
            obj[i] = new CIE.Internals(usn,name,sem);
            obj[i].get_data();
            obj1[i] = new SEE.External(usn,name,sem);
            obj1[i].get_data();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("\nTOTAL MARKS OF STUDENT " + (i+1) + " (out of 100) in :");
            for(int j=0;j<5;j++)
            {
                total = (obj[i].cie[j]) + ((obj1[i].see[j])/2);
                System.out.println("Subject " + (j+1) + " : " + total);
            }
        }
    }
}
