package Day2;

public class Product {

    private String name;
    private String type;
    private String place;
    private int warrantyYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public Product(String name, String type, String place, int warrantyYear) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warrantyYear = warrantyYear;
    }

    @Override
    public String toString() {
        return "Product = (" + name +", " + type +", "+ place +", "+ warrantyYear +")";
    }
}
