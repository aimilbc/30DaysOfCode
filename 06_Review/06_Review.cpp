#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string S, sub1, sub2;
    int T;

    cin >> T;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int i = 0; i < T; i++){
        cin >> S;
        for (int k = 0; k < S.length(); k++){
            if (k % 2 == 0){ // even index
            cout << S[k];
            }
        }
        cout << " ";
        for (int k = 0; k < S.length(); k++){
            if (k % 2 != 0){ // odd index
            cout << S[k];
            }
        }
        cout << endl;
    }

    return 0;
}
