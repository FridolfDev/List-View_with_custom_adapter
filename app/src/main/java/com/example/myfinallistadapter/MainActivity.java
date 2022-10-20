package com.example.myfinallistadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
ListView ballonDor ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] playersImages = {
                R.drawable.cristiano,R.drawable.messi,R.drawable.haland,R.drawable.kvdb,R.drawable.bennacer, R.drawable.mahrez,
                R.drawable.neymar, R.drawable.lefandovski
        };
        String[] playersNames = {
                "Cristiano", "Lionel Messi", "erling haaland", "kevin debruyne" ,"Ismail bennacer", "Riyad Mahrez",
                "Neymar", "lewandowski"
        };
        String[] playersClub =
                {
                        "MUN", "PSG", "MAN", "MAN", "MLN" , "MAN", "PSG",
                        "FCB"
                };

        ballonDor = findViewById(R.id.balon_dor_list_view);

        Adapter myAdapter = new Adapter(this, playersNames,playersImages,playersClub,
                R.layout.single_item_list);


        ballonDor.setAdapter(myAdapter);

        ballonDor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                String name = (String) myAdapter.getItem(index);

                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });




    }
}