public class BusinessAsset {
    private String name;
    private double price;


    public BusinessAsset(String newName, double newPrice){
        name = newName;
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }
}
