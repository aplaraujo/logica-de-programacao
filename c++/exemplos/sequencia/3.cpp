#include <iostream>
using namespace std;

int main() {
   int HT, VH, PD, SB;
   double TD, SL;
   cout << "Digite a quantiade de horas trabalhadas: " << endl;
   cin >> HT;
   cout << "Digite o valor da hora-aula: " << endl;
   cin >> VH;
   cout << "Digite o percentual de desconto: " << endl;
   cin >> PD;
   SB = HT * VH;
   TD = SB * PD / 100;
   SL = SB - TD;
   cout << "Salário bruto: R$ " << SB << endl;
   cout << "Salário líquido: R$ " << SL << endl;
    return 0;
}