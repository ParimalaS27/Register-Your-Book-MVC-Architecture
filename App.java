public class App {
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model("Concepts of Physics", "H C Verma", "Edition 2019- Vol1-2", "Academics", 565.0, 20);
        View v = new View("Book Store MVC - CS323");
        Controller c = new Controller(m, v);
        c.initController();
    }
}