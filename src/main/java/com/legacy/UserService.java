package com.legacy;

import java.util.Iterator;
import java.util.List;

public class UserService {

    public void printAdultUsers(List users) {

        if (users == null || users.size() == 0) {
            System.out.println("Lista vazia");
            return;
        }

        Iterator it = users.iterator();

        while (it.hasNext()) {
            User user = (User) it.next();

            if (user.getAge() != null) {
                if (user.getAge().intValue() >= 18) {
                    System.out.println(user.getName() + " é adulto");
                }
            }
        }
    }
}
