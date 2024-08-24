#include <iostream>
using namespace std;

int main() {
  int i, fat, num;
  cin >> num;
  fat = 1;
  i = 1;
  while (i <= num)
  {
    fat = fat * i;
    i++;
  }
    cout << "Fatorial de " << num << ": " << fat << endl;
  return 0;
} 