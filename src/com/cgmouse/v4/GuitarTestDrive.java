package com.cgmouse.v4;

import java.util.Iterator;
import java.util.List;

public class GuitarTestDrive {

        public static void main(String[] args) {

                Inventory inventory = new Inventory();

                khoiTaoInventory(inventory);

                // GIẢ SỬ KHÁCH HÀNG NHẬP
                GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                                Wood.ALDER);
                // NGƯỜI DÙNG
                // TÌM
                Iterator<Guitar> matchingGuitars = inventory.search(guitarSpec);
                if (matchingGuitars != null) {
                        for (; matchingGuitars.hasNext();) {
                                Guitar guitar = (Guitar) matchingGuitars.next();
                                GuitarSpec spec = guitar.getSpec();
                                System.out.println("Chúng ta có: " + spec.getBuilder() + " " + spec.getModel() + " "
                                                + spec.getType() + " guitar: \n" + spec.getBackWood()
                                                + "  phía sau \n  " + spec.getTopWood()
                                                + "  phía trên. \n Bạn có thể sở hữu nó chỉ với giá $"
                                                + guitar.getPrice() + "!");
                        }
                }
                else {
                        System.out.println("Xin lỗi bạn, không tìm được cây đàn nào cho bạn cả");
                }

        }

        private static void khoiTaoInventory(Inventory inventory) {

                inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD,
                                Wood.SITKA);
                inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                                Wood.ALDER);
                inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                                Wood.ALDER);
                inventory.addGuitar("122784", 5495.95, Builder.MARTIN, "D-18", Type.ACOUSTIC, Wood.MAHOGANY,
                                Wood.ADIRONDACK);
                inventory.addGuitar("76531", 6295.95, Builder.MARTIN, "OM-28", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
                                Wood.ADIRONDACK);
                inventory.addGuitar("70108276", 2295.95, Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY,
                                Wood.MAHOGANY);
                inventory.addGuitar("82765501", 1890.95, Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, Wood.MAHOGANY,
                                Wood.MAHOGANY);
                inventory.addGuitar("77023", 6275.95, Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
                                Wood.ADIRONDACK);
                inventory.addGuitar("1092", 12995.95, Builder.OLSON, "SJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD,
                                Wood.CEDAR);
                inventory.addGuitar("566-62", 8999.95, Builder.RYAN, "Cathedral", Type.ACOUSTIC, Wood.COCOBOLO,
                                Wood.CEDAR);
                inventory.addGuitar("6 29584", 2100.95, Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC,
                                Wood.MAHOGANY, Wood.MAPLE);
        }

}
