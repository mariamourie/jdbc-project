package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department insert ===");
		Department department = new Department(null, "Cosmetics");
		departmentDao.insert(department);
		System.out.println("Inserted! New Id = " + department.getId());
		
		sc.close();

	}

}
