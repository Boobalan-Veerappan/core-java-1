package com.heraizen.cj.day5.mylterator;

import com.heraizen.cj.day5.mylterator.User.UserList;

public class UserClient {

	public static void main(String[] args) {

User u = new User(new String[] {"indian","captian","is","a","finisher"});
Mylterator ul  = u.getIterator();

while(ul.hasNext())
{
	System.out.println(ul.next());
}


	}

}

