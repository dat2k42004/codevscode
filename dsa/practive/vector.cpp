#include <iostream>
using namespace std;

long long find_fibonacci_period(long long B) {
    long long previous = 0, current = 1;
    for (int i = 0; i < B * B; ++i) {
        long long temp = (previous + current) % B;
        previous = current;
        current = temp;
        if (previous == 0 && current == 1) {
            return i + 1;
        }
    }
    return 0;
}

int main() {
    int T;
    cin >> T;
    
    while (T--) {
        long long B;
        cin >> B;
        cout << find_fibonacci_period(B) << endl;
    }
    
    return 0;
}
