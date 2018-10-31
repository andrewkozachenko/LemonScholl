package school.lemon.db.work.with.table;

import school.lemon.db.work.with.table.entity.User;

public class Example {

    public static void main(String[] args) {
        User [] users  = Service.selectAllUsers();
        for (User user :users
             ) {
            System.out.println(user);
        }

//       User nikita = new User(828, "Nikita", "Nikita");
//       Service.createUser(nikita);
//        System.out.println(Service.getUserById(828));
//        User user1488 = new User(1488, "kislyi", "limon");
//        Service.createUser(user1488);
//        Service.updateUserById(user123);
//        Service.deleteUser(123);
//        User newUser123 = Service.getUs
//        System.out.println(newUser123);

    }
}
