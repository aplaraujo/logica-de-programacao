#include <iostream>
using namespace std;

int main() {
  int N;
  cin >> N;
  if (N == 1)
  {
    cout << "Você digitou o valor 1" << endl;
  }
  if (N == 2)
  {
    cout << "Você digitou o valor 2" << endl;
  }
  if (N < 1)
  {
    cout << "Você digitou um valor muito baixo" << endl;
  }
  if (N > 2)
  {
    cout << "Você digitou um valor muito alto" << endl;
  }
  
  return 0;
} 