#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  int A, B, C, D, E;
  float F;
  cin >> A >> B;
  C = A + B;
  D = A - B;
  E = A * B;
  cout << fixed << setprecision(2);
  F = (double)A / B;
  cout << "Soma: " << C << endl;
  cout << "Subtração: " << D << endl;
  cout << "Multiplicação: " << E << endl;
  cout << "Divisão: " << F << endl;
  return 0;
} 