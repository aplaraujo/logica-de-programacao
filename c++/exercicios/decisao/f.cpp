#include <iostream>
using namespace std;

int main() {
  int a, b, c, d, e, f, aux;
  cin >> a >> b >> c;
  d = a;
  e = b;
  f = c;
  if (d > e)
  {
    aux = d;
    d = e;
    e = aux;
  }
  if (d > f)
  {
    aux = d;
    d = f;
    f = aux;
  }
  if (e > f)
  {
    aux = e;
    e = f;
    f = aux;
  }
  cout << a << endl;
  cout << b << endl;
  cout << c << endl;
  cout << "" << endl;
  cout << d << endl;
  cout << e << endl;
  cout << f << endl;
  
  return 0;
} 