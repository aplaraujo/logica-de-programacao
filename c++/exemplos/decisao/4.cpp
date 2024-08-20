#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  double SA, NS;
  cin >> SA;
  cout << fixed << setprecision(2);
  if (SA <= 500)
  {
    NS = SA + (SA * 0.15);
  } else if (SA <= 1000)
  {
    NS = SA + (SA * 0.10);
  } else
  {
    NS = SA + (SA * 0.05);
  }
  cout << "Novo salário: " << NS << endl;
  return 0;
} 