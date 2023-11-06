package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();
        System.out.println("=== Test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller seller1 : list) {
            System.out.println(seller1);
        }

        System.out.println("=== Test 3: seller findByAll ===");
        list = sellerDao.findAll();
        for(Seller seller1 : list) {
            System.out.println(seller1);
        }

        System.out.println("=== Test 4: seller insert ===");

        Seller newSeller = new Seller(null, "Nicollas", "nicollas@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.print("Inserted! New Id = " + newSeller.getId());

        System.out.println("=== Test 5: seller update ===");
        seller = sellerDao.findById(7);
        seller.setName("NicollasM");
        sellerDao.update(seller);

        System.out.println("=== Test 6: seller delete ===");
        int x = sc.nextInt();
        sellerDao.deleteById(x);

        sc.close();
    }
}
