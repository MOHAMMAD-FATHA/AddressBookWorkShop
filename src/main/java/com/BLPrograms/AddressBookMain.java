package com.BLPrograms;

import java.util.Scanner;

public class AddressBookMain {

    /*
     * @author - Mohammad Fatha
     * Purpose to add the details of the person using collection
     */

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

                Person contactDetails = new Person();
                System.out.print("Enter First Name : ");
                String firstName = sc.next();
                contactDetails.setFirstName(firstName);

                System.out.print("Enter Last Name : ");
                contactDetails.setLastName(sc.next());

                System.out.print("Enter Address : ");
                contactDetails.setAddress(sc.next());

                System.out.print("Enter City : ");
                contactDetails.setCity(sc.next());

                System.out.print("Enter State : ");
                contactDetails.setState(sc.next());

                System.out.print("Enter ZipCode : ");
                contactDetails.setZipCode(sc.nextInt());

                System.out.print("Enter Phone-Number : ");
                contactDetails.setPhoneNumber(sc.nextLong());

                System.out.print("Enter Email-Id : ");
                contactDetails.setEmailId(sc.next());
          
        }
}
