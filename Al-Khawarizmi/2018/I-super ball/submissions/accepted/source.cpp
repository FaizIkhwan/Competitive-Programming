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

int main(){
    auto cc = clock();
    ll F, L;
    cin >> F >> L;

    ll distances[F][F];
    ll produceCost[F][L];
    ll recycleCost[F][L];

    REP(i, F){
        REP(j, F) {
            ll C;
            cin >> C;
            distances[i][j] = C;
        }
        REP(j, L) {
            ll D;
            cin >> D;
            produceCost[i][j] = D;
        }
        REP(j, L) {
            ll R;
            cin >> R;
            recycleCost[i][j] = R;
        }
    }

    ll N;
    cin >> N;
    ll layers[N];
    REP(i, N){
        cin >> layers[i];
        layers[i]--;
    }
    dbgp("Itime " << (clock() - cc));

    vector<ll> mincost(F, LLONG_MAX);
    REP(il, N) {
        auto c = clock();
        ll thelayer = layers[il];

        if (il == 0){
            REP(i, F) {
                ll pCost = produceCost[i][thelayer];
                if (pCost != -1) {
                    mincost[i] = pCost;
                }
            }
        } else {
            vector<ll> nmincost(F, LLONG_MAX);
            REP(cFactory, F) {
                if (mincost[cFactory] != LLONG_MAX){
                    ll cCost = mincost[cFactory];

                    REP(i, F){
                        ll travelCost = distances[cFactory][i];
                        ll prodCost = produceCost[i][thelayer];
                        if (prodCost == -1) continue;
                        ll nCost = cCost + travelCost + prodCost;
                        nmincost[i] = min(nmincost[i], nCost);
                    }
                }
            }

            mincost = nmincost;
        }
    }

    REP(il, N) {
        ll thelayer = layers[N-1-il];

        if (il == 0){
            vector<ll> nmincost(F, LLONG_MAX);
            REP(cFactory, F) {
                if (mincost[cFactory] != LLONG_MAX){
                    ll cCost = mincost[cFactory];
                    REP(i, F){
                        ll travelCost = distances[cFactory][i];
                        ll rCost = recycleCost[i][thelayer];
                        if (rCost == -1) continue;
                        ll nCost = cCost + rCost;
                        nmincost[i] = min(nmincost[i], nCost);
                    }
                }
            }

            mincost = nmincost;
        } else {
            vector<ll> nmincost(F, LLONG_MAX);
            REP(cFactory, F) {
                if (mincost[cFactory] != LLONG_MAX){
                    ll cCost = mincost[cFactory];
                    REP(i, F){
                        ll travelCost = distances[cFactory][i];
                        ll rCost = recycleCost[i][thelayer];
                        if (rCost == -1) continue;
                        ll nCost = cCost + travelCost + rCost;
                        nmincost[i] = min(nmincost[i], nCost);
                    }
                }
            }
            mincost = nmincost;
        }
    }

    dbgp("Itime " << (clock() - cc));
    ll theMin = LLONG_MAX;
    REP(i, F) {
        theMin = min(theMin, mincost[i]);
    }

    cout << theMin << endl;
}
