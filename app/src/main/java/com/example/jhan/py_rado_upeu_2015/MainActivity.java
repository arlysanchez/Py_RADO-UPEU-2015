package com.example.jhan.py_rado_upeu_2015;

import android.content.ClipData;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    GridView tableReg;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<20;i++) {
            gridArray.add(new Item("Joel Pérez Suarez","20"));
        }
        /*gridArray.add(new Item("Jhan Arly dd dd"));
        gridArray.add(new Item("Milton Garay Bautista"));
        gridArray.add(new Item("Gerson Layza fff"));
        gridArray.add(new Item("Holaaa  aaaa"));
        gridArray.add(new Item("gdggsds  sdsd"));
        gridArray.add(new Item(" sdsdsd   sasd"));
        gridArray.add(new Item("s ds dsdsdsd"));
        gridArray.add(new Item("asd dsd"));
        gridArray.add(new Item("sds dsdsd"));*/

        tableReg = (GridView) findViewById(R.id.TableReg);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        tableReg.setAdapter(customGridAdapter);

        tableReg.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),gridArray.get(position).getName_apellidos(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
