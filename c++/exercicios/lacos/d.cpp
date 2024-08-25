#include <iostream>
using namespace std;

int main() {
    int i, sum;
    sum = 0;
    for(i = 1; i <= 500; i++) {
        if(i % 2 == 0) {
            sum = sum + i;
        }
    }
    cout << sum << endl;
    return 0;
}