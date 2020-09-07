package net.javaguides.hibernate;

import net.javaguides.hibernate.entity.Employee;
import net.javaguides.hibernate.entity.Person;
import net.javaguides.hibernate.entity.Student;
import net.javaguides.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {


        Transaction transaction = null;

        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory()) {

            Person person1 = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
            Person person2 = new Employee("John", "Cena", "john@javaguides.com");

            Session session = sessionFactory.getCurrentSession();

            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(person1);
            session.save(person2);
            transaction.commit();

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