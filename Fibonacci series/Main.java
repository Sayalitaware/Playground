#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  int a=-1;
  int b=1;
  int i;
  int c;
  scanf("%d",&n);
  
  for(i=1; i<=n; i++)
  {
    c = a  + b;
     printf("%d ",c);
     a =b;
     b = c;
    
  }
  return 0;
}