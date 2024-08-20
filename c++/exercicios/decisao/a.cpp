#include <iostream>
using namespace std;

int main() {
  int A, B, X;
  cin >> A >> B;
  if (A > B)
  {
    X = A - B;
  } else {
    X = B - A;
  }
  cout << X << endl;
  return 0;
} 