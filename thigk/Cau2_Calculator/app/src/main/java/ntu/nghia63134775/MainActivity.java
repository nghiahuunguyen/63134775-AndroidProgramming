package ntu.nghia63134775;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtnhap;
    double firstOperand;
    String selectedOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Khởi tạo EditText
        edtnhap = findViewById(R.id.edtnhap);
        // Khởi tạo các nút
        Button nut0 = findViewById(R.id.btn0);
        Button nut1 = findViewById(R.id.btn1);
        Button nut2 = findViewById(R.id.btn2);
        Button nut3 = findViewById(R.id.btn3);
        Button nut4 = findViewById(R.id.btn4);
        Button nut5 = findViewById(R.id.btn5);
        Button nut6 = findViewById(R.id.btn6);
        Button nut7 = findViewById(R.id.btn7);
        Button nut8 = findViewById(R.id.btn8);
        Button nut9 = findViewById(R.id.btn9);
        Button nutcong = findViewById(R.id.btncong);
        nutcong.setText("+");
        Button nuttru = findViewById(R.id.btntru);
        nuttru.setText("-");
        Button nutnhan = findViewById(R.id.btnnhan);
        nutnhan.setText("*");
        Button nutchia = findViewById(R.id.btnchia);
        nutchia.setText("/");
        Button nutbang = findViewById(R.id.btnbang);
        Button dell=findViewById(R.id.btndell);
        Button c=findViewById(R.id.btnc);
        Button mu=findViewById(R.id.btnmu);
        Button cham=findViewById(R.id.btncham);
        Button can=findViewById(R.id.btncan);

        // Đặt OnClickListener cho các nút
        nut0.setOnClickListener(this);
        nut1.setOnClickListener(this);
        nut2.setOnClickListener(this);
        nut3.setOnClickListener(this);
        nut4.setOnClickListener(this);
        nut5.setOnClickListener(this);
        nut6.setOnClickListener(this);
        nut7.setOnClickListener(this);
        nut8.setOnClickListener(this);
        nut9.setOnClickListener(this);
        nutcong.setOnClickListener(this);
        nuttru.setOnClickListener(this);
        nutnhan.setOnClickListener(this);
        nutchia.setOnClickListener(this);
        nutbang.setOnClickListener(this);
        dell.setOnClickListener(this);
        c.setOnClickListener(this);
        mu.setOnClickListener(this);
        cham.setOnClickListener(this);
        can.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Button clickedButton = (Button) view;
        String buttonText = clickedButton.getText().toString();

        switch (buttonText) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "^":
                handleOperatorClick(buttonText);
                break;
            case "=":
                calculateResult();
                break;
            case "Dell":
                xoatungpt();
                break;
            case "AC":
                xoa();
                break;
            default:
                String currentText = edtnhap.getText().toString();
                String newText = currentText + buttonText;
                edtnhap.setText(newText);
                break;
        }

    }
    private void handleOperatorClick(String operator) {
        String currentText = edtnhap.getText().toString();
        if (!currentText.isEmpty()) {
            firstOperand = Double.parseDouble(currentText);
            selectedOperator = operator;
            edtnhap.setText(currentText + operator);
        }
    }

    private void calculateResult() {
        String currentText = edtnhap.getText().toString();
        if (!currentText.isEmpty()) {
            double result = 0.0;

            // Kiểm tra xem có phải biểu thức căn bậc hai hay không
            if (currentText.startsWith("√")) {
                String numberStr = currentText.substring(1);
                double number = Double.parseDouble(numberStr);
                result = Math.sqrt(number);
            } else {
                String[] expression = currentText.split("\\+|-|\\*|/|\\^"); // Tách biểu thức thành các phần tử dựa trên toán tử
                //ktra có 2 toán hạng
                if (expression.length == 2) {
                    double firstOperand = Double.parseDouble(expression[0]);
                    double secondOperand = Double.parseDouble(expression[1]);
                    switch (selectedOperator) {
                        case "+":
                            result = firstOperand + secondOperand;
                            break;
                        case "-":
                            result = firstOperand - secondOperand;
                            break;
                        case "*":
                            result = firstOperand * secondOperand;
                            break;
                        case "/":
                            if (secondOperand != 0) {
                                result = firstOperand / secondOperand;
                            }
                            break;
                        case "^":
                            result = Math.pow(firstOperand, secondOperand);
                            break;
                    }
                }
            }
            edtnhap.setText(String.valueOf(result));
        }
    }
    private void xoatungpt(){
        String currentText = edtnhap.getText().toString();
        int length = currentText.length();
        if (length > 0) {
            String newText = currentText.substring(0, length - 1);
            edtnhap.setText(newText);
        }
    }
    private void xoa(){
        edtnhap.setText("");
    }
}