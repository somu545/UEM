#include <stdio.h>
#include <stdlib.h>

#define MAXSIZE 10

// Function to check if the stack is empty
int isEmpty(int top) {
    return top == -1;
}

// Function to check if the stack is full
int isFull(int top) {
    return top == MAXSIZE - 1;
}

// Function to push an element onto the stack
void push(int *stackArray, int *top, int value) {
    if (isFull(*top)) {
        printf("Stack Overflow. Cannot push %d.\n", value);
    } else {
        stackArray[++(*top)] = value;
    }
}

// Function to pop an element from the stack
int pop(int *stackArray, int *top) {
    if (isEmpty(*top)) {
        printf("Stack Underflow. Cannot pop from an empty stack.\n");
        return -1; // Return a sentinel value indicating failure
    } else {
        return stackArray[(*top)--];
    }
}

// Function to copy the contents of the first stack to the second stack
void copyStack(int *sourceStackArray, int *sourceTop, int *destinationStackArray, int *destinationTop) {
    // Copy elements while preserving order
    while (!isEmpty(*sourceTop)) {
        int value = pop(sourceStackArray, sourceTop);
        push(destinationStackArray, destinationTop, value);
    }
}

int main() {
    int sourceStackArray[MAXSIZE];
    int destinationStackArray[MAXSIZE];
    int sourceTop = -1; // Initialize top for the source stack
    int destinationTop = -1; // Initialize top for the destination stack

    // Example: Pushing elements onto the source stack
    push(sourceStackArray, &sourceTop, 1);
    push(sourceStackArray, &sourceTop, 2);
    push(sourceStackArray, &sourceTop, 3);

    // Copy the contents of the source stack to the destination stack
    copyStack(sourceStackArray, &sourceTop, destinationStackArray, &destinationTop);

    // Example: Print the contents of the destination stack
    printf("Contents of the destination stack: ");
    while (!isEmpty(destinationTop)) {
        printf("%d ", pop(destinationStackArray, &destinationTop));
    }

    return 0;
}

