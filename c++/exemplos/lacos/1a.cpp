#include <iostream>
using namespace std;

int main() {
  int i, fat, num;
  cin >> num;
  fat = 1;
  for (i = 1; i <= num; i++)
  {
    fat = fat * i;
  }
  cout << "Fatorial de " << num << ": " << fat << endl;
  return 0;
} 