
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;


public class CashRegister {
    ArrayList<ClothingItem> cart;

    public CashRegister(ArrayList<ClothingItem> cart )
    {
        this.cart = cart;
        this.setDiscounts();
        this.setDiscountDifference();
    }

    public void setDiscounts()
    {

        Calendar cal = Calendar.getInstance();
        boolean tueDiscount= cal.get(Calendar.DAY_OF_WEEK)==3;//Starts from Sunday so 3 = Tuesday
        boolean threeItemDiscount = cart.size()>=3;

        //System.out.println("Tuesday discount: "+tueDiscount+" Three Item Discount: "+threeItemDiscount);
        
        int discount;
        for (ClothingItem item : cart) {
            discount=0;

            if(tueDiscount && item.getClothingType().equals("Shirt"))
                discount=10;
            if(threeItemDiscount)
                discount=20;
            if(tueDiscount && item.getClothingType().equals("Shoes"))
                discount=25;

            item.setDiscount(discount);
        }
    }

    public void setDiscountDifference()
    {
        double priceDifference;
        for (ClothingItem item: cart) {
            priceDifference = Utils.round(item.getPrice() * ((0.0+item.getDiscount())/100),2);
            item.setDiscountPriceDifference(priceDifference);

        }
    }

    private double getSubtotal()
    {
        double total =0.0;

        for (ClothingItem item: cart) {
            total += item.getPrice();
        }

        return total;
    }

    private double getCartDiscount()
    {
        double total =0.0;

        for (ClothingItem item: cart) {
            total += item.getDiscountPriceDifference();
        }

        return total;
    }

    private double getTotal()
    {
        double subtotal = getSubtotal();
        double discount = getCartDiscount();
        return subtotal-discount;
    }

    @Override
    public String toString() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = dateTime.format(formatter);

        String print="Date: "+formattedDate+"\n";
        print+="---Products---\n\n";

        for (ClothingItem item : cart) {
            print += item.getName()+" - "+item.getBrand()+"\n";
            print += "$"+item.getPrice()+"\n";
            if(item.getDiscount()>0)
                print += "#discount "+item.getDiscount()+"% -$"+item.getDiscountPriceDifference()+"\n\n";
        }
        print +="--------------------------------------------\n\n";
        print +="SUBTOTAL: $"+this.getSubtotal()+"\n";
        print +="DISCOUNT: -$"+this.getCartDiscount()+"\n";
        print +="TOTAL: $"+this.getTotal()+"\n\n";

        return print;
    }


}
