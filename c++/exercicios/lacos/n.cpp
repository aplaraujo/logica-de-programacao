#include <iostream>
#include <vector>
using namespace std;

int main() {
    double i, sum, media;
    vector<double> num { 19.0, 10.0, 9.0, 13.0, 12.0, 8.0, 6.0, 3.0, 2.0, 15.0, 7.0, 14.0, 20.0, 11.0, 18.0 };
    for (i = 1; i <= sizeof(num); i++) {
        sum = sum + num[i];
    }
    media = sum / sizeof(num);
    cout << sum << endl;
    cout << media << endl;
    return 0;
}