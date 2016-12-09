/**
 * Created by VINNI on 08.12.16.
 */
import java.util.*;
public class UserUtils extends User{
    User[] uniqueUsers(User[] users){

        boolean mask[] = new boolean[users.length];
        int removeCount = 0;
        User[] tmp = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            if (!mask[i]) {
                tmp[0] = users[i];

                for (int j = i + 1; j < users.length; j++) {
                    if (tmp[0].equals(users[j])) {
                        mask[j] = true;
                        mask[i] = true;
                        removeCount=removeCount+2;
                    }
                }
            }
        }

        User[] result = new User[users.length - removeCount];

        for (int i = 0, j = 0; i < users.length; i++) {
            if (!mask[i]) {
                result[j++] = users[i];
            }
        }
        System.out.println("uniqueUsers: " + Arrays.toString(result));

        return result;
    }

    User[] usersWithContitionalBalance(User[] users, int balance) {

        boolean mask[] = new boolean[users.length];
        int removeCount = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance()==balance){
                        mask[i] = true;
                        removeCount++;}
            }

        User[] result = new User[removeCount];

        for (int i = 0, j = 0; i < removeCount+1; i++) {
            if (mask[i]) {
                result[j++] = users[i];
            }
        }
        System.out.println("usersWithContitionalBalance: " + Arrays.toString(result));

        return result;
    }

    final User[] paySalaryToUsers(User[] users)
    {
        for (int i = 0; i < users.length; i++) {
            int usersbalans=users[i].getBalance();
            int usersalary=users[i].getSalary();
            int usersbalansnew=usersbalans+usersalary;
            users[i].setBalance(usersbalansnew);
        }

        System.out.println("paySalaryToUsers: " + Arrays.toString(users));

        return users;

    }
    final long[] getUsersId(User[] users)
    {
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            result[i]=users[i].getId();
        }

        System.out.println("getUsersId: " + Arrays.toString(result));

        return result;
    }

    User[] deleteEmptyUsers(User[] users)
    {
        boolean mask[] = new boolean[users.length];
        int removeCount = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getId()!=0 && users[i].getFirstName() !=null){
                mask[i] = true;
                removeCount++;}
        }

        User[] result = new User[removeCount];

        for (int i = 0, j = 0; i < removeCount+1; i++) {
            if (mask[i]) {
                result[j++] = users[i];
            }
        }
        System.out.println("deleteEmptyUsers: " + Arrays.toString(result));

        return result;
    }

}
