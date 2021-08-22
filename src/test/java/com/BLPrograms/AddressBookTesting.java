package com.BLPrograms;

import com.BLPrograms.AddressBookService;
import com.BLPrograms.PersonDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBookTesting
{
    @Test
    public void givenReadFromDB_ShouldReturnListOfContacts()
    {
        AddressBookService addressBookService = new AddressBookService();
        List<PersonDetails> contactList  = addressBookService.readFromDataBase();
        Assertions.assertEquals(2, contactList.size());
    }

    @Test
    public void givenUpadteEmployeeData_WhenUpdated_shouldSyncWithDatabase()
    {
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.readFromDataBase();
        addressBookService.updateContactInDataBase("Mohammad",90000 );
        Assertions.assertTrue(addressBookService.checkSyncWithDB("Mohammad"));
    }

    @Test
    public void givenAddressbookDB_WhenBetweenDates_ShouldReturnListOfContacts()
    {
        AddressBookService addressBookService = new AddressBookService();
        List<PersonDetails> contactList  = addressBookService.getContatctsAddedAfterdate("2020-1-1");
        Assertions.assertEquals(4, contactList.size());
    }

    @Test
    public void givenAddressbookDB_WhenInSameCity_ShouldReturnNumberOfContacts()
    {
        AddressBookService addressBookService = new AddressBookService();
        HashMap<String, Integer> sameCity = addressBookService.getContactHaveSameCity();
        Assertions.assertEquals(3, sameCity.size());
    }

    @Test
    public void givenInsertEmployeeData_WhenInserted_shouldSyncWithDatabase()
    {
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.readFromDataBase();
        List<String> groups = new ArrayList<String>();
        groups.add("family");
        groups.add("friend");
        addressBookService.insertContactInDataBase("ramesh","Tiwary","Bojpur","Ara","Bihar","802316",0000,"Ctiwa@gmail.com",groups);
        Assertions.assertTrue(addressBookService.checkSyncWithDB("rohit"));
    }
}
