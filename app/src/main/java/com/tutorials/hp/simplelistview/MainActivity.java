package com.tutorials.hp.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> languages=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LISTVIEW
        ListView lv= (ListView) findViewById(R.id.lv);

        //FILL DATA
        fillData();

        //ADAPTR
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,languages);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, languages.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //FILL DATA
    private void fillData()
    {
        languages.clear();

        //FILL
        languages.add("Java");
        languages.add("C#");
        languages.add("VB.NET");
        languages.add("PHP");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("C");
        languages.add("C++");
        languages.add("Fortran");
        languages.add("Cobol");
        languages.add("Perl");
        languages.add("Prolog");
    }

}
