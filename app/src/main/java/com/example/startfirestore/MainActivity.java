package com.example.startfirestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        db.collection("Siswa")
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()){
//                            for (QueryDocumentSnapshot doc : task.getResult()){
//                                Log.d("Firestore",  " => "+doc.getData());
//                            }
//                        }else{
//                            Log.d("Firestore", "Firestore Error");
//                        }
//                    }
//                });

//        db.collection("Siswa").document("1")
//                .addSnapshotListener(new EventListener<DocumentSnapshot>() {
//                    @Override
//                    public void onEvent(@Nullable DocumentSnapshot snapshot,
//                                        @Nullable FirebaseFirestoreException e) {
//                        if (e != null) {
//                            Log.w("Firestore", "Listen failed.", e);
//                            return;
//                        }
//
//                        if (snapshot != null && snapshot.exists()) {
//                            Log.d("Firestore", "Current data: " + snapshot.getData());
//                        } else {
//                            Log.d("Firestore", "Current data: null");
//                        }
//                    }
//                });
//    }

//        db.collection("Siswa")
//                .addSnapshotListener(new EventListener<QuerySnapshot>() {
//                    @Override
//                    public void onEvent(@Nullable QuerySnapshot snapshots,
//                                        @Nullable FirebaseFirestoreException e) {
//                        if (e != null) {
//                            Log.w("Firestore", "listen:error", e);
//                            return;
//                        }
//
//                        for (DocumentChange dc : snapshots.getDocumentChanges()) {
//                            switch (dc.getType()) {
//                                case ADDED:
//                                    Log.d("Firestore", "New data: " + dc.getDocument().getData());
//                                    break;
//                                case MODIFIED:
//                                    Log.d("Firestore", "Modified data: " + dc.getDocument().getData());
//                                    break;
//                                case REMOVED:
//                                    Log.d("Firestore", "Removed data: " + dc.getDocument().getData());
//                                    break;
//                            }
//                        }
//
//                    }
//                });

//        db.collection("Siswa")
//                .whereEqualTo("Kelas", 10)
//                .whereLessThan("Kelas", 11)
//                .whereGreaterThan("Kelas", 9)
//                .whereGreaterThanOrEqualTo("Kelas", 10)
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()){
//                            for (QueryDocumentSnapshot doc : task.getResult()){
//                                Log.d("Firestore",  " => "+doc.getData());
//                            }
//                        }else{
//                            Log.d("Firestore", "Firestore Error");
//                        }
//                    }
//                });
//
//        db.collection("Siswa")
////                .orderBy("Nama")
//                .orderBy("Nama", Query.Direction.ASCENDING)
//                .limit(2)
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()){
//                            for (QueryDocumentSnapshot doc : task.getResult()){
//                                Log.d("Firestore",  " => "+doc.getData());
//                            }
//                        }else{
//                            Log.d("Firestore", "Firestore Error");
//                        }
//                    }
//                });

//        Siswa siswa = new Siswa(
//                "Bob",
//                "Lakii",
//                7,
//                false);
//        db.collection("Siswa").document("17410100021")
//                .set(siswa)
//                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//                        //berhasil
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        //gagal
//                    }
//                });

//        db.collection("Siswa").document("1")
//                .delete()
//                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//                        //berhasil
//                    }
//                });

//        db.collection("Siswa")
//                .document("1")
//                .update("Nama", "Bob")
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        //sukses
//                    }
//                });

//        DocumentReference docRef = db.collection("Siswa")
//                .document("1");
//        Map<String, Object> update = new HashMap<>();
//        update.put("aktif", FieldValue.delete());
//        docRef.update(update).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                //berhasil
//            }
//        });



    }
}
