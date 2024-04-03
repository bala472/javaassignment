public abstract class ProductAbstract {
    String name;
    double price;
    String discription;
    ProductAbstract(String name,double price,String discription){
        this.name=name;
        this.price=price;
        this.discription=discription;
    }
    abstract String getDiscription();
    abstract double getprice();
}
class ElectronicProduct extends ProductAbstract{
    ElectronicProduct(String name , double price,String discription){
        super(name, price, discription);
    }

    @Override
    String getDiscription() {
        return discription;
    }

    @Override
    double getprice() {
        return price;
    }

}
