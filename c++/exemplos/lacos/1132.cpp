#include <iostream>
using namespace std;

int main() {
    int X, Y, i, sum;
    sum = 0;
    cin >> X >> Y;
    if(X < Y) {
        for(i = X; i <= Y; i++) {
            if(!(i % 13 == 0)) {
                sum = sum + i;
            }
        }
    } else {
        for(i = Y; i <= X; i++) {
            if(!(i % 13 == 0)) {
                sum = sum + i;
            }
        }   
    }
    cout << sum << endl;
    return 0;
}