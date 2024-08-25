#include <iostream>
using namespace std;

int main() {
    int i, pot, base, exp;
    cin >> base >> exp;
    pot = 1;
    for(i = 1; i <= exp; i++) {
       pot = pot * base; 
    }
    cout << pot << endl;
    return 0;
}