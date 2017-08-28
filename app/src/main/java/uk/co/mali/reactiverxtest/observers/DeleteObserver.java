package uk.co.mali.reactiverxtest.observers;

import io.reactivex.observers.DisposableObserver;
import uk.co.mali.reactiverxtest.database.pojo.realmbean.User;

/**
 * Created by alig2 on 09/08/2017.
 */

public class DeleteObserver extends DisposableObserver<User> {
    @Override
    public void onNext(User value) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
