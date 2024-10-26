#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main() {
    pid_t pid = fork();  // Fork a child process

    if (pid < 0) {
        // If pid < 0, fork() failed
        perror("Fork failed");
        return 1;
    } else if (pid == 0) {
        // Child process
        printf("Hello World from Child Process\n");
        printf("Child Process ID: %d\n", getpid());
    } else {
        // Parent process
        printf("Hi from Parent Process\n");
        printf("Parent Process ID: %d\n", getpid());
    }

    return 0;
}
