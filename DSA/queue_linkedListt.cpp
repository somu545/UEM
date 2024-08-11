#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
};

struct node * front = 0;
struct node *rear = 0;

void enque(int x){
	struct node *newnode;
	newnode = (struct node*)malloc(sizeof(struct node));
	newnode->data = x;
	newnode->next = 0;
	if(front==0 && rear == 0){
		front=rear=newnode;
	}else{
		rear->next = newnode;
		rear = newnode;
	}
	
}

void deque(){
	struct node *temp;
		temp = front;
	if(front==0 && rear == 0){
		printf("\n underflow");
	}else{
		printf("\n deque = %d",front->data);
		front = front->next;
		free(temp);	
		
	}
	
}

void display(){
	struct node *temp;
	if(front==0 && rear == 0){
		printf("\n underflow");
	}else{
		temp = front;
		while(temp != 0){
			printf("\n dis = %d",temp->data);
			temp = temp->next;
		}
	}
}
int main(){
	enque(2);
	enque(3);
	enque(4);
	deque();
	deque();
	display();
	return 0;
}
