package model;

import java.sql.Connection;
import java.util.ArrayList;

import pojo.UserVO;

import rest.DbConnection;

import rest.LoginHandler;

public class SecurityManager {

public ArrayList<UserVO> getAllUsersList()throws Exception {
ArrayList<UserVO> userList = null;
try {
DbConnection database= new DbConnection();
System.out.println("connected");
Connection connection = database.getConnection();
LoginHandler loginHandler= new LoginHandler();
userList= loginHandler.getAllUsers(connection);

} catch (Exception e) {
	System.out.println(e.getMessage());
throw e;
}
return userList;
}

}
