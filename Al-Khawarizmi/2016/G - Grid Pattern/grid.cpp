//not my code
#include <iostream>

using namespace std;
int n, row, col, w, h;

void drawLine() {
	
		for (int i = 1; i <= col; i++) {
			cout << "+";
			for (int j = 1; j <= w; j++) {
				cout << "-";
			}
		}
		cout << "+" << endl;
}

void drawGridRow() {
	
	for (int i = 1; i <= h; i++) {
		for (int j = 1; j <= col; j++) {
			cout << "|";
	
			
			for (int  k = 1; k <= w; k++) {
				cout << "*";
			}
		}
		cout << "|" << endl;
	}
}

int main() {

	cin >> n;
	
	for(int i =1; i <= n; i++) {
		cin >> row >> col >> w >> h;
		cout << "Case #" << i << ":" << endl;
		
		drawLine();
		
		for (int k = 1; k <= row; k++) {
			drawGridRow();
			drawLine();
		}
		
		//cout << endl;
	}
    return 0;
}


