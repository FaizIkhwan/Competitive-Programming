// not my code
#include <stdio.h>

void PRINT_OUTPUT();
int CHECK_BOUNDARY(int, int);
int CHECK_FREQ();
int CHECK_SEQUENCE();
    
char list[500][2];
int table[5][5]={0};
int congruent, incongruent;
int j;

int main()
{

	int N; char tmp;
	int index1, index2;
	int Ganda24, Baki24;
	int m;

    scanf("%d",&N);
    scanf("%c",&tmp); //remove space character
	for (int i=0; i<N; i++) {
        //reset variables
		j=0; //size of input data
		for (int h=0; h<500; h++)
			list[h][0]=list[h][1]=0; //holder for input data set to 0
		for (int h=0; h<5; h++)
			for (int k=0; k<5; k++)
				table[h][k]=0; //holder for data frequency set to 0, matrix 4 x 4
		
		//READ INPUT
		scanf ("%c%c%c",&list[j][0],&list[j][1], &tmp);
		while (list[j][0] != '0') {
			j++;
			scanf ("%c%c%c",&list[j][0],&list[j][1], &tmp);
		}
		
		//FREQUENCY SETTING
		for (int h=0; h<j; h++) {
	        index1=list[h][0]-'0'; index2=list[h][1]-'0'; //convert character to integer
			if (CHECK_BOUNDARY(index1,index2)) {
				return 0;
			} else
		        table[index1][index2]++;  //update table
        }
        
        //overall must be gandaan 24
        Ganda24 = j / 24; 
        Baki24 = j % 24; //Baki24 == 0 if gandaan 24
        if (Baki24) {
			printf("Case #%d: Not Stroop\n",i+1);
        } else { //makna gandaan 24
            congruent=3*Ganda24; //set bilangan setiap congruent
            incongruent=Ganda24; //set bilangan setiap incongruent
			m=CHECK_FREQ();
			if (m) //ada error 3 or 2
				printf("Case #%d: Not Stroop\n",i+1);
			else {
				m=CHECK_SEQUENCE();
				if (m) //ada error 4 or 5
					printf("Case #%d: Not Stroop\n",i+1);
				else
					printf("Case #%d: Stroop\n",i+1);
			}
		}

		//PRINT OUTPUT
//*		PRINT_OUTPUT();
	} // FOR N

    return 0;
}


int CHECK_BOUNDARY(int x, int y) {
	if ((x < 1) || (x > 4) || (y < 1) || (y > 4))
		return -1;
	return 0;
}


int CHECK_FREQ() {

    for (int h=1; h<5; h++)
        for (int k=1; k<5; k++)
            if (k!=h) {
                if (table[h][k] != incongruent) return 3;
            } else
                if (table[h][k] != congruent) return 2;
    return 0;
}

int CHECK_SEQUENCE() {
    
    for (int h=0; h<j-2; h++) {
        if ((list[h][0]==list[h+1][0]) && (list[h+1][0]==list[h+2][0])) //semak 3 jujuk sekaligus utk first digit
			return 4;
        if ((list[h][1]==list[h+1][1]) & (list[h+1][1]==list[h+2][1])) //semak 3 jujuk sekaligus utk second digit
            return 5;
	}
    return 0;
}

void PRINT_OUTPUT() {
    
    //PRINT OUTPUT
	printf("STROOP 0 = Luar boundary 1-4\n");
	printf("STROOP 1 = Bukan gandaan 24\n");
	printf("STROOP 2 = Bilangan congruent tak cukup\n");
	printf("STROOP 3 = Bilangan incongruent tak cukup\n");
	printf("STROOP 4 = Bilangan semua ok, jujukan pertama tak betul\n");
	printf("STROOP 5 = Bilangan semua ok, jujukan kedua tak betul\n");
    for (int h=0; h<j; h++) {
	    printf("Data %c: %c \n",list[h][0],list[h][1]);
		    
	}
    for (int h=1; h<5; h++) {
        for (int k=1; k<5; k++)
	        printf("%d ",table[h][k]);
	    printf("\n");
	}
    
}
