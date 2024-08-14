#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int codPeca1, codPeca2, quantPeca1, quantPeca2;
    double precoPeca1, precoPeca2, total;
    cin >> codPeca1 >> quantPeca1 >> precoPeca1;
    cin >> codPeca2 >> quantPeca2 >> precoPeca2;
    cout << fixed << setprecision(2);
    total = ((quantPeca1 * precoPeca1) + (quantPeca2 * precoPeca2));
    cout << "VALOR A PAGAR: R$ " << total << endl;
    return 0;
}