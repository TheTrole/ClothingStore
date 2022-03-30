public abstract class ClothingItem {
    private String name;
    private String brand;
    private double price;
    private String color;
    private int discount;
    private double discountPriceDifference;

    public ClothingItem(){}

    public ClothingItem(String name, String brand, double price, String color)
    {
        this.name=name;
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.discount=0;
        this.discountPriceDifference = 0.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPriceDifference() {
        return discountPriceDifference;
    }

    public void setDiscountPriceDifference(double discountPriceDifference) {
        this.discountPriceDifference = discountPriceDifference;
    }

    public void setSize(){}

    public String getSize(){ return "";}

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiscount() {return discount;}

    public void setDiscount(int discount){ this.discount = discount; }

    public String getClothingType(){return "";}
}
