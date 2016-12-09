/**
 * Created by VINNI on 08.12.16.
 */
public class Main {
    public static void main(String[] args) {

        User users1 = new User (1, "A", "B", 100, 1000);
        User users2 = new User (2, "C", "D", 200, 3000);
        User users3 = new User (1, "A", "B", 100, 1000);
        User users4 = new User ();
        User [] arruser = {users1, users2, users3, users4};
        UserUtils userutils = new UserUtils();


        userutils.uniqueUsers(arruser);
        userutils.usersWithContitionalBalance(arruser, 3000);
        userutils.paySalaryToUsers(arruser);
        userutils.getUsersId(arruser);
        userutils.deleteEmptyUsers(arruser);


    }
    }
