#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double tempF;
    int tempC;
    cin >> tempF;
    tempC = ((tempF - 32) * 5) / 9;
    cout << tempC << endl;
    return 0;
}