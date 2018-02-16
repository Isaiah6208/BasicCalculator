package anaheim.startercalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Named same thing in file to work easier
        // Use same name as buttons and text lines in MA.
        // Casted as type button.
        // findViewById searches our resources
        Button addBtn = (Button) findViewById(R.id.addBtn);

        // Multiply Button Declaration
        Button multBtn = (Button) findViewById(R.id.multBtn);

        // Subtract Button Declaration.
        Button subBtn = (Button) findViewById(R.id.subBtn);

        // Division Button Declaration
        Button divBtn = (Button) findViewById(R.id.divBtn);


        // Adds functionality to the add button.
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int addResult = num1 + num2;

                resultTextView.setText(addResult + "");
            }
        });

        // Adds functionality to the multiplication button.
        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int multiplyResult = num1 * num2;

                resultTextView.setText(multiplyResult + "");
            }
        });


        // Adds functionality to the subtract button/
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int subtractResult = num1 - num2;

                resultTextView.setText(subtractResult + "");
            }
        });

        // Adds functionality to the division button.
        // This does not account for mod calculations (remainder).
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int divisionResult = num1 / num2;

                resultTextView.setText(divisionResult + "");
            }
        });
    }
}
