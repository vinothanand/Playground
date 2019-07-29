#include<stdio.h>
int main()
{
  //Type your code here
  float a,b,c;
  scanf("%f\n%f",&a,&b);
  
  c=hypot(a,b);
  
  printf("%.2f",c);
  return 0;
}