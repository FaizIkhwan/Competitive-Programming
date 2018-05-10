#include <stdio.h>
#include <string.h>
#include <algorithm>
#include <cmath>
#include <iostream>
#include <math.h>
#include <queue>
#include <set>
using namespace std;
#define ABS(x) ((x)<0 ? -(x) : (x))
#define REP(i,n) for(int i=0, _e(n); i<_e; i++)
#define FOR(i,a,b) for(int i(a), _e(b); i<=_e; i++)
#define FORD(i,a,b) for(int i(a), _e(b); i>=_e; i--)
#define FORIT(i, m) for (__typeof((m).begin()) i=(m).begin(); i!=(m).end(); ++i)
#define SET(t,v) memset((t), (v), sizeof(t))
#define ALL(x) x.begin(), x.end()
#define UNIQUE(c) (c).resize( unique( ALL(c) ) - (c).begin() )
#define inf_int (1<<31)-1
#define inf_long (1<<63)-1
#define sz size()
#define pb push_back
#define VI vector<int>
#define VS vector<string>
typedef long long LL;
typedef long double LD;
typedef pair<int,int> pii;
#ifdef DEBUG
#define dbg(x) x
#define dbgp(x) cerr << x ;
#else
#define dbg(x) //x
#define dbgp(x) //cerr << x << endl;
#endif
#define maxn 210
#define maxm 100000
#define inf 0x3f3f3f3f

char s[50][50];
int n,m;
int tot;
int S,T;

struct MaxFlow{
    int size, n ;
    int st, en, maxflow, mincost ; 
    bool vis[maxn] ; 
    int net[maxn], pre[maxn], cur[maxn], dis[maxn];
    std::queue <int> Q;
    struct EDGE{
        int v, cap, cost, next; 
        EDGE() {}
        EDGE(int a, int b, int c, int d) {
            v = a , cap = b , cost = c , next = d ;
        }
    }E[maxm];
    void init(int _n){
        n = _n, size = 0; 
        memset(net, -1, sizeof(net));
    }
    void add(int u, int v, int cap, int cost){
        E[size] = EDGE(v,cap, cost,net[u]);
        net[u] = size++;
        E[size] = EDGE(u,0,-cost,net[v]);
        net[v] = size++;
    }
    bool modell(){
        int v, min = inf;
        for(int i=0;i<=n;i++){
            if ( !vis[i] ){
                continue ; 
            }
            for(int j = net[i]; v = E[j].v, j!= -1; j = E[j].next)
                if ( E[j].cap )
                    if ( !vis[v] && dis[v]-dis[i]+E[j].cost < min )
                        min = dis[v] - dis[i] + E[j].cost;
                
        }
        if( min == inf ) {
            return false;
        }
        for(int i=0; i <= n ;i++){
            if ( vis[i] )
                cur[i] = net[i], vis[i] = false, dis[i] +=min;
        }
        return true;
    }
    int augment(int i, int flow){
        if ( i == en ){
            mincost += dis[st] * flow ; 
            maxflow += flow;
            return flow ;
        }
        vis[i] = true;
        for(int j= cur[i], v; v = E[j].v, j!=-1;j = E[j].next){
            if (!E[j].cap)
                continue ;
            if ( vis[v] || dis[v]+E[j].cost != dis[i])
                continue;
            int delta = augment(v,std::min(flow,E[j].cap));
            if ( delta ) {
                E[j].cap -= delta;
                E[j^1].cap +=delta;
                cur[i] = j ;
                return delta; 
            }
        }
        return 0;
    }
    void spfa(){
        int u, v; 
        for(int i=0; i<=n ; i++)
            vis[i] = false, dis[i] = inf ; 
        dis[st] = 0 ;
        Q.push(st);
        vis[st] = true; 
        while(!Q.empty()){
            u = Q.front(), Q.pop();
            vis[u] = false; 
            for(int i = net[u]; v = E[i].v, i!= -1; i =E[i].next){
                if ( !E[i].cap || dis[v] <= dis[u] + E[i].cost )
                    continue ;
                dis[v] = dis[u] + E[i].cost ; 
                if ( !vis[v] ){
                    vis[v] = true ;
                    Q.push(v);
                }
            }
        }
        for(int i = 0 ; i <= n ; i++)
            dis[i] = dis[en] - dis[i] ; 
        
    }
    int zkw(int s, int t){
        st = s , en = t;
        spfa();
        mincost = maxflow = 0 ;
        for(int i = 0 ; i <= n; i++)
            vis[i] = false , cur[i] = net[i];
        do{
            while(augment(st,inf))
                memset(vis,false,sizeof(vis));
        }while (modell());
        return mincost ;
    }
}shit;

int get(int num){
    int g=num*n;
    if (g%m!=0)
        return 10000000;
    shit.init(n+m+20);
    S = 0 ;
    T = n+m+1; 
    for(int i = 1; i <= n; i++)
        for(int j = 1; j<=m ; j++)
            if ( s[i][j] == '1')
                shit.add(i,n+j,1,-1);
            else
                shit.add(i,n+j,1,1);
    for(int i = 1 ; i <= n; i++)
        shit.add(S,i,num,0);
    for(int i = 1 ; i <= m; i++)
        shit.add(n+i,T,num*n/m,0);
    return tot+shit.zkw(S,T);
}

int main(){
    int t;
    int cas = 1 ;
    cin >> t ; 
    while(t--){
        cin >> n >> m ; 
        tot = 0 ;
        for(int i = 1; i <= n; i++)
            scanf("%s",s[i]+1);
        for(int i=1; i<= n;i++)
            for(int j=1; j<=m;j++)
                if ( s[i][j] == '1' )
                    tot++;
        int ans = 1000000;
        for(int i = 0 ; i <= m ; i++ )
            ans = min(ans,get(i));
        cout << "Case " << cas++ << ": " << ans << endl;
        
    }
    return 0;
}
