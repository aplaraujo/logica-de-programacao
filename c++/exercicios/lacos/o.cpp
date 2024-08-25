#include <iostream>
using namespace std;

int main() {
    int i, fat;
    fat = 1;
    for (i = 1; i <= 10; i++) {
        if(i % 2 == 1) {
            fat = fat * i;
            cout << fat << endl;
        }
    }
    return 0;
}