#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  string vend;
  double sal, comissao, total;
  cin >> vend;
  cin >> sal >> comissao;
  cout << fixed << setprecision(2);
  total = sal + comissao * 0.15;
  cout << "TOTAL = R$ " << total << endl;
  return 0;
} 