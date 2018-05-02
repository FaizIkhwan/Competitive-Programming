/*
/*
 *  Muthukkaruppan Annamalai
 *  4 October 2016
 *
 *  AlKhawarzmi Problem Connectivity Potential
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Connectivity_Potential_Sol {
    static final int ml = 40;
    public static void main(String[] args) {
        File file = new File("DataFile.txt");
        try { Scanner cin = new Scanner(file);
            int mc=cin.nextInt();
            for (int c=0; c<mc; c++) {
                int ns=cin.nextInt();
                int[][] ds = new int [ns][ns];               
                if (ns>0) 
                    for (int i=0; i<ns; i++) { String ln=cin.next();
                        for (int j=0; j<ns; j++)
                            if (ln.charAt(j)=='1') ds[i][j]=1;
                            else ds[i][j]=0; } 
                    mFl(ds);
                    int res=CPot (ds); 
                    System.out.println ("Case #"+(c+1)+": "+res); } }
        
        catch (FileNotFoundException e) {
           e.printStackTrace(); System.err.format("FILE NOT FOUND \n"); } }

    private static void mFl(int[][] am) {
        int nv=am.length;
        for (int ib=0; ib<nv; ib++) 
            for (int sc=0; sc<nv; sc++) 
                for (int tg=0; tg<nv; tg++) 
                    if (am[sc][ib]!=0 & am[ib][tg]!=0 & sc!=tg) 
                        if (am[sc][tg]==0) am[sc][tg]=am[sc][ib]+am[ib][tg];
                        else if (am[sc][tg]>1)                           
                                if (am[sc][ib]+am[ib][tg]<am[sc][tg]) am[sc][tg]=am[sc][ib]+am[ib][tg]; }
    
    private static int CPot (int[][] nw) {
        int mh=0;
        int hc=0;
        int vn=nw.length;        
        for (int i=0; i<vn; i++) 
            for (int j=0; j<vn; j++)
                if (nw[i][j]>mh) { mh=nw[i][j]; hc=1; }
                else if (nw[i][j]==mh) hc++;
        return (mh*hc); } }