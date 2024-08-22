#include <stdio.h>
#include <limits.h>

#define maxSize 1000

struct priorityQueueElem
{
    int value;
    int priority;
};

struct priorityQueueElem priotyQ[maxSize];

int size = -1;

void enqueue(int value, int priority)
{
    size++;

    if (size > maxSize)
    {
        printf("Maximum number of elements that can be stored is exceeded\n");
        return;
    }
    priotyQ[size].value = value;
    priotyQ[size].priority = priority;
}

int peek()
{
    int highestPriority = INT_MIN;
    int index = -1;

    for (int i = 0; i <= size; i++)
    {
        if (highestPriority == priotyQ[i].priority && index > -1 && priotyQ[index].value < priotyQ[i].value)
        {
            highestPriority = priotyQ[i].priority;
            index = i;
        }
        else if (highestPriority < priotyQ[i].priority)
        {
            highestPriority = priotyQ[i].priority;
            index = i;
        }
    }

    return index;
}

void dequeue()
{
    int index = peek();
    for (int i = index; i < size; i++)
    {
        // left shift all elements by one
        priotyQ[i] = priotyQ[i + 1];
    }
    size--;
}

int main()
{
    int n = 5;
    int arr[n] = {100, 66, 54, 48, 32};
    for (int i = 0; i < n; i++)
    {
        enqueue(arr[i], arr[i]);
    }

    int index = peek();
    printf("%d\n", priotyQ[index].value);
    dequeue();

    index = peek();
    printf("%d\n", priotyQ[index].value);
    dequeue();

    index = peek();
    printf("%d\n", priotyQ[index].value);

    return 0;
}

