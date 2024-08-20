#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  int cod, qtd;
  cin >> cod >> qtd;
  double preco, total;
  cout << fixed << setprecision(2);
  if (cod == 1)
  {
    preco = 4.00;
    total = preco * qtd;
  }
  if (cod == 2)
  {
    preco = 4.50;
    total = preco * qtd;
  }
  if (cod == 3)
  {
    preco = 5.00;
    total = preco * qtd;
  }
  if (cod == 4)
  {
    preco = 2.00;
    total = preco * qtd;
  }
  if (cod == 5)
  {
    preco = 1.50;
    total = preco * qtd;
  }
  cout << "Total: R$ " << total << endl;
  
  return 0;
} 