#include <iostream>
using namespace std;

int main() {
  int num;
  cin >> num;
  if (num >= 1 && num <= 9)
  {
    cout << "O valor está na faixa permitida" << endl;
  } else {
    cout << "O valor está fora da faixa permitida" << endl;
  }
  
  return 0;
} 