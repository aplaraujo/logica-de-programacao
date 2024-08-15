#include <iostream>
using namespace std;

int main() {
    int A, B, X;
    cin >> A >> B;
    X = A;
    A = B;
    B = X;
    cout << "Valor de A: " << A << endl;
    cout << "Valor de B: " << B << endl;
    return 0;
}