package ru.job4j.turist;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    private Address addr1 = new Address("City1", "street1", 5, 34);
    private Address addr2 = new Address("City2", "street2", 41, 842);
    private Address addr3 = new Address("City3", "street3", 109, 4);
    private Address addr4 = new Address("City2", "street2", 41, 842);
    List<Profile> profilesList = new ArrayList<>();

    @Before
    public void prepareData() {
        profilesList.add(new Profile(addr3));
        profilesList.add(new Profile(addr1));
        profilesList.add(new Profile(addr2));
        profilesList.add(new Profile(addr4));
    }

    @Test
    public void whenGetSortedAddresses() {
        List<Address> expect = new ArrayList<>();
        expect.add(addr1);
        expect.add(addr2);
        expect.add(addr3);
        List<Address> result = Profiles.collect(profilesList);
        assertThat(expect, is(result));
    }
}
