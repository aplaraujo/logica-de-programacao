#include <iostream>
using namespace std;

int main() {
    int A, B, C, D, S1, S2, S3, S4, S5, S6, M1, M2, M3, M4, M5, M6;
    cin >> A >> B >> C >> D;
    S1 = A + B;
    S2 = A + C;
    S3 = A + D;
    S4 = B + C;
    S5 = B + D;
    S6 = C + D;
    M1 = A * B;
    M2 = A * C;
    M3 = A * D;
    M4 = B * C;
    M5 = B * D;
    M6 = C * D;
    cout << "Valor de S1: " << S1 << endl;
    cout << "Valor de S2: " << S2 << endl;
    cout << "Valor de S3: " << S3 << endl;
    cout << "Valor de S4: " << S4 << endl;
    cout << "Valor de S5: " << S5 << endl;
    cout << "Valor de S6: " << S6 << endl;
    cout << "Valor de M1: " << M1 << endl;
    cout << "Valor de M2: " << M2 << endl;
    cout << "Valor de M3: " << M3 << endl;
    cout << "Valor de M4: " << M4 << endl;
    cout << "Valor de M5: " << M5 << endl;
    cout << "Valor de M6: " << M6 << endl;
    return 0;
}