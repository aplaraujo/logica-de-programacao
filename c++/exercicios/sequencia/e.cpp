#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int V, TX, T;
    double P;
    cin >> V >> TX >> T;
    cout << fixed << setprecision(2);
    P = V + (V * TX / 100) * T;
    cout << "Prestação: R$ " << P << endl;
    return 0;
}