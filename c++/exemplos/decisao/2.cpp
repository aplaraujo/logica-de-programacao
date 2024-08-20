#include <iostream>
using namespace std;

int main() {
  int A, B, X, R;
  cin >> A >> B;
  X = A + B;
  if (X >= 10)
  {
    R = X + 5;
  } else
  {
    R = X - 7;
  }
  
  cout << "Resultado: " << R << endl;
  return 0;
} 