import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Model {
    private String BName;
    private String Author;
    private String Edition;
    private String Category;
    private double Price;
    private int Stock_qty;

    public Model(String BName, String Author, String Edition, String Category, double Price, int Stock_qty) {
        this.BName = BName;
        this.Author = Author;
        this.Edition = Edition;
        this.Category = Category;
        this.Price = Price;
        this.Stock_qty = Stock_qty;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public int getStock_qty() {
        return Stock_qty;
    }

    public void setStock_qty(int Stock_qty) {
        this.Stock_qty = Stock_qty;
    }

    public int actionPerformed(String BName, String Author, String Edition, String Category, double Price,
            int Stock_qty) {
        int code = 1;
        String Name = BName;
        String A = Author;
        String Editn = Edition;
        String Cat = Category;
        double P = Price;
        int qty = Stock_qty;
        String ecc = "peace";

        if (qty <= 0) {
            code = 0;
            ecc = "Invalid Stock_quantity";
            return code;
        }
        
        if (P <= 0.0) {
            code = 0;
            ecc = "Invalid Price";
            return code;
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ps", "root",
                    "P@rimala9");
            System.out.println('1');
            String query = "INSERT INTO Book(BName, Author, Editn, Category, Price, Stock_qty)" +  "values(?,?,?,?,?,?)";
            System.out.println('2');
            
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            System.out.println('3');
            
            preparedStmt.setString(1, Name);
            preparedStmt.setString(2, A);
            preparedStmt.setString(3, Editn);
            preparedStmt.setString(4, Cat);
            preparedStmt.setDouble(5, P);
            preparedStmt.setInt(6, qty);
            System.out.println('4');
            
            // execute the preparedstatement

            int x = preparedStmt.executeUpdate();
            System.out.println(x);
            

            connection.close();
            
            
            if (x == 0) {
                code = 0;
                ecc = "Already exists";
                return code;
            } else {
                code = 1;
            }
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(ecc);
        return code;
    }

}