package com.BLPrograms;

import java.util.Scanner;

<<<<<<< HEAD
public class AddressBookMain {

    /*
     * @author - Mohammad Fatha
     * Purpose to create contacts in address book
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
=======
public class AddressBookMain
{
    Scanner scanner;

    public AddressBookMain()
    {
        scanner = new Scanner(System.in);
    }

    public void chooseOption()
    {
        AddressBookService addressBookService = new AddressBookService();
        boolean isExit = false;
        while (!isExit)
        {
            System.out.print("""
                    Enter Number As Per Your Choice:
                    1.Add-New Contacts:
                    2.Display-All Records:
                    3.Edit Contact:
                    4.Delete Contact:
                    5.Search Person In city Or State:
                    6.Get Number Of Contacts In City Or State:
                    7.Sort And Display Contact:
                    8.Sort By Zip-Code:
                    9.Read Data From File:
                    10.Write To CSVFile:
                    11.Read From CSVFile:
                    12.Write TO JSONFile:
                    13.Read From JSONFile:
                    14.Exit:
                    """);
            int userInput = scanner.nextInt();
            switch (userInput)
            {
                case 1:
                    //add new contact.
                    addressBookService.addNewContact();
                    //write data to file.
                    addressBookService.writeToFile();
                    break;
                case 2:
                    //display all contact.
                    addressBookService.displayContacts();
                    break;
                case 3:
                    //edit existing contact.
                    addressBookService.editFullContact();
                    break;
                case 4:
                    //delete existing contact.
                    addressBookService.deleteContact();
                    break;
                case 5:
                    //search person by city or state.
                    addressBookService.searchPersonInACityOrState();
                    break;
                case 6:
                    //get number contact in a city or state.
                    addressBookService.getNumberOfContacts();
                    break;
                case 7:
                    //sorting contact using first name.
                    addressBookService.sortContactByFirstName();
                    break;
                case 8:
                    //sorting contact using zipcode.
                    addressBookService.sortByZipCode();
                    break;
                case 9:
                    //read data from file.
                    addressBookService.readDataFromFile();
                    break;
                case 10:
                    //write to csv file.
                    addressBookService.writeToCsv();
                    break;
                case 11:
                    //read from csv file.
                    addressBookService.readFromCsvFile();
                    break;
                case 12:
                    //write to gson.
                    addressBookService.writeToJson();
                    break;
                case 13:
                    //read from gson.
                    addressBookService.readFromJson();
                    break;
                case 14:
                    //Exit from program.
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }

    public static void main(String[] args)
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.chooseOption();
    }
>>>>>>> 6c7d771eb40b648da6dce1a81cc36a639061e3d5
}
