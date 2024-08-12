package com.juani.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.juani.exercises.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {
        System.out.println("sumeven");
        sumEven();

        System.out.println("optionaltest");
        optionalTest(Optional.of("value"));
        optionalTest(Optional.empty());

        System.out.println("findmax");
        findMax();

        System.out.println("Interface Test");
        InterfacesTest interfaceTest = new InterfacesTest();
        interfaceTest.print();
        interfaceTest.show();

        System.out.println("hibernate test");
        testHibernate();
    }

    public static void testHibernate(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        configuration.addAnnotatedClass(com.juani.exercises.entities.Customer.class);
        configuration.addAnnotatedClass(com.juani.exercises.entities.Order.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Customer customer = new Customer();
        customer.setName("John Doe");

        session.persist(customer);
        Query<Customer> query = session.createQuery("from Customer", Customer.class);
        List<Customer> customers = query.list();

        for (Customer c : customers) {
            System.out.println("Customer ID: " + c.getId());
            System.out.println("Customer Name: " + c.getName());
        }

        session.getTransaction().commit();

        session.close();
    }

    public static void sumEven(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }

    public static void optionalTest(Optional<String> value) {
        System.out.println(value.orElse("Default Value"));
    }

    public static void findMax() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int maxNumber = numbers.stream()
                .max(Integer::compare)
                .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Maximum number: " + maxNumber);
    }
}