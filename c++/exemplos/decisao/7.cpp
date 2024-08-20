#include <iostream>
using namespace std;

int main() {
  int A, B, C;
  cin >> A >> B >> C;
  if (A + B > C && B + C > A && A + C > B)
  {
    if(A != B && B != C && C != A) {
        cout << "Triângulo escaleno" << endl;
    } else if (A == B && B != C) {
        cout << "Triângulo isóceles" << endl;
    } else {
        cout << "Triângulo equilátero" << endl;
    }
  } else {
    cout << "Não forma um triângulo" << endl;
  }
  
  return 0;
} 