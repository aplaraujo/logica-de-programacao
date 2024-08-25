#include <iostream>
using namespace std;

int main() {
    
    int i, grao, quadro;
    i = 1;
    grao = 0;
    quadro = 1;
    while(i <= 64) {
        grao = grao + quadro;
        quadro = quadro * 2;
        i = i + 1;
    }
    cout << grao << endl;
    return 0;
}