package uk.co.mali.reactiverxtest.LoginTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.mali.reactiverxtest.R;
import uk.co.mali.reactiverxtest.login.contract.ILoginContract;
import uk.co.mali.reactiverxtest.login.presenter.LoginPresenter;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * This is my First Unit Test Class
 *
 * Created by alig2 on 26/08/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    private ILoginContract.ILoginView view;

    private LoginPresenter presenter;

    @Before
    public void setup()throws Exception{
        MockitoAnnotations.initMocks(this   );
        presenter = new LoginPresenter();

    }

    /**
     * When user click login button attempts to log in the User
     */
    @Test
    public void whenUserLoggingAttemptSucceed() throws Exception{

        verify(view).startProfileActivity();

    }

    @Test
    public void whenUserLoggingAttemptFail()throws Exception{

        verify(view).makeToast(Mockito.anyString());
    }

    @Test
    public void whenUserClickRegisterButton()throws Exception{

        verify(view).startCreateAccountActivity();
    }

    @Test
    public void whenActiveUserFound() throws Exception{
        verify(view).startProfileActivity();

    }

    @Test
    public void whenEmailEmpty() throws Exception{
        when(view.getEMail()).thenReturn("");
        when(view.getPassword()).thenReturn("123456");
        verify(view).makeToast(Mockito.anyString());

    }

    @Test
    public void whenEmailIsInvalid() throws Exception{
        when(view.getEMail()).thenReturn("testemail");
        when(view.getPassword()).thenReturn("ali");
        presenter.onLoginClick();
        verify(view).makeToast(R.string.error_invalid_email);

    }

    public void whenPasswordEmpty(){
        when(view.getEMail()).thenReturn("alig2x@gmail.com");
        when(view.getPassword()).thenReturn("");
        verify(view).makeToast(R.string.error_empty_input_password);
    }

    @Test
    public void whenPasswordTooLong()throws Exception{
        when(view.getEMail()).thenReturn("alig2x@gmail.com");
        when(view.getPassword()).thenReturn("12345678912345678912");
        presenter.onLoginClick();
        verify(view).makeToast(R.string.error_password_too_long);

    }



}
