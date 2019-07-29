#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  if((a%4==0)&&(a%100==0)&&(a%400==0))
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  return 0;
}