package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Department obj =  new Department(1, "Books");
//		
//		System.out.println(obj);
//		
//		Seller seller = new Seller(1, "Jose", "j@email.com", new Date(), 3000.0, obj);
//		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
//		
		System.out.println("=== TESTE 1: department findById ====");
		Department dep= depDao.findById(3);
		System.out.println(dep);

		
		System.out.println("\n=== TESTE 2: department findAll====");
		
		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TESTE 3: department insert====");
		dep = new Department(null, "RH");

		depDao.insert(dep);
		
		System.out.println("Inserido! Novo id: " + dep.getId());
		
		
		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = depDao.findById(6);
		dep2.setName("Food");
		depDao.update(dep2);
		System.out.println("Update completed");
		
		
		System.out.println("\n=== TESTE 5: department delete====");
		System.out.println("Entre com id: ");
		int id = sc.nextInt();
		
		depDao.deleteById(id);
		
		System.out.println("Deletado! ");
		sc.close();
		
	}
}
