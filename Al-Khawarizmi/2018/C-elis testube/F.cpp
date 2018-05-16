
#include <cstdio>
using namespace std;

int Mix[77];


int main(){
	int N, no = 1;

    Mix[1] = Mix[2] = 1;
    
    for(int i = 3; i <= 76; ++i)
    {
    	Mix[i] = Mix[i - 2] + Mix[i - 3];
    }

    //special cases
    Mix[1] = Mix[2] = 0;
    Mix[3] =1;
    
    while(scanf("%d",&N) == 1 && N > 0)
    {
        printf("Case #%d: %d\n", no++, Mix[N] + Mix[N - 1]);
    }

    return 0;
}