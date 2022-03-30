public class Trousers extends Jacket{

    public Trousers(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color, size);
    }

    @Override
    public String getClothingType() {
        return "Trousers";
    }

    @Override
    public String toString() {
        return "Trousers:\n"+
                "\tName: " + this.getName()+",\n"+
                "\tBrand: " + this.getBrand()+",\n"+
                "\tPrice: " + "$"+this.getPrice()+",\n"+
                "\tSize: " + this.getSize()+",\n"+
                "\tColor: " + this.getColor()+"\n";
    }
}
