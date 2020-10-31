/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan20_TargetSaldoTabungan;

import java.text.NumberFormat;

/**
 *
 * @author sweenutt
 * 
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Target Saldo Tabungan
 */
public class PBO_IF2_10116414_TargetSaldoTabungan {
    public static void main(String[] args) {
        
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMinimumIntegerDigits(0);
            numberFormat.setGroupingUsed(true);
                     
            int tahun = 1;
            double saldo,sukubunga;
             
            saldo = 3500000;
            sukubunga = 0.08;                                         
        do
        {
            saldo = saldo + (saldo * sukubunga); 
            System.out.println("Saldo di bulan ke-"+tahun+ " Rp."+ numberFormat.format(saldo));          
            tahun++;
            
        }while(tahun<=8);
    }
}



            /*
            DecimalFormat desimalformat = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols desimalformatsimbol = new DecimalFormatSymbols();
            desimalformatsimbol.setCurrencySymbol("");
            desimalformatsimbol.setMonetaryDecimalSeparator(',');
            desimalformatsimbol.setGroupingSeparator('.');
            desimalformat.setDecimalFormatSymbols(desimalformatsimbol);      
            */     
