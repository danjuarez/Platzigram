package gt.com.juslabs.platzigram;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gt.com.juslabs.platzigram.view.ContainerActivity;
import gt.com.juslabs.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goHome(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
    public void goPlatzi(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://platzigram.com/"));
        startActivity(intent);
    }
}
