#include<stdio.h>
int a[10][10],n;
main()
{
  int i,j,root;
  printf("Enter no.of nodes:");
  scanf("%d",&n);
  printf("Enter adjacent matrix\n");
  for(i=1;i<=n;i++)
  for(j=1;j<=n;j++)
  {
    printf("Enter connecting of %d>%d::",i,j);
    scanf("%d",&a[i][j]);
  }
  printf("Enter root node:");
  scanf("%d",&root);
  adj(root);
}

adj(int k)
{
  int i,j;
  printf("Adjacent node of root node::\n");
  printf("%d\n",k);
  for(j=1;j<=n;j++)
  {
    if(a[k][j]==1 || a[j][k]==1)
    printf("%d\t",j);
  }
  printf("\n");
  for(i=1;i<=n;i++)
  {
    if((a[k][j]==0) && (a[i][k]==0) && (i!=k))
    printf("%d",i);
  }
}


// OUTPUT:
// Enter no.of nodes:4
// Enter adjacent matrix
// Enter connecting of 1>1::12
// Enter connecting of 1>2::25
// Enter connecting of 1>3::34
// Enter connecting of 1>4::32
// Enter connecting of 2>1::23
// Enter connecting of 2>2::33
// Enter connecting of 2>3::35
// Enter connecting of 2>4::45
// Enter connecting of 3>1::55
// Enter connecting of 3>2::21
// Enter connecting of 3>3::22
// Enter connecting of 3>4::11
// Enter connecting of 4>1::13
// Enter connecting of 4>2::15
// Enter connecting of 4>3::25
// Enter connecting of 4>4::35
// Enter root node:2
// Adjacent node of root node::
// 2
