#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int T, V, D;
    double L;
    cin >> T >> V;
    D = T * V;
    cout << fixed << setprecision(1);
    L = D / 12;
    cout << "Tempo: " << T << endl;
    cout << "Velocidade: " << V << endl;
    cout << "Distância: " << D << endl;
    cout << "Litros usados: " << L << endl;
    return 0;
}