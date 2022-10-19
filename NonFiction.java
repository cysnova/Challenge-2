<<<<<<< HEAD
public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);

    }
    public void setPrice() {
        price 37.99;
    }
}
=======
class NonFiction extends Book{
    // write your code here

    public NonFiction(String title) {
        super(title);
    }

    @Override
    public double setPrice(double price) {
        return 37.99;
    }

}
>>>>>>> origin/kubilay-cakmak
