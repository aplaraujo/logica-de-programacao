#include <iostream>
using namespace std;

int main() {
    int i, num, mult;
    cin >> num;
    for (i = 1; i <= 10; i++) {
        mult = num * i;
        cout << i << " x " << num << " = " << mult << endl;
    }
    return 0;
}