#include<stdio.h>
#include<stdlib.h>

struct node {
	int data;
	struct node *next;
	struct node *prev;;
};

struct node *head;
struct node *tail;

void insertBeg(int x){
	struct node *newnode;
	newnode = (struct node*)malloc(sizeof(struct node));
	newnode->data = x;
	newnode->next = 0;
	
	if(head==0){
		head=tail=newnode;
		newnode->next = tail;
		newnode->prev = head;
	}else{
		newnode->next = head;
		newnode->prev = tail;
		head->prev = newnode;
		tail->next = newnode;
		head = newnode;
	}
}

void insertEnd(int x){
	struct node *newnode;
	newnode = (struct node*)malloc(sizeof(struct node));
	newnode->data = x;
	newnode->next = 0;
	
	if(head==0){
		head=tail=newnode;
		newnode->next = tail;
		newnode->prev = head;
	}else{
		newnode->next = head;
		head->prev = newnode;
		newnode->prev = tail;
		tail->next = newnode;
		tail = newnode;
		
	}
}

void insertPos(int x){
	int pos = 3;
	int i =1 ;
	struct node *temp;
	temp = head;
	struct node *newnode;
	newnode = (struct node*)malloc(sizeof(struct node));
	newnode->data = x;
	newnode->next = 0;
	
	if(pos == 1){
		insertBeg(x);
	}else{
		while(i < pos-1){
			temp = temp->next;
			i++;
		}
		
		newnode->prev = temp;

		newnode->next = temp->next;
		temp->next->prev= newnode;
				temp->next = newnode;
		
	}
	
}

void deleteBeg(){
	struct node *temp;
	temp = head;
	if(head==0){
		printf("\n underflow");
	}else if(head->next == head){
		head = tail = 0;
		free(temp);
	}else{
		head = head->next;
		head->prev = tail;
		tail->next = head;	
		free(temp);
	}
	
	
}

void deleteEnd() {
    if (head == NULL) {
        printf("\nUnderflow");
        return;
    }

    struct node *temp = tail;

    if (head->next == head) {
        head = tail = NULL;
    } else {
        tail = tail->prev;
        tail->next = head;
        head->prev = tail;
    }

    free(temp);
}


void deletePos(){
	struct node *temp;
	int i = 1;
	temp = head;
	int pos = 3;
	if(pos==1){
		deleteBeg();
	}else{
		while(i <pos){
			temp = temp->next;
			i++;
		}
		
		temp->prev->next = temp->next;
		temp->next->prev = temp->prev;
		if(temp->next == head){
			tail  =temp->prev;
			free(temp);
		}else{
			free(temp);
		}
	}

	
}
void display() {
    if (tail == NULL) {
        printf("List is empty\n");
        return;
    }

    struct node *temp = tail->next;

    do {
        printf("%d ", temp->data);
        temp = temp->next;
    } while (temp != tail->next);

    printf("\n");
}


int main(){
	insertBeg(1);	
	insertEnd(2);
	insertBeg(3);
	insertPos(4);
	display();
		deletePos();
	deleteBeg();
	deleteEnd();
	
	display();
	
}
