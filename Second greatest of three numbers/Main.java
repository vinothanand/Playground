#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c;
  scanf("%d\n%d\n%d",&a,&b,&c);
  if((a>b)&&(a<c))
    printf("%d",a);
  else if (c>b)
    printf("%d",b);
  else
    printf("%d",c);
  return 0;
}