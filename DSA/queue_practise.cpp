#include<stdio.h>
#define max 5
int queue[max];
int front = -1;
int rear = -1;
void enqueue(int x){
	if((rear+1)%max == front){
		printf("\n overflow");
	}else if(front == -1 && rear==-1){
		front = rear=0;
		queue[rear] = x;
	}
	else{
		rear = (rear+1)%max;
		queue[rear] = x;
	}
	

}

void dequeue(){
	if(front == -1){
		printf("\n underflow");
	}else if(front==rear){
		front = rear = -1;
	}else{
		printf("\n element %d deleted",queue[front]);
		front = (front+1)%max;
	}	
}
void display(){
	int i = front;
	if(front == -1 && rear ==-1){
		printf("\n underflow");
	}else{
		printf("\n");
		while(i != rear){
			printf(" %d",queue[i]);
			i = (i+1)%max;
		}
		printf(" %d",queue[rear]);

	}
}


int main(){
	enqueue(5);
	enqueue(4);
	enqueue(3);
	enqueue(4);
	enqueue(3);
	display();
	dequeue();
	dequeue();
	enqueue(5);
		enqueue(4);
	display();
}
