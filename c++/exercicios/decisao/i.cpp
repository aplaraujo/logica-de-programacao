#include <iostream>
using namespace std;

int main() {
  int a, b, c, d, e;
  cin >> a >> b >> c >> d >> e;
  if (a > b && a > c && a > d && a > e)
  {
    cout << a << endl;
  }
  if (b > a && b > c && b > d && b > e)
  {
    cout << b << endl;
  }
  if (c > a && c > b && c > d && c > e)
  {
    cout << c << endl;
  }
  if (d > a && d > b && d > c && d > e)
  {
    cout << d << endl;
  }
  if (e > a && e > b && e > c && e > d)
  {
    cout << e << endl;
  }
  if (a < b && a < c && a < d && a < e)
  {
    cout << a << endl;
  }
  if (b < a && b < c && b < d && b < e)
  {
    cout << b << endl;
  }
  if (c < a && c < b && c < d && c < e)
  {
    cout << c << endl;
  }
  if (d < a && d < b && d < c && d < e)
  {
    cout << d << endl;
  }
  if (e < a && e < b && e < c && e < d)
  {
    cout << e << endl;
  }
  return 0;
} 