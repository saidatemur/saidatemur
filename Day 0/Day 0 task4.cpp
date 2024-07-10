#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main() {
	int t;
	cin>>t;
	
	cin.ignore();
	
	for(int i=0;i<t;i++){
		string S;
		getline(cin,S);	
	
	
	string even;
	string odd;
	
	for(int j=0;j<S.length();j++){
		if(j%2==0){
			even+=S[j];
		}else{
			odd+=S[j];
		}
	}
	
	cout<<even<<" "<<odd<<endl;
	
}
	

return 0;
}