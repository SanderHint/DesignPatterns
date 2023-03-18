import builder.UserBuilder;
import com.company.Game;
import com.company.abstractFactory.Car;
import com.company.abstractFactory.CarFactory;
import com.company.abstractFactory.FactoryProvider;
import com.company.adapter.*;
import com.company.exercise.Employee;
import com.company.exercise.VideoGame;
import com.company.exercise.VideoGameAdapter;
import singleton.exercises.CountEnum;
import singleton.exercises.Database;
import builder.User;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* class based eager singleton*/
        //Counter counter = Counter.getInstance();

        /* Enum based eager singleton*/
      //  CountEnum counter = CountEnum.INSTANCE;
       // System.out.println(counter.getCount());
       // counter.increment();
       // counter.increment();
        //System.out.println(counter.getCount());

      //  Database database = Database.getInstance();
      //  database.addNumber(1);
       // database.addNumber(2);
       // database.addNumber(3);
        //System.out.println(database.getNumbers().size()); // Should return 3


        //  Engine engine = Engine.getInstance();
        //engine.turnEngineOn();
        // System.out.println(engine.getEngineState());

        //Computer computer = Computer.getInstance();
        // System.out.println(computer.getComputerState());

        // Weapon ak47 = new WeaponBuilder()
        //         .withType("Gun")
        //      .withName("AK-47")
        //     .withPerks(new ArrayList<>())
        //     .withDamage(10)
        //     .withDurability(100000L)
        //    .build();

        // System.out.println(ak47.getDamage());

        // String type = "vaoo";

        // GameFactory factory;
        // if (type.equals("PC")) {
        //     factory = new HaloGameCreator();
        // } else if (type.equals("Board")) {
        //    factory = new ScrabbleGameCreator();
        // }else {
        //    throw new RuntimeException("Unkown game type");
        // }

        // Game game = factory.create();
        // System.out.println(game);

        // String type = "Lexus";
        // CarFactory factory = new FactoryProvider().createFactory(type);
        // Car sedan = factory.createSedan();

        // System.out.println(sedan);

        //Create a singleton called Students. This singleton will store a list of students as String. Implement the following functionality
        // When adding a student to the list. We should have a method to add a student to the list, and this method returns a boolean
        //(if the addition is successful, it returns true, else it returns false)
        // In order to successfully add a student the students name must be prefixed with either senior or junior.
        // Adding a duplicate name is not allowed.
        // Add a method to retrieve all students with a prefix of senior
        // Add a method to retrieve all students with a prefix of junior


        //User fred = new User("Fred", "Bradley", 12, "fredbradley@gmail.com", "+3725641616", "tallinn");

        //User barry = new UserBuilder()
        // .withFirstName("Barry")
        // .withLastName("Duval")
        // .User();

       // Game uncharted = new VideoGameAdapter(new VideoGame("Uncharted", 18, 4, 99));
      //  System.out.println(uncharted.getPegiName());
       // System.out.println(uncharted.canBePlayedRemotely());

       // Employee Sander = new Employee("Sander", "Hint", 23, "Pipedrive","5661116440", "sander@gmail.com", 4000);

       // System.out.println(Sander.getFirstName());
       // System.out.println(Sander.getLastName());
       // System.out.println(Sander.getAge());
       // System.out.println(Sander.getNameOfEmployer());
        //System.out.println(Sander.getPhoneNumber());
       // System.out.println(Sander.getEmail());
       // System.out.println(Sander.getSalary());


        //Rectangle shape = new SquareAdapter(new Square(4));

        //System.out.println(shape.getWidth());
       // System.out.println(shape.getArea());
    }
}