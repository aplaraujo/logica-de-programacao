#include <iostream>
#include <iomanip>
using namespace std;

int main() {
  int A, B, C, N, VB, T;
  double PV, PA, PB, PC, PN, PVB;
  cin >> A >> B >> C >> N >> VB;
  T = A + B + C + N + VB;
  cout << fixed << setprecision(1);
  PV = (double)(A + B + C) / (double) T * 100;
  PA = ((double) A / (double) T) * 100;
  PB = ((double) B / (double) T) * 100;
  PC = ((double) C / (double) T) * 100;
  PN = ((double) N / (double) T) * 100;
  PVB = ((double) VB / (double) T) * 100;
  cout << "Total de votos: " << T << endl;
  cout << "Porcentagem válidos: " << PV << endl;
  cout << "Porcentagem A: " << PA << endl;
  cout << "Porcentagem B: " << B << endl;
  cout << "Porcentagem C: " << C << endl;
  cout << "Porcentagem nulos: " << PN << endl;
  cout << "Porcentagem brancos: " << PVB << endl;
  return 0;
} 