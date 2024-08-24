#include <iostream>
#include <vector>
using namespace std;

int main() {
  double num;
  int i, sum;
  sum = 0;
  for (i = 1; i <= 6; i++)
  {
    cin >> num;
    if (num > 0)
    {
        sum = sum + 1;
    } 
  }
  cout << sum << " valores positivos" << endl;
  return 0;
} 