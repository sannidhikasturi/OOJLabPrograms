2.
#include<stdio.h>
int main ()
{
int n[3], temp,ans;
printf ("Enter the 3 numbers:\n");
for (int i = 0; i <= 2; i++)
  {
    scanf ("%d", &n[i]);
  }
for (int i = 0; i < 3; i++)
  {
    for (int j = i + 1; j < 3; j++)
{
  if (n[i] < n[j])
    {
      temp = n[i];
      n[i] = n[j];
      n[j] = temp;
    }

}
  }
ans=sumaver(n[0],n[1]);
printeven(n[0],n[1]);
printf("Average is: %d",ans);

return 0;
}
int sumaver(int a,int b)
{
  int sum,average;
  sum=a+b;
  printf("Sum is: %d\n",sum);
  average=(a+b)/2;
  return average;
}
int printeven(int a,int b)
{
  if(a%2==0)
      printf("%d is even",a);
   if(b%2==0)
  printf("%d is even",b);

}
