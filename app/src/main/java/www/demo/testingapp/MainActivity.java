package www.demo.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText cnfrm_pwd,pwd;
    String cnfrm_pwd_str,pwd_str;

    Button submeitt;

    boolean temp=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cnfrm_pwd=findViewById(R.id.cnfrm_pwd);
        pwd=findViewById(R.id.pwd);
        submeitt=findViewById(R.id.submeitt);

        submeitt.setOnClickListener(v -> {
            pwd_str=pwd.getText().toString();
            cnfrm_pwd_str=cnfrm_pwd.getText().toString();
            if(!pwd_str.equals(cnfrm_pwd_str)){
                Toast.makeText(MainActivity.this,"Password Not matching",Toast.LENGTH_SHORT).show();
                temp=false;
            }

        });


    }
}