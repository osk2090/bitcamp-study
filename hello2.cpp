#include <stdio.h>


void print(int a){
	printf("===> %d\n",a);
}

void print(float f){
     printf("===> %f\n",f);
}

int main(int arge,char* argv[]){
    printf("Hello!\n");

    print(100);
    print(3.14f);

}
