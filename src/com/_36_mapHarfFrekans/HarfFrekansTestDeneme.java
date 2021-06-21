package com._36_mapHarfFrekans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HarfFrekansTestDeneme {
    public static void main(String[] args) {

        HarfFrekansUtil harfFrekansUtil = new HarfFrekansUtil();
        List<String> harflerData = harfFrekansUtil.harfler();
        Map<String, Integer> map = new HashMap<>();
        int toplam = 0;

        for (int i=0; i<harflerData.size(); i++) {
            for (int j=0; j<harflerData.size();j++)
            {
                if(harflerData.get(i) == harflerData.get(j))
                {
                    toplam = toplam+1;
                }

            }
            map.put(harflerData.get(i), toplam);
            toplam = 0;
        }

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {

            Object o = it.next();
            Object value = map.get(o);

            System.out.println("Key = " + o + "->" + "Value = " + value);
        }
    }

}
