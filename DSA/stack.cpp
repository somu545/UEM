#include<stdio.h>
#include<stdlib.h>
#define N 5
int stack[N];
int top = -1;

void push()
{
	int item;
	if(top== N - 1){
		printf("\n overflow");
	}else{
		printf("\n Enter data: ");
		scanf("%d",&item);
		top++;
		stack[top] =item;
		
	}
}

void pop(){
	int item;
	if(top == -1){
		printf("\n underflow");
	}else{
		item = stack[top];
		top--;
		printf("%d",item);
	}
}

void display(){
	int i;
	if(top== -1){
		printf("\n nothing to print");
	}else{
		for(i=top; i>= 0 ;i--){
			printf("%d",stack[i]);
		}
	}
}


int main(){
    int choice;  
    while (1)  
    {  
        printf("\nPerform operations on the stack:");  
        printf("\n1.Push the element\n2.Pop the element\n3.Show\n4.End");  
        printf("\n\nEnter the choice: ");  
        scanf("%d", &choice);  
        switch (choice)  
        {  
        case 1:  
            push();  
            break;  
        case 2:  
            pop();  
            break;  
        case 3:  
            display();  
            break;  
        case 4:  
            exit(0);  
        default:  
            printf("\nInvalid choice!!");  
        }  
    }  
}  
