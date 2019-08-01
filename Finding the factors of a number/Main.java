#include <stdio.h>
int main() 
{
	//Type your code
  int n;
  int i;
  scanf("%d",&n);
   for(i=1; i<=n; i++)
   {
     while(i<=n)
    {
      if(n%i==0)
      printf("%d\n",i);
       i++;
    }
   }
     return 0;
}