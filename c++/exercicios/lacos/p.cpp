#include <iostream>
using namespace std;

int main() {
    double i, sum, media;
    sum = 0;
    for(i = 50; i <= 70; i++) {
        sum = sum + i;
    }
    media = sum / 20;
    cout << sum << endl;
    cout << media << endl;
    return 0;
}