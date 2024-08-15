#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  int SM, PR;
  double NS;
  cin >> SM >> PR;
  cout << fixed << setprecision(2);
  NS = SM + (SM * PR / 100);
  cout << NS << endl;
  return 0;
} 