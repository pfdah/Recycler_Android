package com.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.recyclerview.adaptor.ContactAdaptor;
import com.recyclerview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mrv_contact;
    ArrayList <Contact> contactArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrv_contact = findViewById(R.id.rv_contact);
        mrv_contact.setLayoutManager((new LinearLayoutManager(this)));

        contactArrayList.add(new Contact("Pratik","9861517998"));
        contactArrayList.add(new Contact("Somebody","9841517958"));
        contactArrayList.add(new Contact("Pratik","9861517998"));
        contactArrayList.add(new Contact("Someone","9861517958"));
        contactArrayList.add(new Contact("Someone","9861517958"));
        contactArrayList.add(new Contact("Somebody","9841517958"));
        contactArrayList.add(new Contact("Pratik","9861517998"));
        contactArrayList.add(new Contact("Someone","9861517958"));
        contactArrayList.add(new Contact("Somebody","9841517958"));
        contactArrayList.add(new Contact("Pratik","9861517998"));
        contactArrayList.add(new Contact("Someone","9861517958"));
        contactArrayList.add(new Contact("Somebody","9841517958"));

        ContactAdaptor contactAdaptor = new ContactAdaptor(this, contactArrayList);
        mrv_contact.setAdapter(contactAdaptor);

    }
}

