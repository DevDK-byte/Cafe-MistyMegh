package GUI;

import javax.swing.*;  // Needed for JOptionPane
import java.io.*;
import java.util.*;

public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean validateLogin() {
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up all information carefully", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        boolean canLogin = false;

        try {
            File file = new File("./dat.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] part = line.split("\t");

                if (part.length == 3) {
                    String storedUsername = part[0].trim();
                    String storedPassword = part[2].trim();

                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        canLogin = true;
                        break;
                    }
                }
            }
            sc.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (!canLogin) {
            JOptionPane.showMessageDialog(null, "Your username or password is invalid!", "Login Unsuccessful", JOptionPane.ERROR_MESSAGE);
        }
        return canLogin;
}
}
