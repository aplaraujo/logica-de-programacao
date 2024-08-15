#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  int R;
  double pi, A;
  cin >> R;
  pi = 3.14159265;
  cout << fixed << setprecision(4);
  A = pi * (R * R);
  cout << A << endl;
  return 0;
} 