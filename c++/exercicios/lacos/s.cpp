#include <iostream>
using namespace std;

int main() {
    int dividendo, divisor, aux, quociente, resto;
    quociente = 0;
    cout << "Escreva o dividendo: " << endl;
    cin >> dividendo;
    cout << "Escreva o divisor: " << endl;
    cin >> divisor;
    aux = dividendo;
    while(aux >= divisor) {
        aux = aux - divisor;
        quociente = quociente + 1;
    }
    resto = aux;
    cout << "Quociente: " << quociente << endl;
    cout << "Resto: " << resto << endl;
    return 0;
}