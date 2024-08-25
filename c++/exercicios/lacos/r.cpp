#include <iostream>
using namespace std;

int main() {
    int i, num, maior, menor;
    i = 0;
    cin >> num;
    while(num >= 0) {
        if(i == 0) {
            maior = num;
            menor = num;
        }
        if(num >= maior) {
            maior = num;
        }
        if(num <= menor) {
            menor = num;
        }
        cin >> num;
        i++;
    }
    cout << "Maior número: " << maior << endl;
    cout << "Menor número: " << menor << endl;
    return 0;
}