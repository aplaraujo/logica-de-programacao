#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  double n1, n2, n3, n4, ne, md1, md2;
  cin >> n1 >> n2 >> n3 >> n4;
  cout << fixed << setprecision(1);
  md1 = (n1 + n2 + n3 + n4) / 4;
  if (md1 >= 7)
  {
    cout << "Aprovado" << endl;
    cout << md1 << endl;
  } else {
    cin >> ne;
    md2 = (ne + md1) / 2;
    if (md2 >= 5)
    {
        cout << "Aprovado em exame" << endl;
        cout << md2 << endl;
    }
    else
    {
        cout << "Reprovado em exame" << endl;
        cout << md2 << endl;
    }
    
  }
  
  return 0;
} 