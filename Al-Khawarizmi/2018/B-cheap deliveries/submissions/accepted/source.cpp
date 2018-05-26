//not my code

#include<bits/stdc++.h>
using namespace std;

typedef long long int ll;
typedef pair<ll,ll> pii;
#define REP(i,n) for(ll i=0;i<n;i++)

#ifdef DEBUG
#define dbg(x) x
#define dbgp(x) cerr << x << endl;
#else
#define dbg(x) //x
#define dbgp(x) //cerr << x << endl;
#endif

#define MAX_N 100100
#define MAX_K 18

int n,m,k;

map<ll, ll> graph[MAX_N];

ll reducedGraph[MAX_K][MAX_K];

ll djikstra(int from, int to){
    bool considered[n];
    REP(i, n){
        considered[i] = false;
    }

    set<pii> priorityQueue;
    priorityQueue.insert({ 0, from});

    while(priorityQueue.size()){
        pii top = *priorityQueue.begin();
        priorityQueue.erase(priorityQueue.begin());

        if(considered[top.second]) continue;
        considered[top.second] = true;

        if(top.second == to) return top.first;
        
        for(auto next: graph[top.second]){
            if(considered[next.first]) continue;
            priorityQueue.insert({ next.second+top.first, next.first });
        }
    }

    return -1;
}

ll maskPosition[(1<<MAX_K)+100];

ll cache[MAX_K][(1<<MAX_K)];
//map<pii, ll> cache;

ll call = 0;
ll cacheCall = 0;

ll calculate(int mask, int startFrom){
    call++;

    if((mask & -mask) == mask) {
        // Just one
        return reducedGraph[startFrom][maskPosition[mask]];
    }

    /*
    pii state = {mask,startFrom};
    if(cache.find(state) != cache.end()){
        cacheCall++;
        return cache[state];
    }
    */
    if(cache[startFrom][mask] != -2){
        cacheCall++;
        return cache[startFrom][mask];
    }

    
    ll answer = -1;
    ll curMask = mask;
    while(curMask){
        ll lbit = curMask & -curMask;
        ll bitPos = maskPosition[lbit];
        curMask = curMask & (~lbit);

        ll dist = reducedGraph[startFrom][bitPos];
        if(dist == -1) continue;
        
        ll recur = calculate(mask & ~lbit, bitPos);
        if(recur == -1) continue;

        if(answer == -1) answer = recur+dist;
        else answer = min(answer, recur+dist);
    }

    //cache[state] = answer;
    cache[startFrom][mask] = answer;
    return answer;
}

int main(){

    REP(i, MAX_K){
        maskPosition[1<<i] = i;
    }

    REP(i, MAX_K){
        REP(j, 1<<MAX_K){
            cache[i][j] = -2;
        }
    }

    // Start actual solving
    cin >> n >> m >> k;

    vector<pii> tasks;

    REP(i, m){
        ll u,v,l;
        cin >> u >> v >> l;
        u--;v--;
        if(graph[u].find(v) == graph[u].end()){
            graph[u][v] = l;
        }else{
            graph[u][v] = min(graph[u][v], l);
        }
        swap(u, v);
        if(graph[u].find(v) == graph[u].end()){
            graph[u][v] = l;
        }else{
            graph[u][v] = min(graph[u][v], l);
        }
    }


    REP(i, k){
        ll f, d;
        cin >> f >> d;
        f--;d--;
        tasks.push_back(make_pair(f,d));
    }


    ll base = 0;
    REP(i, k){
        ll res = djikstra(tasks[i].first, tasks[i].second);
        if(res == -1){
            dbgp("failed on " << tasks[i].first << " " << tasks[i].second);
            cout << -1 << endl;
            return 0;
        }
        base += res;
    }

    // Prepare for DB
    dbgp("Prepare for DB");
    REP(i, MAX_K){
        REP(j, MAX_K){
            reducedGraph[i][j] = -1;
        }
    }

    dbgp("Prepare for Djikstra");
    REP(i, k){
        for(int j=i+1;j<k;j++){
            reducedGraph[i][j] = djikstra(tasks[i].second, tasks[j].first);
            reducedGraph[j][i] = djikstra(tasks[j].second, tasks[i].first);
        }
    }
    dbgp("Doing DP");

    ll res = -1;
    
    REP(i, k){
        ll cMask = 1 << i;
        ll cur = calculate(((1<<k)-1) & ~cMask, i);
        if(cur != -1){
            if(res == -1) res = cur;
            else res = min(cur, res);
        }
    }

    if(res != -1) res += base;

    cout << res << endl;

    dbgp("call " << call << " " << cacheCall);
}
