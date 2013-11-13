package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.entity.User;

public class UserManager {

	private static final String USER_DATA_FILE = "users.txt";

	public static void addUser(String username, String password) {

		try {
            FileWriter writer = new FileWriter(USER_DATA_FILE);
            writer.write(username + " " + password);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}

	public static User getUser() {

		try {
            BufferedReader br = new BufferedReader(new FileReader(USER_DATA_FILE));
            String content = br.readLine();
            if (content != null) {
            	String[] tokens = content.split(" ");
            	String username = tokens[0];
            	String password = tokens[1];
            	return new User(username, password);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return null;
	}
	
}