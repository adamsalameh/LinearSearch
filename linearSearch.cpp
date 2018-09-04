//g++  5.4.0

#include <iostream>
using namespace std;

int linearSearch (int array[], int length, int num){
    
    for (int i = 0; i < length; i++){
        if (num == array[i]){
           return i;
        }
    }
    
    return -1;
    
}
    
    
int main()
{
    int numbers[] = { 10, 20, 50, 60, 70, 80, 99};
    int length = sizeof(numbers)/ sizeof (numbers[0]);
    cout << linearSearch(numbers,length, 99);
}
