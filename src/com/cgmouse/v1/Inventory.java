package com.cgmouse.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
            String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    // LẤY RA CÁI CÂY ĐÀN GUITAR TỪ DANH SÁCH THEO CÁI TIÊU CHÍ LÀ SỐ SERI
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar getGuitarBasic(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    /*
        Guitar searchGuitar: do khách hàng nhập vào
    */                          //"fender"
    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            
                //builder: "Collings"
            Guitar guitar = (Guitar) i.next();//1 GUITAR TỪ KHO
            String builder = searchGuitar.getBuilder().toLowerCase();//BUILDER TỪ KH NHẬP VÀO
            //NULLL                    ""                        
                  //true                     true                  true      //"finder"           "//Collings"
           if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder().toLowerCase())))//true
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel())))
                continue;
            String type = searchGuitar.getType();
            if ((type != null) && (!searchGuitar.equals("")) && (!type.equals(guitar.getType())))
                continue;
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
                continue;
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
                continue;
            return guitar;
        }
        return null;
    }

}
