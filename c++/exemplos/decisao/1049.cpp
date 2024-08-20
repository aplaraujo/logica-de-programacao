#include <iostream>
using namespace std;

int main() {
  string A, B, C;
  cin >> A >> B >> C;
  if (A == "vertebrado" && B == "ave" && C == "carnivoro")
  {
    cout << "aguia" << endl;
  }
  if (A == "vertebrado" && B == "ave" && C == "onivoro")
  {
    cout << "pomba" << endl;
  }
  if (A == "vertebrado" && B == "mamifero" && C == "onivoro")
  {
    cout << "homem" << endl;
  }
  if (A == "vertebrado" && B == "mamifero" && C == "herbivoro")
  {
    cout << "vaca" << endl;
  }
  if (A == "invertebrado" && B == "inseto" && C == "hematofago")
  {
    cout << "pulga" << endl;
  }
  if (A == "invertebrado" && B == "inseto" && C == "herbivoro")
  {
    cout << "lagarta" << endl;
  }
  if (A == "invertebrado" && B == "anelideo" && C == "hematofago")
  {
    cout << "sanguessuga" << endl;
  }
  if (A == "invertebrado" && B == "anelideo" && C == "onivoro")
  {
    cout << "minhoca" << endl;
  }
  return 0;
} 