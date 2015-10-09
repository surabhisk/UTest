package com.ail.surabhi.utest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by surabhi on 9/10/15.
 */

@Config(emulateSdk = 21, reportSdk = 21)
@RunWith(RobolectricTestRunner.class)

public class UserTest {

    @Test
    public void UseNameTest() {
        User u = new User();
        u.setName("surabhi");

        Assert.assertEquals("surabhi",u.getName());
    }

    @Test
    public void failingTest() {
        Assert.assertFalse(true);
    }

}
