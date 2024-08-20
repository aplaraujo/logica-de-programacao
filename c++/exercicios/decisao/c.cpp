#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  double n1, n2, n3, n4, md;
  cin >> n1 >> n2 >> n3 >> n4;
  md = (n1 + n2 + n3 + n4) / 4;
  cout << fixed << setprecision(1);
  if (md >= 5)
  {
    cout << "Aprovado" << endl;
  }
  else
  {
    cout << "Reprovado" << endl;
  }
  
  return 0;
} 