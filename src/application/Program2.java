package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Department> list;
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department insert ===");
		Department newDepartment = new Department(null, "Home");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST 3: department findAll ===");
		list = departmentDao.findAll();
		for (Department dep: list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 4: department update ===");
		department = departmentDao.findById(1);
		department.setName("Beauty");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n === TEST 5: department deleteById ===");
		System.out.print("Enter id for delete department: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted!");
		
		sc.close();

	}

}
