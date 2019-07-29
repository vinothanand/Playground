#include<stdio.h>
int main()
{
  //Type your code here
  int n,r,a;
  scanf("%d",&n);
  r=n%10;
  n/=10;
  a=n%10;
  printf("%d",a);
  return 0;
}