#include <iostream>
using namespace std;

int main() {
    int i, prev, next, curr;
    prev = 0;
    curr = 1;
    for(i = 1; i <= 15; i++) {
       next = prev + curr;
       cout << next << endl;
       prev = curr;
       curr = next;
    }
    return 0;
}