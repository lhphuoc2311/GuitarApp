package com.cgmouse.v4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
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
        List
    */                          //"fender"
    public Iterator<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            
            Guitar guitar = (Guitar) i.next();//1 GUITAR TỪ KHO
            if(guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        
        return matchingGuitars.iterator();
    }

   

}
