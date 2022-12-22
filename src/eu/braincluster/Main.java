package eu.braincluster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{

    private static void printPersons(List<Person> persons)
    {
        System.out.println("The elements of the list:");

        for (var person : persons)
        {
            System.out.println(person);
        }

        System.out.println("The list has " + persons.size() + " elements.");
    }

    private static void example1()
    {
        System.out.println("ArrayList Example 1");

        var persons = new ArrayList<Person>();

        System.out.println("The list is empty: " + persons.isEmpty());

        System.out.println("Adding new elements...");

        persons.add(new Person("John", "Smith"));
        persons.add(new Person("James", "Smith"));

        System.out.println("The list is empty: " + persons.isEmpty());

        System.out.println("Number of elements: " + persons.size());

        printPersons(persons);

        System.out.println("Deleting elements...");
        persons.clear();
        System.out.println("The list is empty: " + persons.isEmpty());
    }

    private static void example2()
    {
        System.out.println("ArrayList Example 2");

        var persons1 = new ArrayList<Person>();

        persons1.add(new Person("John", "Smith"));
        persons1.add(new Person("James", "Smith"));

        var persons2 = new ArrayList<>(persons1);

        printPersons(persons2);
    }

    private static void example3()
    {
        System.out.println("ArrayList Example 3");

        var persons = new ArrayList<Person>()
        {{
            add(new Person("John", "Smith"));
            add(new Person("Alexander", "Rose"));
        }};

        printPersons(persons);
    }

    private static void example4()
    {
        System.out.println("ArrayList Example 4");

        var persons =
                List.of(
                        new Person("Mathias", "Jacob"),
                        new Person("Pat", "Garrett")
                );

        System.out.println("The type of the list is " + persons.getClass().getName());
        printPersons(persons);
    }

    private static void example5()
    {
        System.out.println("ArrayList Example 5");

        var persons =
                Arrays.asList(
                        new Person("Travis", "Daye"),
                        new Person("Nigel", "Levins"),
                        new Person("Tse", "Sakamoto")
                );

        System.out.println("The type of the list is " + persons.getClass().getName());
        printPersons(persons);
    }

    private static void example6()
    {
        System.out.println("ArrayList Example 6");

        var persons = new ArrayList<Person>()
        {{
            add(new Person("Travis", "Daye"));
            add(new Person("Nigel", "Levins"));
            add(new Person("Tse", "Sakamoto"));
        }};

        printPersons(persons);

        persons.remove(1);

        System.out.println("After removing Nigel Levins:");

        printPersons(persons);
    }

    public static void main(String[] args)
    {
        System.out.println("ArrayList test program");

        example1();
        System.out.println();

        example2();
        System.out.println();

        example3();
        System.out.println();

        example4();
        System.out.println();

        example5();
        System.out.println();

        example6();
        System.out.println();
    }
}
