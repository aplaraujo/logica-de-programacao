#include <iostream>
using namespace std;

int main() {
    int i, pot;
    pot = 1;
    for(i = 1; i <= 15; i++) {
       pot = pot * 3; 
    }
    cout << pot << endl;
    return 0;
}