#include <iostream>

using namespace std;
int n, dd, mm, yy;
int graph[13];
string month [13] = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

void drawGraph() {

	for (int i = 1; i < 13; i++) {
		cout << month[i] << ":";
		for (int j = 0; j < graph[i]; j++) {
			cout << '*';
		}
		cout << endl;
	}
}


int main() {

	cin >> n;
	int x = 1;

	while (n != 0) {
		for (int i=0; i<13; i++)
			graph[i] = 0;

		for(int i = 1; i <= n; i++) {
			cin >> dd >> mm >> yy ;
			graph[mm]++;
		}

		cout << "Case #" << x << ":" << endl;
		drawGraph();

		cin >> n;
		x++;
	}


    return 0;
}


