#include <iostream>
using namespace std;

int main() {
    int i, quad;
    i = 15;
    while(i <= 200) {
        quad = i * i;
        cout << quad << endl;
        i = i + 3;
    }
    return 0;
}