#include <iostream>
#include <cmath>
using namespace std;


int main() {
  int A, B, C, D, X1, X2;
  cin >> A >> B >> C;
  D = (B * B) - 4 * A * C;
  if (D < 0)
  {
    cout << "Não há solução real" << endl;
  }
  else
  {
    if(D == 0) {
        cout << "Há uma solução real" << endl;
    } else {
        X1 = (- B + sqrt(D)) / (2 * A);
        X2 = (- B - sqrt(D)) / (2 * A);
        cout << X1 << endl;
        cout << X2 << endl;
    }
  }
  
  return 0;
} 