#include<stdio.h>
int main()
{
  int n,l,i,a[10];;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  l=a[0];
  for(i=0;i<n;i++)
  {
    if(l<a[i])
    {
      l=a[i];
    }
  }
  printf("%d",l);
  return 0;
}