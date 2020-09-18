1. 
#include <stdio.h>

int main ()
{
  int n1, n2, ch,ans;
  char opt;
  do
    {
      printf ("Enter the two numbers:\n");
      scanf ("%d %d", &n1, &n2);
      printf
  ("Enter the opertion to be done:\n 1. Addition \n 2. Subtraction\n3.Multiplication\n4.Divsion\n5.Equal to\n6. Not Equal to\n7.Greater than \n8. Greater than, equal to \n 9. Less than, equal to\n10. Less than\n");

      scanf ("%d", &ch);
      switch (ch)
  {
    case 1:
      {
          ans=n1+n2;
        printf ("Addition of the two numbers is:%d", ans);
        break;
      }
    case 2:
      { 
          ans=n1-n2;
        printf ("Subtraction of the two numbers is:%d", ans);
        break;
      }
   case 3:
      {
          ans=n1*n2;
        printf ("Multiplication of the two numbers is:%d", ans);
        break;
      }
   case 4:
      {
          ans=n1/n2;
        printf ("Division of the two numbers is:%d", ans);
        break;
      }
    case 5:
      {
        if (n1 == n2)
    printf ("They are equal");
        break;
      }
   case 6:
      {
        if (n1 != n2)
    printf ("They are not equal");
        break;
      }
    case 7:
      {
        if (n1 > n2)
    printf ("True");
        break;
      }
    case 8:
      {
        if (n1 >= n2)
    printf ("True");
        break;
      }
    case 9:
      {
        if (n1 <= n2)
    printf ("True");
        break;
      }
    case 10:
      {
        if (n1 < n2)
      printf ("True");
      break;
      }
  }
    printf ("Do you wish to continue: Y or N?\n");
    scanf ("%c", &opt);
  }while (opt == 'Y');

      return 0;

    }
