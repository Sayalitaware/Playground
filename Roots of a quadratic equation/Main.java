#include<stdio.h>
#include<math.h>

int main()
{
    float a,b,c,r1,r2,det,real,imag;
    scanf("%f%f%f",&a,&b,&c);
    
    det = ((b*b) - (4*a*c));
    
    if(det > 0)
    {
      r2=(-b - sqrt(det))/(2*a);
      r1=(-b + sqrt(det))/(2*a);
      printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
    }
    else if(det == 0)
    {
        r1=r2=(-b/(2*a));
        printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
    }
    else
    {
      real = (-b/(2*a));
      imag = sqrt(-det)/(2*a);
      printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi",real,imag,real,imag);
    }
    
    return 0;
}