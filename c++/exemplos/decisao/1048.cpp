#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  double SA;
  cin >> SA;
  cout << fixed << setprecision(2);
  if (SA <= 400)
  {
    cout << "Novo salario: " << SA + (SA * 0.15) << endl;
    cout << "Reajuste ganho: " << SA * 0.15 << endl;
    cout << "Em percentual: " << 15 << " %" << endl;
  } else if (SA > 400 && SA <= 800)
  {
    cout << "Novo salario: " << SA + (SA * 0.12) << endl;
    cout << "Reajuste ganho: " << SA * 0.12 << endl;
    cout << "Em percentual: " << 12 << " %" << endl;
  } else if (SA > 800 && SA <= 1200)
  {
    cout << "Novo salario: " << SA + (SA * 0.10) << endl;
    cout << "Reajuste ganho: " << SA * 0.10 << endl;
    cout << "Em percentual: " << 10 << " %" << endl;
  } else if (SA > 1200 && SA <= 2000)
  {
    cout << "Novo salario: " << SA + (SA * 0.07) << endl;
    cout << "Reajuste ganho: " << SA * 0.07 << endl;
    cout << "Em percentual: " << 7 << " %" << endl;
  } else
  {
    cout << "Novo salario: " << SA + (SA * 0.04) << endl;
    cout << "Reajuste ganho: " << SA * 0.04 << endl;
    cout << "Em percentual: " << 4 << " %" << endl;
  }
  
  return 0;
} 