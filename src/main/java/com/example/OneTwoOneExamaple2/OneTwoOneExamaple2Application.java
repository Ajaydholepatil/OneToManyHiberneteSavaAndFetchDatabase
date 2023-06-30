package com.example.OneTwoOneExamaple2;

import com.example.OneTwoOneExamaple2.Domain.Bank;
import com.example.OneTwoOneExamaple2.Domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneTwoOneExamaple2Application {

	public static class OneToOneExample {
		public static void main(String[] args) {

			StandardServiceRegistry ssrrr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(ssrrr).getMetadataBuilder().build();

			SessionFactory factory = metadata.getSessionFactoryBuilder().build();
			Session session = factory.openSession();

			Transaction txs = session.beginTransaction();

			Bank bank = new Bank();


			bank.setAcctNo("43456773");
			bank.setIFSC("BKDI128749");
			bank.setName("Bank of India");

			Customer customer = new Customer();

			customer.setCustomerName("Ajay");
			customer.setAddress("Pune");
			customer.setLocation("Maharashtra");

			bank.setBank(bank);
			customer.setCustomer(customer);

			session.persist(customer);
			txs.commit();

			session.close();
			System.out.println("All ok.Successfully done");


		}
	}