//simple queue
//#include<stdio.h>
//#define N 5
//int queue[N];
//int front = -1;
//int rear = -1;
//
//void enqueue(int x){
//	if(rear == N-1){
//		printf("\n overflow");
//	}else if(front== -1 && rear ==-1){
//		front = rear = 0;
//		queue[rear] = x;
//	}else{
//		rear++;
//		queue[rear]=x;
//	}
//	
//}
//
//void dequeue(){
//	if(front==-1 && rear==-1){
//		printf("\n underflow");
//	}else if(front==rear){
//		front=rear=-1;
//		
//	}else{
//		printf("\n dequeue = %d",queue[front]);
//		front++;
//	}
//}
//
//void peek(){
//	if(front==-1 && rear ==-1){
//		printf("\n underflow");
//	}else{
//		printf("\n peek = %d",queue[front]);
//	}
//}
//
//void display(){
//	int i;
//	if(front==-1 && rear==-1){
//		printf("\n underflow");
//	}else{
//		printf("\n display");
//		for(i=front; i< rear+1;i++){
//			printf("%d",queue[i]);
//		}
//	}
//}
//
//int main() {
//	enqueue(2);
//	enqueue(3);
//	enqueue(4);
//	peek();
//	dequeue();
//	dequeue();
//	display();
//	return 0;
//}



//circular queue---------------------------------------------


//#include<stdio.h>
//#define max 5
//int queue[max];
//int front = -1;
//int rear = -1;
//void enqueue(int x){
//	if((rear+1)%max == front){
//		printf("\n overflow");
//	}else if(front == -1 && rear==-1){
//		front = rear=0;
//		queue[rear] = x;
//	}
//	else{
//		rear = (rear+1)%max;
//		queue[rear] = x;
//	}
//	
//
//}
//
//void dequeue(){
//	if(front == -1){
//		printf("\n underflow");
//	}else if(front==rear){
//		front = rear = -1;
//	}else{
//		printf("\n element %d deleted",queue[front]);
//		front = (front+1)%max;
//	}	
//}
//void display(){
//	int i = front;
//	if(front == -1 && rear ==-1){
//		printf("\n underflow");
//	}else{
//		printf("\n");
//		while(i != rear){
//			printf(" %d",queue[i]);
//			i = (i+1)%max;
//		}
//		printf(" %d",queue[rear]);
//
//	}
//}
//
//
//int main(){
//	enqueue(5);
//	enqueue(4);
//	enqueue(3);
//	enqueue(4);
//	enqueue(3);
//	display();
//	dequeue();
//	dequeue();
//	enqueue(5);
//		enqueue(4);
//	display();
//}

//simple queue linked list 

//#include<stdio.h>
//#include<stdlib.h>
//
//struct node{
//	int data;
//	struct node *next;
//};
//
//struct node * front = 0;
//struct node *rear = 0;
//
//void enque(int x){
//	struct node *newnode;
//	newnode = (struct node*)malloc(sizeof(struct node));
//	newnode->data = x;
//	newnode->next = 0;
//	if(front==0 && rear == 0){
//		front=rear=newnode;
//	}else{
//		rear->next = newnode;
//		rear = newnode;
//	}
//	
//}
//
//void deque(){
//	struct node *temp;
//		temp = front;
//	if(front==0 && rear == 0){
//		printf("\n underflow");
//	}else{
//		printf("\n deque = %d",front->data);
//		front = front->next;
//		free(temp);	
//		
//	}
//	
//}
//
//void display(){
//	struct node *temp;
//	if(front==0 && rear == 0){
//		printf("\n underflow");
//	}else{
//		temp = front;
//		while(temp != 0){
//			printf("\n dis = %d",temp->data);
//			temp = temp->next;
//		}
//	}
//}
//int main(){
//	enque(2);
//	enque(3);
//	enque(4);
//	deque();
//	deque();
//	display();
//	return 0;
//}


//circular queue linked list----------------------------------------------------------------


//#include<stdio.h>
//#include<stdlib.h>
//
//struct node{
//	int data;
//	struct node *next;
//};
//struct node *front=0;
//struct node *rear = 0;
//
//void enqueue(int x){
//	struct node * newnode;
//	newnode = (struct node*)malloc(sizeof(struct node));
//	newnode->data = x;
//	newnode->next = 0;
//	
//	if(rear ==0){
//		front = rear= newnode;
//		rear->next = front;
//		
//	}else{
//		rear->next = newnode;
//		rear = newnode;
//		rear->next = front;
//		
//	}
//}
//void dequeue(){
//	struct node *temp;
//	temp =front;
//	if(front==0 && rear==0){
//		printf("\n underflow");
//	}else if(front==rear){
//		front = rear= 0;
//		printf(" \n %d removed",temp->data);
//		free(temp);
//	}else{
//		front=front->next;
//		rear->next = front;
//			printf(" \n %d removed",temp->data);
//		free(temp);
//	}
//}
//
//void display(){
//	struct node *temp;
//	temp = front;
//	if(front==0 && rear==0){
//		printf("\n underflow");
//	}else{
//		do{
//			printf("\n %d",temp->data);
//			temp = temp->next;
//		}while(temp != front);
//	}
//}
//
//int main(){
//	enqueue(5);
//	enqueue(4);
//	enqueue(3);
//	display();
//	dequeue();
//	dequeue();
//	display();
//	dequeue();
//}

//DEQUEUE----------------------------------------------------------------------------

