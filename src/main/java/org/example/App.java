package org.example;

import java.util.List;
import org.example.joinedTable.Chair;
import org.example.joinedTable.DinnerTable;
import org.example.mappedSuperClass.EarMonster;
import org.example.mappedSuperClass.EyeMonster;
import org.example.singleTable.Animal;
import org.example.singleTable.Cat;
import org.example.singleTable.Snake;
import org.example.tablePerClass.Doll;
import org.example.tablePerClass.Lego;
import org.example.tablePerClass.Toy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class App {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory()) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

// ---------------MappedSuperclass examples----------------

//            EyeMonster mike = new EyeMonster();
//            mike.setAge(12);
//            mike.setName("Mike");
//            mike.setCountOfEyes(1);
//
//            EyeMonster nik = new EyeMonster();
//            nik.setAge(11);
//            nik.setName("Nik");
//            nik.setCountOfEyes(3);
//
//            EarMonster a = new EarMonster();
//            a.setAge(1);
//            a.setName("A");
//            a.setCountOfEars(3);
//
//            session.persist(mike);
//            session.persist(nik);
//            session.persist(a);
//
//            Query<EyeMonster> query = session.createQuery("from EyeMonster ");
//            List<EyeMonster> eyeMonsterList = query.getResultList();
//            for (EyeMonster e : eyeMonsterList) {
//                System.out.println(e);
//            }
//
//
// ---------------SingleTable examples----------------
//
//            Animal animal=new Animal();
//            animal.setName("new animal");
//
//            Cat cat=new Cat();
//            cat.setName("Barsik");
//            cat.setNameOfOwner("Tom");
//            cat.setAge(2);
//
//            Snake snake=new Snake();
//            snake.setName("Zmeya");
//            snake.setAge(5);
//            snake.setLength(12);
//
//            session.persist(animal);
//            session.persist(cat);
//            session.persist(snake);
//
// ---------------Joined table examples----------------

//            Chair chair=new Chair();
//            chair.setTypeOfChair("cotton");
//            chair.setName("king");
//
//            DinnerTable dinnerTable=new DinnerTable();
//            dinnerTable.setName("Ludovik");
//            dinnerTable.setCountOfLegs(6);
//
//            session.persist(chair);
//            session.persist(dinnerTable);
// ---------------TablePerClass examples----------------

            Toy toy=new Toy();
            toy.setName("new Toy");

            Doll doll=new Doll();
            doll.setName("Barbara");
            doll.setType("Barbie");

            Lego lego=new Lego();
            lego.setName("mind");
            lego.setCountOfDetails(56);

            session.persist(toy);
            session.persist(doll);
            session.persist(lego);
//
//
            transaction.commit();
        }
    }
}
