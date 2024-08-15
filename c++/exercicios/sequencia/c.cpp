#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int raio, area;
    double vol, pi;
    cin >> raio >> area;
    pi = 3.14159;
    cout << fixed << setprecision(3);
    vol = pi * raio * raio * area;
    cout << vol << endl;
    return 0;
}