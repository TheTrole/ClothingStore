public class Jacket extends ClothingItem{
    private int size;
    private int maxSize;
    private int minSize;

    public Jacket()
    {
        super();
    }

    public Jacket(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        this.setSizeSpan();
        this.size = size;
    }

    public String getSize()
    {
        return ""+size;
    }

    public void setSize(int size)
    {
        if(testSizeParameters(size))
            System.out.println("Size "+size+" not available");
        else
            this.size=size;
    }

    private void setSizeSpan()
    {
        this.maxSize=66;
        this.minSize=42;
    }

    private boolean testSizeParameters(int size)
    {
        return ((size > maxSize || size < minSize) && size%2==1);
    }

    @Override
    public String getClothingType() {
        return "Jacket";
    }

    @Override
    public String toString() {
        return "Jacket:\n"+
                "\tName: " + this.getName()+",\n"+
                "\tBrand: " + this.getBrand()+",\n"+
                "\tPrice: " + "$"+this.getPrice()+",\n"+
                "\tSize: " + this.getSize()+",\n"+
                "\tColor: " + this.getColor()+"\n";
    }
}
