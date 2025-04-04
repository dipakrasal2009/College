
//Write a program that demonstrates the use of nice() system call.
//After a child process is started using fork(), assign higher priority to the child using nice() system call.*/




#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void main()
{
int pid, retnice;
printf("press DEL to stop process \n");
pid=fork();
    for(;;)
    {
        if(pid == 0)
            {
            retnice = nice(-5);
            printf("child gets higher CPU priority %d \n", retnice);
            sleep(1);
            }
        else
            {
            retnice=nice(4);
            printf("Parent gets lower CPU priority %d \n", retnice);
            sleep(1);
            }
    }
}
