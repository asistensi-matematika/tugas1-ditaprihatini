/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ditaprihatini_tugas1.solution;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class DitaPrihatini_tugas1Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input  : ");
        Scanner DITA = new Scanner(System.in);
        double a = DITA.nextDouble();
        double b = DITA.nextDouble();
        double c = DITA.nextDouble();
        System.out.println("Output : ");
        
        //Membuat Persamaan Polinomial
        if(a==0){
            System.out.println("Nilai a tidak boleh nol");     
        }else{
        String x = "x";
        if(b>0&&c>0)
            System.out.println("Persamaan POlinomial "+a+x+"^2 + "+b+x+" + "+c+" memiliki");
        else if(b<0&&c<0)
            System.out.println("Persamaan Polinomial "+a+x+"^2 - "+(-b)+x+" - "+(-c)+" memiliki");
        else if(b<0&&c>0)
            System.out.println("Persamaan Polinomial "+a+x+"^2  - "+(-b)+x+" + "+c+" memiliki");
        else if(b>0&&c<0)
            System.out.println("Persamaan Polinomial "+a+x+"^2 + "+b+x+" - "+(-c)+" memiliki");
        else if (b==0 && c<0)
            System.out.println("Persamaan Polinomial "+a+x+"^2 + "+b+x+" - "+(-c)+" memiliki");
        else if (b==0 && c>0)
            System.out.println("Persamaan Polinomial "+a+x+"^2 + "+b+x+" + "+(c)+" memiliki");
        else if (c==0 && b<0)
            System.out.println("Persamaan Polinomial "+a+x+"^2 - "+(-b)+x+" + "+c+" memiliki");
        else if (c==0 && b>0)
            System.out.println("Persamaan Polinomial "+a+x+"^2 + "+b+x+" + "+(c)+" memiliki");
            
        //Formula Soal Pertama
        double D = Math.pow(b,2)-4*a*c;
        
        //Penyelesaian Soal Pertama
        System.out.println("1. Diskriminan          = "+D);
        
        //Formula dan Penyelesaian Soal Kedua
        double AkarA,AkarB,AkarC,AkarE,AkarF,AkarG;
        
        if(b==0){
            if(D==0){
                System.out.println("2. Akar-akar polinomial = 0");
            }else if(D>0){
                AkarA = (Math.sqrt(D)/(2*a));
                AkarB = -(Math.sqrt(D)/(2*a));
                System.out.println("2. Akar-akar polinomial = "+AkarA+" dan "+AkarB);
            }else if(D<0){
                AkarA = (Math.sqrt(-D)/(2*a));
                AkarB = -(Math.sqrt(-D)/(2*a));
                System.out.println("2. Akar-akar polinomial = "+AkarA+"i dan "+AkarB+"i");
            }
                }else{
                if(D==0){
                    AkarC = (-(b)/(2*a));
                    System.out.println("2. Akar-akar polinomial = "+AkarC);
                }else if(D>0){
                    AkarF = -((b+(Math.sqrt(D)))/(2*a));
                    AkarG = -((b-(Math.sqrt(D)))/(2*a));
                    System.out.println("2. Akar-akar polinomial = "+AkarF+" dan "+AkarG);
                }else if(D<0){
                    AkarE = ((Math.sqrt(-D))/(2*a));
                    System.out.println("2. Akar-akar polinomial = "+(-(b)/(2*a))+" + "+AkarE+"i dan "+(-(b)/(2*a))+" - "+AkarE+"i");
                }
            }
            
        //Formula dan Penyelesaian Soal Ketiga
        double absis,ordinat;
        absis = -(b/(2*a));
        ordinat = -(D/(4*a));
        
        if(b==0){
            System.out.println("3. Titik Stasioner      = (0,"+ordinat+")");
        }else if(D==0){
            System.out.println("3. Titik Stasioner      = ("+absis+",0)");
        }else if(b==0&D==0){
            System.out.println("3. Titik Stasioner      = (0,0)");
        }else{
            System.out.println("3. Titik Stasioner      = ("+absis+","+ordinat+")");
        }
            
        //Formula dan Penyelesaian Soal Keempat
        if(a>0){
            String ATAS = "4. Kecekungan kurva     = Atas";
            System.out.println(ATAS);
        }else if(a<0){
            String BAWAH = "4. Kecekungan kurva     = Bawah";
            System.out.println(BAWAH);
        }
        
        //Formula  dan Penyelesaian Soal Kelima
        if(a>0&&D==0){
            String nol = "5. Nilai minimum lokal  = 0";
            System.out.println(nol);
        }else if(a>0&&D!=0){
            System.out.println("5. Nilai minimum lokal  = "+ordinat);
        }else{
            System.out.println("5. Nilai maksimum lokal  = "+ordinat);
            }
        }
    }  
}
