#include <iostream>
#include <string>
using namespace std;

int main() {
    string comodo;
    char resp;
    int larg, comp, areaCom, areaTotal;
    areaTotal = 0;
    resp = 'S';
    while(resp == 'S' || resp == 's') {
        cout << "Digite o nome do cômodo: " << endl;
        cin >> comodo;
        cout << "Digite a largura do cômodo: " << endl;
        cin >> larg;
        cout << "Digite o comprimento do cômodo: " << endl;
        cin >> comp;
        
        areaCom = larg * comp;
        cout << "Área do cômodo: " << areaCom << endl;
        cout << "Deseja continuar? " << endl;
        cin >> resp;
        areaTotal = areaTotal + areaCom;
    }
    cout << "Área total: " << areaTotal;
    return 0;
}