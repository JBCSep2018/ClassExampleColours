package me.afua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        String addPerson="";
        do{
                Person thePerson = new Person();

                Scanner input = new Scanner(System.in);
                System.out.println("Enter your name");
                String myName = input.nextLine();
                thePerson.setName(myName);

                System.out.println("Enter your email address");
                String email = input.nextLine();
                thePerson.setEmail(email);

                System.out.println("Enter your favourite colour");
                String colour = input.nextLine();
                thePerson.setFavouriteColour(colour);

                System.out.printf("Your name is %s, your e-mail address %s is your favourite colour is %s\n",thePerson.getName(),thePerson.getEmail(),thePerson.getFavouriteColour());

                    System.out.println("Do you want to add another person?");
                    addPerson = input.nextLine();

                persons.add(thePerson);


        }while(addPerson.equalsIgnoreCase("yes"));

        for(Person item:persons)
        {
            System.out.println(item.getName()+" "+item.getEmail()+" "+item.getFavouriteColour());
        }


    }
}
