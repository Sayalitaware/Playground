#include<stdio.h>
int main()
{
  int base,exp,ans,i;
  ans = 1;
  
  scanf("%d%d",&base,&exp);
  if(exp>=0)
  {
    for(i=1; i<=exp; i++)
    {
      ans = ans * base;
    }
    printf("%d",ans);
  }
    else
    {
      printf("Wrong input");
    }
  return 0;
}