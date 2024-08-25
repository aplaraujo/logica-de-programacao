#include <iostream>
using namespace std;

int main() {
    int i;
    for(i = 1; i <= 200; i++) {
        if(i % 4 == 0 && i < 200) {
            cout << i << endl;
        }
    }
    return 0;
}