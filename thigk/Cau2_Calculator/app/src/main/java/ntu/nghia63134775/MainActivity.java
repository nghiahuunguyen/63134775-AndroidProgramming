package ntu.nghia63134775;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    EditText edtnhap;
    double sothu1;
    String selectedOperator;
    double sothu2;
    boolean  isSquareRootPressed = true;

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
        Button nuttru = findViewById(R.id.btntru);
        Button nutnhan = findViewById(R.id.btnnhan);
        Button nutchia = findViewById(R.id.btnchia);
        Button nutbang = findViewById(R.id.btnbang);
        Button dell=findViewById(R.id.btndell);
        Button c=findViewById(R.id.btnc);
        Button mu=findViewById(R.id.btnmu);
        Button can=findViewById(R.id.btncan);
        Button cham=findViewById(R.id.btncham);

        // Đặt OnClickListener cho các nút
        nut0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("0");
            }
        });
        nut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("1");
            }
        });
        nut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("2");
            }
        });
        nut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("3");
            }
        });
        nut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("4");
            }
        });
        nut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("5");
            }
        });
        nut6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("6");
            }
        });
        nut7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("7");
            }
        });
        nut8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("8");
            }
        });
        nut9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("9");
            }
        });
        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText(".");
            }
        });
        nutcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sothu1 = Double.parseDouble(edtnhap.getText().toString());
                selectedOperator = "+";
                edtnhap.setText("+");
            }
        });
        nuttru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sothu1 = Double.parseDouble(edtnhap.getText().toString());
                selectedOperator = "-";
                edtnhap.setText("");
            }
        });

        nutnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sothu1 = Double.parseDouble(edtnhap.getText().toString());
                selectedOperator = "*";
                edtnhap.setText("");
            }
        });

        nutchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sothu1 = Double.parseDouble(edtnhap.getText().toString());
                selectedOperator = "/";
                edtnhap.setText("");
            }
        });
        nutbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtnhap.getText().toString().isEmpty()) {
                    String inputText = edtnhap.getText().toString();
                    double result = 0.0;

                    if (isSquareRootPressed) {
                        String numberText = inputText.substring(1); // Lấy phần tử sau kí hiệu căn
                        if (!numberText.isEmpty()) {
                            double input = Double.parseDouble(numberText);
                            result = Math.sqrt(input);
                        }
                        isSquareRootPressed = false;
                    } else {
                        switch (selectedOperator) {
                            case "+":
                                sothu2 = Double.parseDouble(edtnhap.getText().toString());
                                result = sothu1 + sothu2;
                                break;
                            case "-":
                                sothu2 = Double.parseDouble(edtnhap.getText().toString());
                                result = sothu1 - sothu2;
                                break;
                            case "*":
                                sothu2 = Double.parseDouble(edtnhap.getText().toString());
                                result = sothu1 * sothu2;
                                break;
                            case "/":
                                sothu2 = Double.parseDouble(edtnhap.getText().toString());
                                if (sothu2 != 0) {
                                    result = sothu1 / sothu2;
                                } else {
                                    Log.e("Error", "Division by zero");
                                }
                                break;
                            case "^":
                                sothu2 = Double.parseDouble(edtnhap.getText().toString());
                                result = Math.pow(sothu1, sothu2);
                                break;
                            case "√":
                                result = Math.sqrt(sothu1);
                                break;
                        }

                    }

                    edtnhap.setText(String.valueOf(result));
                }
            }
        });

        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnhap.setText("√");
                isSquareRootPressed = true;

            }
        });
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sothu1 = Double.parseDouble(edtnhap.getText().toString());
                selectedOperator = "^";
                edtnhap.setText("");
            }
        });

        dell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xoatungpt();;
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xoa();
            }
        });
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