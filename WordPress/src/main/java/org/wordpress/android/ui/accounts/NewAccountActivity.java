package org.wordpress.android.ui.accounts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.wordpress.android.R;
import org.wordpress.android.util.AppLog;
import org.wordpress.android.util.AppLog.T;

// TODO: merge it with WelcomeFragmentSignIn
public class NewAccountActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_account_activity);
        AppLog.i(T.NUX, "New Account Activity started");
    }
}
