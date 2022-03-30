public class Shoe extends ClothingItem{

    int size;
    int minSize;
    int maxSize;

    public Shoe()
    {
        super();
        this.setSizeSpan();
    }

    public Shoe(String name, String brand, double price, String color,int size)
    {
        super(name, brand, price, color);
        this.setSizeSpan();
        this.setSize(size);
    }


    public String getSize()
    {
        return ""+this.size;
    }

    public void setSize(int size)
    {
        if(size > maxSize || size < minSize)
            System.out.println("Size "+size+" not available");
        else
            this.size=size;
    }

    private void setSizeSpan()
    {
        minSize=39;
        maxSize=46;
    }

    @Override
    public String getClothingType() {
        return "Shoes";
    }

    @Override
    public String toString()
    {
        return "Shoes:\n"+
                "\tName: " + this.getName()+",\n"+
                "\tBrand: " + this.getBrand()+",\n"+
                "\tPrice: " + "$"+this.getPrice()+",\n"+
                "\tSize: " + this.getSize()+",\n"+
                "\tColor: " + this.getColor()+"\n";
    }
}
