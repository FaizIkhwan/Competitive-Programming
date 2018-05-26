// not my code
#include <cstdio>
#include <sstream>
#include <cstdlib>
#include <cctype>
#include <cmath>
#include <algorithm>
#include <set>
#include <queue>
#include <stack>
#include <list>
#include <iostream>
#include <string>
#include <vector>
#include <cstring>
#include <map>
#include <cassert>
#include <climits>
using namespace std;

#define REP(i,n) for(int i=0, _e(n); i<_e; i++)
#define FOR(i,a,b) for(int i(a), _e(b); i<=_e; i++)
#define FORD(i,a,b) for(int i(a), _e(b); i>=_e; i--)
#define FORIT(i, m) for (__typeof((m).begin()) i=(m).begin(); i!=(m).end(); ++i)
#define SET(t,v) memset((t), (v), sizeof(t))
#define ALL(x) x.begin(), x.end()
#define UNIQUE(c) (c).resize( unique( ALL(c) ) - (c).begin() )

#define sz size()
#define pb push_back
#define VI vector<int>
#define VS vector<string>

typedef long long LL;
typedef long double LD;
typedef pair<int,int> pii;

int n ;
int t[101];
int w[101];
int dp[202];
int total;


int main() {
    int T ;
    cin >> T;
    while(T--){
        cin >> n ;
        total = 0 ;
        for(int i=1;i<=n;i++){
            cin >> t[i] >> w[i] ;
            total+=t[i];
        }
        for (int i=0;i<202;i++) dp[i] = 0 ;
        for(int i=1;i<=n;i++){
            for(int j=total;j>=t[i]+w[i];j--){
                dp[j] = max(dp[j],dp[j-t[i]-w[i]]+t[i]);
            }
        }
        cout << total - dp[total] << endl;
    }
    return 0;
}
