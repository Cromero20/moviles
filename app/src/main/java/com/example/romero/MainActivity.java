package com.example.romero;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.romero.adapters.ContactoAdaptador;
import com.example.romero.helpers.QueueUtils;
import com.example.romero.models.Contacto;



public class MainActivity extends AppCompatActivity {
    QueueUtils.QueueObject queue = null;
    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactosList = findViewById(R.id.contactosList);
        contactoAdaptador = new ContactoAdaptador(this, Contacto.getCollection(), queue.getImageLoader());
        contactosList.setAdapter(contactoAdaptador);
        queue = QueueUtils.getInstance(this.getApplicationContext());

    }
}