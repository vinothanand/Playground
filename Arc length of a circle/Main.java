#include<stdio.h>
#define pi 3.14
int main(){
  float r,d,arc;
  scanf("%f %f",&r,&d);
  arc=(d/360)*2*pi*r;
  printf("%.2f",arc);
   return 0;
}