#include <stdio.h>
#include <stdlib.h>

// Define a node structure
struct Node {
    int data;
    struct Node* next;
};

struct Node *head = NULL;
// Function to create a new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("\nMemory allocation failed");
        exit(1);
    }
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

// Function to add a new node to the ascending order linked list
void insertInAscendingOrder(int value) {
    struct Node *newNode, *current, *prev;

    // Create a new node with the given value
    newNode = createNode(value);

    // If the list is empty or the value is less than the head's data
    if (head == NULL || value < head->data) {
        newNode->next = head;
        head = newNode;
    } else {
        // Traverse the list to find the appropriate position
        current = head;
        prev = NULL;

        while (current != NULL && current->data < value) {
            prev = current;
            current = current->next;
        }

        // Insert the new node in the correct position
        prev->next = newNode;
        newNode->next = current;
    }

    printf("\nNode with value %d inserted in ascending order", value);
}

// Function to display the linked list
void displayList() {
    struct Node* current = head;

    printf("\nLinked List: ");
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

int main() {
//    struct Node* head = NULL;

    // Insert nodes in ascending order
    insertInAscendingOrder(3);
    insertInAscendingOrder(1);
    insertInAscendingOrder(4);
    insertInAscendingOrder(2);

    // Display the resulting linked list
    displayList();

    return 0;
}

