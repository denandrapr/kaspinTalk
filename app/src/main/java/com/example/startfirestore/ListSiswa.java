package com.example.startfirestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;

public class ListSiswa extends AppCompatActivity {

    FirebaseFirestore db;
    Siswa data;
    private List<Siswa> list = new ArrayList<>();
    RecyclerView recyclerView;
    private SiswaAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_siswa);

        db = FirebaseFirestore.getInstance();

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        dataAdapter = new SiswaAdapter(this, list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dataAdapter);

        mengambildata();
    }

    private void mengambildata() {
        db.collection("Pertama")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        for (QueryDocumentSnapshot doc : task.getResult()){
                            Gson gson = new Gson();
                            JsonElement jsonElement = gson.toJsonTree(doc.getData());
                            list.add(gson.fromJson(jsonElement, Siswa.class));
                        }
                        dataAdapter = new SiswaAdapter(ListSiswa.this, list);
                        recyclerView.setAdapter(dataAdapter);
                    }
                });
    }
}
