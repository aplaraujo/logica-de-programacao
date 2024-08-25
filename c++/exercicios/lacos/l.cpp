#include <iostream>
using namespace std;

int main() {
    int fat, i, sum;
    int num[15] = { 19, 10, 9, 13, 12, 8, 6, 3, 2, 15, 7, 14, 20, 11, 18 };
    sum = 0;
    fat = 1;
    for (i = 1; i <= sizeof(num); i++) {
        fat = fat * num[i];
        sum = sum + fat;
    }
    cout << sum << endl;
    return 0;
}