package com.example.androidcalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.androidcalculator.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import  android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView result;

    private TextView resultTextField;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText)findViewById(R.id.number1Field);
        number2 = (EditText)findViewById(R.id.Number2Field);

        resultTextField = (TextView)findViewById(R.id.resultText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
    // Calculator main functions

    // Add Method
    public void Add(View View){
        String value1 = number1.getText().toString();
        String value2 = number2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        int result = num1 + num2;
        String resultText = String.valueOf(result);

        resultTextField.setText(resultText);
    }

    // Substract Method
    public void Substract(View view){
        String value1 = number1.getText().toString();
        String value2 = number2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        int result = num1 - num2;
        String resultText = String.valueOf(result);

        resultTextField.setText(resultText);
    }

    // Divide Method
    public void Divide(View view){
        String value1 = number1.getText().toString();
        String value2 = number2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        if(num2 != 0){
            int result = num1 / num2;
            String resultText = String.valueOf(result);
            resultTextField.setText(resultText);
        }else{
            resultTextField.setText("Invalid Numbers");
        }
    }
}