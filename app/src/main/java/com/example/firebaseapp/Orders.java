package com.example.firebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Orders extends AppCompatActivity {

    private EditText ordertitle,description,price,category, quantity;
    Button order;
    FirebaseFirestore db ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        ordertitle = findViewById(R.id.et_title);
        description = findViewById(R.id.et_description);
        price = findViewById(R.id.et_price);
        category = findViewById(R.id.et_Category);
        quantity = findViewById(R.id.et_quantity);
        order = findViewById(R.id.btn_submit);
        db = FirebaseFirestore.getInstance();

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ordertitle1= ordertitle.getText().toString();
                String  description1 = description.getText().toString();
                String price1 = price.getText().toString();
                String quantity1 = quantity.getText().toString();
                String category1 = category.getText().toString();
                savedata(ordertitle1,description1,price1,quantity1,category1);
            }
        });
    }

    public void savedata(String ordertitle1, String description1,String price1, String quantity1, String category1){
        Order order = new Order(ordertitle1,description1,price1,quantity1,category1);

        db.collection("Orders")
                .add(order)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(Orders.this, "Order Added", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Orders.this, "Error"+ e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
