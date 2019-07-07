package org.adnan.restapilearning.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.adnan.restapilearning.messenger.model.Message;
import org.adnan.restapilearning.messenger.model.Profile;
/**
 * This class is like a stub for a database..Not thread safe....
 * @author adnan
 *
 */
public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
