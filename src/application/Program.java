package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> listProd = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int number = sc.nextInt();
		
		
		for (int i = 0; i < number; i++) {
			System.out.println("Product #"+(i)+" data: ");
			System.out.println("Commom, used or imported? (c/u/i)?");
			char option = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			if (option == 'i') {
				System.out.println("Customs fee: ");
				Double fees = sc.nextDouble();
				listProd.add( new ImportedProduct(name, price, fees));
				
			}
			
			else if (option == 'c') {
				listProd.add(new Product(name, price));
			}
			
			else if (option == 'u') {
				System.out.println("Manufacture date: ");
				String date = sc.next();
				
				listProd.add(new UsedProduct(name, price, sdf.parse(date))); 
				
			}
			
			
		}
		
		for (Product prod : listProd) {
			System.out.println(prod.priceTag());
		}
		
		
		
	}
}
