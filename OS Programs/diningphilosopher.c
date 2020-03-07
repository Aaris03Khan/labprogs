#include<stdio.h>
#include<semaphore.h>
#include<pthread.h>
#include<unistd.h>
#define EATINGTIME 1
//function prototype for the thread function
void * philospher1();
void * philospher2();
void * philospher3();
void * philospher4();
void * philospher5();
sem_t sem15,sem12,sem23,sem34,sem45;
 //global decleration of semaphore variables
int end=0;
int main()
{
char a[2];
    pthread_t t1,t2,t3,t4,t5;
    pthread_attr_t at1;
    pthread_attr_init(&at1);
    pthread_attr_setdetachstate(&at1,PTHREAD_CREATE_DETACHED);
    sem_init(&sem15,0,1);
    sem_init(&sem12,0,1);
    sem_init(&sem23,0,1);
    sem_init(&sem34,0,1);
    sem_init(&sem45,0,1);
    printf("\n\n\n\n\n\n");
    printf("____________");
    printf("\n\n\n\t\t\t DINING PHILOSOPHER PROBLEM");
    printf("\n\n\n\t\t\t no. of PHILOSOPHER : 5");
    printf("\n\n\n\t\t\t no.of forks : 5\n\n");
    printf("____________");
    printf("\n\n\n\t\t PRESS ENTER TO CONTINUE");
    pthread_create(&t1,&at1,philospher1,NULL);
    pthread_create(&t1,&at1,philospher2,NULL);
    pthread_create(&t1,&at1,philospher3,NULL);
    pthread_create(&t1,&at1,philospher4,NULL);
    pthread_create(&t1,&at1,philospher5,NULL);
    while(end!=5)
    {
    }
}
void *philospher1()
{
int i=0;
    printf("\n\t\t PHILOSOPHER-1 THINKING:\n");
    while(i<EATINGTIME)
    {
        sleep(1);
sem_wait(&sem15);
sem_wait(&sem12);
printf("\n\t\tPHILOSOPHER-1 EATING*\n");
sleep(1);      
sem_post(&sem15);        
sem_post(&sem12);
printf("\n\t\tPHILOSOPHER-1 THINKING*\n");
i++;
    }
    end++;
}
void *philospher2()
{
int i=0;
    printf("\n\t\t PHILOSOPHER-2 THINKING:\n");
    while(i<EATINGTIME)
    {
        sleep(1);
sem_wait(&sem12);
sem_wait(&sem23);
printf("\n\t\tPHILOSOPHER-2 EATING*\n");
sleep(1);      
sem_post(&sem12);        
sem_post(&sem23);
printf("\n\t\tPHILOSOPHER-2 THINKING*\n");
i++;
    }
    end++;
}
void *philospher3()
{
int i=0;
    printf("\n\t\t PHILOSOPHER-3 THINKING:\n");
    while(i<EATINGTIME)
    {
        sleep(1);
sem_wait(&sem23);
sem_wait(&sem34);
printf("\n\t\tPHILOSOPHER-3 EATING*\n");
sleep(1);      
sem_post(&sem23);        
sem_post(&sem34);
printf("\n\t\tPHILOSOPHER-3 THINKING*\n");
i++;
    }
    end++;
}
void *philospher4()
{
int i=0;
    printf("\n\t\t PHILOSOPHER-4 THINKING:\n");
    while(i<EATINGTIME)
    {
        sleep(1);
sem_wait(&sem34);
sem_wait(&sem45);
printf("\n\t\tPHILOSOPHER-4 EATING*\n");
sleep(1);      
sem_post(&sem34);        
sem_post(&sem45);
printf("\n\t\tPHILOSOPHER-4 THINKING*\n");
i++;
    }
    end++;
}
void *philospher5()
{
int i=0;
    printf("\n\t\t PHILOSOPHER-5 THINKING:\n");
    while(i<EATINGTIME)
    {
        sleep(1);
sem_wait(&sem45);
sem_wait(&sem15);
printf("\n\t\tPHILOSOPHER-5 EATING*\n");
sleep(1);      
sem_post(&sem45);        
sem_post(&sem15);
printf("\n\t\tPHILOSOPHER-5 THINKING*\n");
i++;
    }
    end++;
}
