import java.util.ArrayList;

public class Cashier {
    public static void main(String[] args) {
        ArrayList<ClothingItem> list = new ArrayList<ClothingItem>();



        list.add(new Shirt("Blue Cotton Shirt","BrandS",14.99,"blue","M"));
        list.add(new Shirt("White Cotton Shirt","BrandS",15.99,"white","M"));
        list.add(new Trousers("Black Cotton Trousers","BrandT",29.99,"black",50));
        list.add(new Shoe("Black Leather Shoes","BrandS",59.99,"black",43));
        list.add(new Jacket("Black Cotton Suit Jacket","BrandJ",99.99,"black",50));

//        for (ClothingItem item:list)
//        {
//            System.out.println(item.toString());
//        }

        CashRegister register = new CashRegister(list);
        System.out.println(register.toString());
    }
}
