/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import DAO.UserDAO;
import Entity.User;
import java.util.List;

/**
 *
 * @author bactv
 */
public class UserManagement {
     public static List<User> getUser() {
         return UserDAO.getUser();
     }
     public static boolean insertUser(User user) {
         return UserDAO.insertUser(user);
     }
}
