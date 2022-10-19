<<<<<<< HEAD
public class Fiction extends Book {
=======
class Fiction extends Book {
    // write your code here
>>>>>>> origin/kubilay-cakmak

    public Fiction(String title) {
        super(title);
    }

<<<<<<< HEAD
    public double setPrice(double price) {
        return 24.99;
    }
=======
    @Override
    public double setPrice(double price) {
        return 24.99;
    }

>>>>>>> origin/kubilay-cakmak
}