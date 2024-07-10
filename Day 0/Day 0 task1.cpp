#include <iostream>
#include <iomanip>
#include <limits>
#include <string>
using namespace std;
int main() {
int i = 4;
double d = 4.0;
string s = "RandomString ";

int a;
double b, sum;
string c;

cin>>a;
cin>>b;
getline(cin,c);


cout << a+i <<endl;
sum=b+d;
cout << sum <<endl;
cout << s.append(c) <<endl;

return 0;
}
