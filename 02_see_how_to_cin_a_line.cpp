#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main() {
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";

    
    // Declare second integer, double, and String variables.
    int a = 0;
    double b , f;
    string c, ws;
    // Read and save an integer, double, and String to your variables.
    // Note: If you have trouble reading the entire string, please go back and review the Tutorial closely.
    cin >> a;
    cin >> b;
    getline(cin >> ws, c);
    f = d + b ;
    // Print the sum of both integer variables on a new line.
    cout << a + i << endl;
    // Print the sum of the double variables on a new line.
    cout << fixed << setprecision(1) << f << endl;
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    cout << s + ws + c << endl;
    return 0;
}