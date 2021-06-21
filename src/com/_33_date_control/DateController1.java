package com._33_date_control;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class DateController1 {

    public static void main(String[] args) throws DatatypeConfigurationException {

        XMLGregorianCalendar xcal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar("2021-05-22T07:02:18+03:00");
        if (isValid(xcal.toString()))
        {
            System.out.println("Geçerli tarih formatıdır");
        }

        else {
            System.out.println("Geçerli tarih formatı degildir");
        }

    }

    // private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+");


    public static boolean isValid(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.FRANCE);
        sdf.setTimeZone(TimeZone.getTimeZone("GTC"));
        System.out.println(sdf.getTimeZone());
        boolean valid = false;
        try {
            sdf.parse(date);
            valid = true;

        } catch (Exception e) {
            valid = false;
        }
        return valid;
    }
}
