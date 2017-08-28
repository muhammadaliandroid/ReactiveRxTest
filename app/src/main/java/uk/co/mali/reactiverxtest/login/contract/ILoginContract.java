package uk.co.mali.reactiverxtest.login.contract;

import android.support.annotation.StringRes;

import uk.co.mali.reactiverxtest.base.IBasePresenter;
import uk.co.mali.reactiverxtest.base.IBaseView;

/**
 * Created by alig2 on 26/08/2017.
 */

public interface ILoginContract {
    interface ILoginView extends IBaseView<IPresenter>
    {

        void makeToast(@StringRes int stringId);
        void makeToast(String message);

        String getEMail();
        String getPassword();

        void startProfileActivity();
        void startCreateAccountActivity();

        void setPresenter(ILoginContract.IPresenter presenter);
        void showProgressIndicator(boolean show);


    }

    interface IPresenter extends IBasePresenter {

        void onLoginClick();
        void onCreateClick();
    }



}