package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.learning.core.day10.UserProfile;

public class TestUserProfile {
	@Test
    public void testName()
    {
		UserProfile userProfile = new UserProfile();
		assertTrue(userProfile.validateUsername("johnDoe"));
    }
	
	@Test
    public void testPassword()
    {
		UserProfile userProfile = new UserProfile();
		assertTrue(userProfile.validatePassword("Passwor1"));
    }
}
