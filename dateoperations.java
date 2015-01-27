/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newlibrary;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Sandeep
 */
public class dateoperations {
    
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit)
    {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }
     public static Date converttodate(String string) throws ParseException
    {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(string);
            System.out.println(date);
            return(date);
            
       }
     public static String converttostring(Date date)
     {
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	   
           String d=dateFormat.format(date);
	   return(d);
     }
     /*
     
     how to implement
            String d1,d2;
            d2="05-31-2014";
            d1="04-19-2014";
            Date date1,date2;
            date1=converttodate(d1);
            date2=converttodate(d2);
            
             i have directly tuk diff here
            long diffInMillies = date2.getTime()- date1.getTime();
             int no_of_days=(int)TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);*/
    
}
