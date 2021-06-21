package com._33_date_control;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController2 {

    public static void main(String[] args) throws DatatypeConfigurationException, ParseException {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      //  Date date = format.parse("2014-04-24 11:15:00");
        Date date = format.parse("2021-05-22 07:02:18");

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);


        String FORMAT = "yyyy-MM-dd HH:mm:ss";
        DateFormat formater = new SimpleDateFormat(FORMAT);

        XMLGregorianCalendar result = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar("2021-05-22T07:02:18");
        System.out.println(result.getDay());
        System.out.println(result.getMonth());
        System.out.println(result.getYear());
        System.out.println(result.getHour());
        System.out.println(result.getMinute());
        System.out.println(result.getSecond());




    }
}
