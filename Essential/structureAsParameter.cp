#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;


struct Rectangle {
    int length;
    int breadth;
    
};


struct Rectangle *function(){
    struct Rectangle *pointer;
    pointer = new Rectangle;
    
    // p(struct Rectangle *) malloc(sizeof(struct Rectangle));
    pointer -> length = 15;
    pointer -> breadth = 7;
    
    return pointer;
}

int main()
{
    struct Rectangle *pointer = function();

    cout<<"Length "<<pointer -> length<<endl<<"breadth "<<pointer -> breadth<<endl;
    
    return 0;
}
