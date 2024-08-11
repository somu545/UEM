
//stack using array------------------------------------------

#include <stdio.h>   
int stack[100],i,j,choice=0,n,top=-1;  
void push();  
void pop();  
void show();  
void main ()  
{  
      
    printf("Enter the number of elements in the stack ");   
    scanf("%d",&n);  
    printf("*********Stack operations using array*********");  
  
printf("\n----------------------------------------------\n");  
    while(choice != 4)  
    {  
        printf("Chose one from the below options...\n");  
        printf("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
        printf("\n Enter your choice \n");        
        scanf("%d",&choice);  
        switch(choice)  
        {  
            case 1:  
            {   
                push();  
                break;  
            }  
            case 2:  
            {  
                pop();  
                break;  
            }  
            case 3:  
            {  
                show();  
                break;  
            }  
            case 4:   
            {  
                printf("Exiting....");  
                break;   
            }  
            default:  
            {  
                printf("Please Enter valid choice ");  
            }   
        };  
    }  
}   
  
void push ()  
{  
    int val;      
    if (top == n )   
    printf("\n Overflow");   
    else   
    {  
        printf("Enter the value?");  
        scanf("%d",&val);         
        top = top +1;   
        stack[top] = val;   
    }   
}   
  
void pop ()   
{   
    if(top == -1)   
    printf("Underflow");  
    else  
    top = top -1;   
}   
void show()  
{  
    for (i=top;i>=0;i--)  
    {  
        printf("%d\n",stack[i]);  
    }  
    if(top == -1)   
    {  
        printf("Stack is empty");  
    }  
}  





//stack using linked list-----------------------------------------------------------------

#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
};

struct node *top =NULL;

void push(){
	struct node *newnode;
	newnode = (struct node*)malloc(sizeof(struct node));
	printf("Enter data: ");
	scanf("%d",&newnode->data);
	newnode->next = top;
	top = newnode;
	
}

void pop(){
	struct node *newnode,*temp;
	temp = top;
	if(top== NULL){
		printf("\n underflow");
	}else{
		printf("%d is removed",top->data);
		top = top->next;
		free(temp);
	}
}

void display(){
	struct node *temp;
	if(top == 0){
		printf("\n nothing to print");
	}else{
		while(top != 0){
			printf("%d",top->data);
			top = top->next;
		}
	}
}

int main ()  
{  
    int choice=0;     
    printf("\n*********Stack operations using linked list*********\n");  
    printf("\n----------------------------------------------\n");  
    while(choice != 4)  
    {  
        printf("\n\nChose one from the below options...\n");  
        printf("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
        printf("\n Enter your choice \n");        
        scanf("%d",&choice);  
        switch(choice)  
        {  
            case 1:  
            {   
                push();  
                break;  
            }  
            case 2:  
            {  
                pop();  
                break;  
            }  
            case 3:  
            {  
                display();  
                break;  
            }  
            case 4:   
            {  
                printf("Exiting....");  
                break;   
            }  
            default:  
            {  
                printf("Please Enter valid choice ");  
            }   
    };  
}  
}

//infix to prefix-------------------------------------------------------

include <limits.h>  
#include <stdio.h>  
#include <stdlib.h>  
#define MAX 20  
  
char stk[20];  
int top = -1;  
  
int isEmpty()  
{  
    return top == -1;  
}  
int isFull()  
{  
    return top == MAX - 1;  
}  
  
char peek()  
{  
    return stk[top];  
}  
  
char pop()  
{  
    if(isEmpty())  
        return -1;  
  
    char ch = stk[top];  
    top--;  
    return(ch);  
}  
  
void push(char oper)  
{  
    if(isFull())  
        printf("Stack Full!!!!");  
     
    else{  
        top++;  
        stk[top] = oper;  
    }  
}  
  
int checkIfOperand(char ch)   
{   
    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');   
}   
  
int precedence(char ch)   
{   
    switch (ch)   
    {   
    case '+':   
    case '-':   
        return 1;   
  
    case '*':   
    case '/':   
        return 2;   
  
    case '^':   
        return 3;   
    }   
    return -1;   
}   
  
int covertInfixToPostfix(char* expression)   
{   
    int i, j;  
  
    for (i = 0, j = -1; expression[i]; ++i)   
    {   
       if (checkIfOperand(expression[i]))   
            expression[++j] = expression[i];   
  
        else if (expression[i] == '(')   
            push(expression[i]);   
  
        else if (expression[i] == ')')   
        {   
            while (!isEmpty() && peek() != '(')   
                expression[++j] = pop();   
            if (!isEmpty() && peek() != '(')   
                return -1;             
            else  
                pop();   
        }  
        else   
        {   
            while (!isEmpty() && precedence(expression[i]) <= precedence(peek()))   
                expression[++j] = pop();   
            push(expression[i]);   
        }   
  
    }   
  
    while (!isEmpty())   
        expression[++j] = pop();   
  
    expression[++j] = '\0';   
    printf( "%s", expression);   
}   
  
int main()  
{  
char expression[] = "((x+(y*z))-w)";   
    covertInfixToPostfix(expression);   
    return 0;   
}  

//postfix evaluation --------------------------------------------------------
#include <stdio.h>  
#include <stdlib.h>  
#define MAX_SIZE 100  
// Stack implementation  
int stack[MAX_SIZE];  
int top = -1;  
void push(int item) {  
    if (top >= MAX_SIZE - 1) {  
printf("Stack Overflow\n");  
        return;  
    }  
    top++;  
    stack[top] = item;  
}  
int pop() {  
    if (top < 0) {  
printf("Stack Underflow\n");  
        return -1;  
    }  
    int item = stack[top];  
    top--;  
    return item;  
}  
int is_operator(char symbol) {  
    if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {  
        return 1;  
    }  
    return 0;  
}  
int evaluate(char* expression) {  
    int i = 0;  
    char symbol = expression[i];  
    int operand1, operand2, result;  
  
    while (symbol != '\0') {  
        if (symbol >= '0' && symbol <= '9') {  
            int num = symbol - '0';  
            push(num);  
        }  
        else if (is_operator(symbol)) {  
            operand2 = pop();  
            operand1 = pop();  
            switch(symbol) {  
                case '+': result = operand1 + operand2; break;  
                case '-': result = operand1 - operand2; break;  
                case '*': result = operand1 * operand2; break;  
                case '/': result = operand1 / operand2; break;  
            }  
            push(result);  
        }  
i++;  
        symbol = expression[i];  
    }  
    result = pop();  
    return result;  
}  
  
int main() {  
    char expression[] = "5 6 7 + * 8 -";  
    int result = evaluate(expression);  
printf("Result= %d\n", result);  
return 0;  
}  
