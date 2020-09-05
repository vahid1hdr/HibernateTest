package net.javaguides.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.javaguides.hibernate.entity.Student;
import net.javaguides.hibernate.util.HibernateUtil;
import org.hibernate.engine.transaction.internal.TransactionImpl;

public class App {
    public static void main(String[] args) {


        Transaction transaction = null;

        List<Transaction> transactions = new ArrayList<>();
        List<Session> sessions= new ArrayList<>();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try {
            for (int i = 0; i < 5; i++) {
                Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
                Student student1 = new Student("John", "Cena", "john@javaguides.com");

                Session session = sessionFactory.openSession();
                sessions.add(session);

                // start a transaction
                transaction = session.beginTransaction();
                transactions.add(transaction);
                // save the student objects
                session.save(student);
                session.save(student1);
            }

            for (Transaction transaction1 : transactions) {

                // commit transaction
                transaction1.commit();
            }
            for (Session session : sessions) {
                session.close();

            }

            sessionFactory.close();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

//        try {
//            List<Student> students = session.createQuery("from Student", Student.class).list();
//            students.forEach(s -> System.out.println(s.getFirstName()));
////            Scanner scanner = new Scanner(System.in);
////            String next = scanner.next();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
    }
}