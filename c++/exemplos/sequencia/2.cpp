#include <iostream>
using namespace std;

int main() {
    int R;
    double pi, A;
    
    cout << "Enter the radius of the circle: ";
    cin >> R;
    pi = 3.14159265;
    
    A = pi * R * R;
    cout << A << endl;
    return 0;
}