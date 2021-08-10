package com.cgmouse.v1;

public class GuitarTestDrive {

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();

        //GIẢ SỬ KHÁCH HÀNG NHẬP
        Guitar searchGuitar = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");

        //TÌM
        Guitar guitar = inventory.search(searchGuitar);

        if(guitar !=null){
            System.out.println("Đàn tìm được là: " +
            guitar.getBuilder() + " " + guitar.getModel()+ " " +
            guitar.getType() + " guitar: \n" +
            guitar.getBackWood() + "phía sau \n  " +
            guitar.getTopWood() + "phía trên. \n Bạn có thể sở hữu nó chỉ với giá $" +
            guitar.getPrice() + "!"); 
        }else{
            System.out.println("Xin lỗi bạn, không tìm được cây đàn nào cho bạn cả");
        }


    }

    private static void khoiTaoInventory(Inventory inventory){

        inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic", "Indian RoseWood", "Sitka");
    }
    
}
