#include <stdio.h>
int main() 
{
	//Type your code
  int val;
  scanf("%d",&val);
  int i;
  int fd,sd,ld;
  
   int fact = 1;
   int fact1 = 1;
   int fact2 = 1;
  
   int sum=0;
  
   fd = val/100;
   sd = val/10%10;
   ld = val%10;
  
  for(i=1; i<=fd; i++)
  {
    while(fd>=1)
   {
     fact = fact * fd;
     fd--;
   }
  }
  for(i=1; i<=sd; i++)
  {
    while(sd>=1)
   {
     fact1 = fact1 * sd;
     sd--;
   }
  }
  for(i=1; i<=ld; i++)
  {
    while(ld>=1)
   {
     fact2 = fact2 * ld;
     ld--;
   }
  }
  sum = fact + fact1 + fact2;
  
  
  if(sum == val)
    printf("Yes");
  else
    printf("No");
  
	return 0;
  }
