import java.util.Comparator;

class CustomComparator implements Comparator<CustomComparator> {
    private String bookName;
    private double price;
    CustomComparator(String bookName,double price){
        this.bookName=bookName;
        this.price = price;
    }
    public int compare(CustomComparator one, CustomComparator two){
        return Integer.compare((int)one.price,(int)two.price);
    }

    @Override
    public String toString() {
        return "Book Name : "+bookName+" Price : "+price;
    }

    public static void main(String[] args) {
        CustomComparator book1 = new CustomComparator("bala",2000);
        CustomComparator book2 = new CustomComparator("sala",100);
        for (CustomComparator custom : )
    }
}
