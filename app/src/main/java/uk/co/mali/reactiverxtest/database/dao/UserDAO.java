package uk.co.mali.reactiverxtest.database.dao;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import uk.co.mali.reactiverxtest.database.pojo.realmbean.User;

/**
 * Created by alig2 on 05/08/2017.
 */

public class UserDAO {

   List<User> usersList = new ArrayList<>();

    public Observable<List<User>> swapAdapter(User user){
        usersList.add(user);

       //Create listObservable holding List Object for Users.
        Observable<List<User>> listObservable = Observable.just(usersList);

        return listObservable;

    }


}
