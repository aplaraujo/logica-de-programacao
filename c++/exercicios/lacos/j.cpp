#include <iostream>
using namespace std;

int main() {
    
    int i;
    double tempF;
    for (i = 10; i <= 100; i = i + 10) {
        tempF = ((i * 9) / 5) + 32;
        cout << tempF << endl;
    }

    return 0;
}