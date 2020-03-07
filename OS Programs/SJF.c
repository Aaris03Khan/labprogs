#include<stdio.h>
int main()
{
int i,j,t,k,n;
float s;
int p[10],tt[10],bt[10],wt[10],lt[10];
float avgtt,avgwt;
printf("Enter the no of processes:\n");
scanf("%d",&n);
printf("Enter processnos:\n");
for(i=0;i<n;i++)
scanf("%d",&p[i]);
printf("Enter the burst time:\n");
for(i=0;i<n;i++)
scanf("%d",&bt[i]);
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
{
if(bt[i]<bt[j])
{
t=bt[i];
bt[i]=bt[j];
bt[j]=t;
k=p[i];
p[i]=p[j];
p[j]=k;
} } }
for(i=0;i<n;i++)
{
tt[i]=s+bt[i];
s=tt[i];
}
s=0;
for(i=0;i<n;i++)
s=s+tt[i];
avgtt=s/n;
s=0;
wt[0]=0;
for(i=1;i<n;i++)
{
wt[i]=wt[i-1]+bt[i-1];
}
for(i=0;i<n-1;i++)
s=s+tt[i];
avgwt=s/n;
printf("pname:\t");
printf("btime:\t");
printf("ttime:\t");
printf("wtime:\n");
for(i=0;i<n;i++)
{
printf("%d\t%d\t%d\t%d\n",p[i],bt[i],tt[i],wt[i]);
}
printf("The average turnaround time is : %3f\n",avgtt);
 printf("The average waiting time is : %3f\n",avgwt);
}

