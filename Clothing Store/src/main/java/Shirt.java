import java.util.ArrayList;

public class Shirt extends ClothingItem{
    private String size;
    ArrayList<String> availableSizes;

    public Shirt()
    {
        super();
        this.initAvailableSizes();
    }

    public Shirt(String name, String brand, double price, String color,String size) {
        super(name, brand, price, color);
        this.initAvailableSizes();
        if(setSize(size)==false)
        {
            System.out.println("Unavailable size: " + size);
            System.out.println("Size not set.");
        }

    }

    public String getSize()
    {
        return this.size;
    }

    public boolean setSize(String size)
    {
        if(testAvailableSizes(size))
        {
            this.size = size;
            return true;
        }
        return false;
    }

    @Override
    public String getClothingType() {
        return "Shirt";
    }

    @Override
    public String toString()
    {
        return "Shirt:\n"+
                "\tName: " + this.getName()+",\n"+
                "\tBrand: " + this.getBrand()+",\n"+
                "\tPrice: " + "$"+this.getPrice()+",\n"+
                "\tSize: " + this.getSize()+",\n"+
                "\tColor: " + this.getColor()+"\n";
    }





    private boolean testAvailableSizes(String size)
    {
        for (String item:this.availableSizes)
        {
            if(item.equals(size))
                return true;
        }
        return false;
    }

    private void initAvailableSizes()
    {
        availableSizes = new ArrayList<String>();
        this.setAvailableSizes("XS","S","M","L","XL","2XL");
    }

    private void setAvailableSizes(String ...array)
    {
        for (String item:array)
        {
            //System.out.println(item);
            availableSizes.add(item);
        }
    }

}
