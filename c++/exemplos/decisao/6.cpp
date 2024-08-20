#include <iostream>
using namespace std;

int main() {
  int N;
  cin >> N;
  if (N >= 20 && N <= 90)
  {
    cout << "O valor está dentro da faixa de 20 a 90" << endl;
  } else {
    cout << "O valor não está dentro da faixa de 20 a 90" << endl;
  }
  
  return 0;
} 