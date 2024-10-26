//Write a C program to simulate Banker’s algorithm for the purpose of deadlock avoidance. Consider the following snapshot of system, A, B, C and D are the resource type. 
//a) Calculate and display the content of need matrix? 
//b) Is the system in safe state? If display the safe sequence. 
//c) If a request from process P arrives for (0, 4, 2, 0) can it be granted immediately by keeping the system in safe state. Print a message  //


#include <stdio.h>
#include <stdbool.h>

#define P 5 // Number of processes
#define R 4 // Number of resource types

// Function prototypes
void calculateNeed(int need[P][R], int max[P][R], int allot[P][R]);
bool isSafe(int processes[], int avail[], int max[][R], int allot[][R]);

// Function to calculate the need matrix
void calculateNeed(int need[P][R], int max[P][R], int allot[P][R]) {
    for (int i = 0; i < P; i++)
        for (int j = 0; j < R; j++)
            need[i][j] = max[i][j] - allot[i][j];
}

// Function to check if the system is in a safe state
bool isSafe(int processes[], int avail[], int max[][R], int allot[][R]) {
    int work[R], finish[P] = {0};
    int safeSeq[P];
    int count = 0;

    // Initialize work and finish
    for (int i = 0; i < R; i++)
        work[i] = avail[i];

    // Find a safe sequence
    while (count < P) {
        bool found = false;
        for (int p = 0; p < P; p++) {
            if (!finish[p]) {
                int j;
                for (j = 0; j < R; j++)
                    if (max[p][j] - allot[p][j] > work[j]) // Check against max need
                        break;

                if (j == R) {
                    // Add allocation to work
                    for (int k = 0; k < R; k++)
                        work[k] += allot[p][k];
                    safeSeq[count++] = p;
                    finish[p] = 1;
                    found = true;
                }
            }
        }
        if (!found) {
            printf("System is not in a safe state.\n");
            return false;
        }
    }

    // Print the safe sequence
    printf("System is in a safe state.\nSafe sequence is: ");
    for (int i = 0; i < P; i++)
        printf("%d ", safeSeq[i]);
    printf("\n");
    return true;
}

// Main function
int main() {
    // Allocation matrix
    int allot[P][R] = {
        {0, 0, 1, 2}, // P0
        {1, 0, 0, 0}, // P1
        {1, 3, 5, 4}, // P2
        {0, 6, 3, 2}, // P3
        {0, 0, 1, 4}  // P4
    };

    // Maximum resource matrix
    int max[P][R] = {
        {0, 0, 1, 2}, // P0
        {1, 7, 5, 0}, // P1
        {2, 3, 5, 6}, // P2
        {0, 6, 5, 2}, // P3
        {0, 6, 5, 6}  // P4
    };

    // Available resources
    int avail[R] = {1, 5, 2, 0};

    // Need matrix
    int need[P][R];
    calculateNeed(need, max, allot);

    // Display need matrix
    printf("Need matrix:\n");
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < R; j++) {
            printf("%d ", need[i][j]);
        }
        printf("\n");
    }

    // Check for safe state
    int processes[] = {0, 1, 2, 3, 4};
    isSafe(processes, avail, max, allot);

    // Request for resources by process P1
    int request[R] = {0, 4, 2, 0}; // Request from P1
    bool canGrant = true;

    // Check if request can be granted
    for (int i = 0; i < R; i++) {
        if (request[i] > need[1][i]) {
            canGrant = false;
            printf("Error: Process P1 has exceeded its maximum claim.\n");
            break;
        }
        if (request[i] > avail[i]) {
            canGrant = false;
            printf("Error: Resources not available.\n");
            break;
        }
    }

    if (canGrant) {
        // Pretend to allocate the resources
        for (int i = 0; i < R; i++) {
            avail[i] -= request[i];
            allot[1][i] += request[i];
            need[1][i] -= request[i];
        }

        // Check if the system is still in a safe state
        printf("Request from P1 can be granted. Checking for safe state...\n");
        isSafe(processes, avail, max, allot);
    } else {
        printf("Request from P1 cannot be granted immediately.\n");
    }

    return 0;
}
