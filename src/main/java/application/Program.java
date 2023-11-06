package application;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.print(department);

        Seller seller = new Seller(1, "Nicollas","nicollas@gmail.com", new Date(), 3000.0, department);
        System.out.print(seller);
    }
}
