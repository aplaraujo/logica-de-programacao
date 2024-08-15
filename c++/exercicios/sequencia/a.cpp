#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int tempC;
    double tempF;
    cin >> tempC;
    cout << fixed << setprecision(1);
    tempF = ((tempC * 9) / 5) + 32;
    cout << tempF << endl;
    return 0;
}