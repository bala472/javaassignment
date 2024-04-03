public abstract class ProductAbstract {
    String name;
    double price;
    String discription;
    ProductAbstract(String name,double price){
        this.name=name;
        this.price=price;
    }
    abstract String getDiscription();
    abstract double getPrice();
    public void printProductDetails(){
        System.out.println("Product name : "+name);
        System.out.println("Product price : "+getPrice());
        System.out.println("Product description : "+getDiscription());
    }
}
class ElectronicProduct extends ProductAbstract{
    ElectronicProduct(String name , double price){
        super(name, price);
    }

    @Override
    String getDiscription() {
        return "It is electronic product";
    }

    @Override
    double getPrice() {
        return price;
    }

}
class ClothingProduct extends ProductAbstract{
    ClothingProduct(String name , double price){
        super(name, price);
    }

    @Override
    String getDiscription() {
        return "It is clothing product";
    }

    @Override
    double getPrice() {
        return price;
    }

}
class BookProduct extends ProductAbstract{
    BookProduct(String name , double price){
        super(name, price);
    }

    @Override
    String getDiscription() {
        return "It is book product";
    }

    @Override
    double getPrice() {
        return price;
    }

}
class PrintProduct{
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("Fybros switch",300);
        ClothingProduct clothingProduct = new ClothingProduct("Roadstar shirt ",720);
        BookProduct bookProduct = new BookProduct("The Alchemist ",250);
        electronicProduct.printProductDetails();
        clothingProduct.printProductDetails();
        bookProduct.printProductDetails();

    }
}
