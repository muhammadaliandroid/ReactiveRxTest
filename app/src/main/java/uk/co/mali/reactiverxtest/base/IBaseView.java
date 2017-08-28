package uk.co.mali.reactiverxtest.base;

import android.support.annotation.StringRes;

/**
 * Created by alig2 on 26/08/2017.
 */

public interface IBaseView<T> {
    void setPresenter(T presenter);
    void makeToast(@StringRes int stringId);
    void makeToast(String message);
}
