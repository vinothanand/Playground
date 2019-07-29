#include<stdio.h>
int main()
{
  //Type your code here
  int n,r,a,c;
  scanf("%d",&n);
  r=n%10;
  a=n/100;
  c=r+a;
  printf("%d",c);
  return 0;
}