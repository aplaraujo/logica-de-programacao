#include <iostream>
using namespace std;

int main() {
    int i, mult, num;
    cin >> num;
    for(i = 1; i <= 10; i++) {
        mult = i * num;
        cout << i << " x " << num << " = " << mult << endl;
    }
    return 0;
}