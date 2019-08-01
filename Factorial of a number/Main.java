#include <stdio.h>
int main() 
{
	//Type your code
   int n;
  scanf("%d",&n);
   int fact = 1;
   while(n>=1)
   {
     fact = fact * n;
     n--;
   }
  printf("%d",fact);
	return 0;
}