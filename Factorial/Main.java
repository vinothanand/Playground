#include<stdio.h>
int main()
{
	//your code here
long  int n,i,fact=1;
  scanf("%ld",&n);
  for(i=1;i<=n;i++){
   fact*=i; 
  }
    printf("%ld",fact);
    return 0;
}
