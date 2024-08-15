#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  int R, C;
  double D;
  cin >> R >> C;
  cout << fixed << setprecision(2);
  D = R / C;
  cout << D << endl;
  return 0;
} 