//#include<stdio.h>
//#include<stdlib.h>
//#define n 5
//int dequeue[n];
//int f = -1;
//int r =-1;
//	
//void enqueueFront(int x){
//	if((f==0 && r == n-1)|| (f==r+1)){
//		printf("\n queue is full");
//	}else if(f==-1 && r==-1){
//		f = r = 0;
//		dequeue[f] = x;
//	}else if(f==0){
//		f = n-1;
//		dequeue[f] = x;
//	}else{
//		f--;
//		dequeue[f] = x;
//	}
//}
//
//void enqueueRear(int x){
//		if((f==0 && r == n-1)|| (f==r+1)){
//		printf("\n queue is full");
//	}else if(f==-1 && r==-1){
//		f = r = 0;
//		dequeue[r] = x;
//	}else if(r==n-1){
//		r = 0;
//		dequeue[r] = x;
//	}else{
//		r++;
//		dequeue[r] = x;
//	}
//}
//void dequeueFront(){
//	if(f==-1 && r==-1){
//		printf("\n underflow");
//	}else if(f==r){
//		printf("%d removes\n",dequeue[f]);
//		f=r=-1;
//	}else if(f == n-1){
//		printf("%d removes\n",dequeue[f]);
//		f=0;
//	}else{
//		printf("%d removes\n",dequeue[f]);
//		f++;
//		
//	}
//}
//void dequeueRear(){
//	if(f==-1 && r==-1){
//		printf("\n underflow");
//	}else if(f==r){
//		printf("%d removes\n",dequeue[r]);
//		f=r=-1;
//	}else if(r == 0){
//		printf("\n  %d removes",dequeue[r]);
//		r=n-1;
//	}else{
//	
//			printf("\n %d removes",dequeue[r]);
//				r--;
//	}
//}
//
//
//void  display(){
//	int i = f;
//	printf("\n display");
//	while(i!= r){
//		printf(" %d",dequeue[i]);
//		i = (i+1)%n;
//	}
//	printf(" %d",dequeue[r]);
//	printf("\n");
//}
//int main(){
//	enqueueFront(2);
//	enqueueFront(3);
//	enqueueFront(4);
//	enqueueRear(5);
//	display();
//	dequeueFront();
//	dequeueRear();
//	display();
//}


//dequeue linked list------------------------------------------------------------------------------------------------------



  #include <stdio.h>
  #include <stdlib.h>

  struct node {
        int data;
        struct node *prev, *next;
  };

  struct node *head = NULL, *tail = NULL;

  struct node * createNode(int data) {
        struct node *newnode = (struct node *)malloc(sizeof (struct node));
        newnode->data = data;
        newnode->next = newnode->prev = NULL;
        return (newnode);
  }

   /*
    * create sentinel(dummy head & tail) that
    * helps us to do insertion and deletion 
    * operation at front and rear so easily.  And
    * these dummy head and tail wont get deleted
    * till the end of execution of this program
    */

  void createSentinels() {
        head = createNode(0);
        tail = createNode(0);
        head->next = tail;
        tail->prev = head;
  }

  /* insertion at the front of the queue */
  void enqueueAtFront(int data) {
        struct node *newnode, *temp;
        newnode = createNode(data);
        temp = head->next;
        head->next = newnode;
        newnode->prev = head;
        newnode->next = temp;
        temp->prev = newnode;
  }

  /*insertion at the rear of the queue */
  void enqueueAtRear(int data) {
        struct node *newnode, *temp;
        newnode = createNode(data);
        temp = tail->prev;
        tail->prev = newnode;
        newnode->next = tail;
        newnode->prev = temp;
        temp->next = newnode;
  }

  /* deletion at the front of the queue */
  void dequeueAtFront() {
        struct node *temp;
        if (head->next == tail) {
                printf("Queue is empty\n");
        } else {
                temp = head->next;
                head->next = temp->next;
                temp->next->prev = head;
                free(temp);
        }
        return;
  }


  /* deletion at the rear of the queue */

  void dequeueAtRear()  {
        struct node *temp;
        if (tail->prev == head) {
                printf("Queue is empty\n");
        } else {
                temp = tail->prev;
                tail->prev = temp->prev;
                temp->prev->next = tail;
                free(temp);
        }
        return;
  }

  /* display elements present in the queue */
  void display() {
        struct node *temp;

        if (head->next == tail) {
                printf("Queue is empty\n");
                return;
        }

        temp = head->next;
        while (temp != tail) {
                printf("%-3d", temp->data);
                temp = temp->next;
        }
        printf("\n");
  }

  int main() {
        int data, ch;
        createSentinels();
        while (1) {
                printf("1. Enqueue at front\n2. Enqueue at rear\n");
                printf("3. Dequeue at front\n4. Dequeue at rear\n");
                printf("5. Display\n6. Exit\n");
                printf("Enter your choice:");
                scanf("%d", &ch);
                switch (ch) {
                        case 1:
                                printf("Enter the data to insert:");
                                scanf("%d", &data);
                                enqueueAtFront(data);
                                break;

                        case 2:
                                printf("Enter ur data to insert:");
                                scanf("%d", &data);
                                enqueueAtRear(data);
                                break;

                        case 3:
                                dequeueAtFront();
                                break;

                        case 4:
                                dequeueAtRear();
                                break;

                        case 5:
                                display();
                                break;

                        case 6:
                                exit(0);

                        default:
                                printf("Pls. enter correct option\n");
                                break;
                }
        }
        return 0;
  }

