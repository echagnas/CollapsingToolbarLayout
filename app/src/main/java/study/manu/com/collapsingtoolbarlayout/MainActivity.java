package study.manu.com.collapsingtoolbarlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private String[] myDataset = {"Elem1", "Elem2", "Elem3", "Elem4"
            , "Elem5", "Elem6", "Elem7", "Elem8", "Elem9", "Elem10"
            , "Elem5", "Elem6", "Elem7", "Elem8", "Elem9", "Elem10"
            , "Elem5", "Elem6", "Elem7", "Elem8", "Elem9", "Elem10"
            , "Elem5", "Elem6", "Elem7", "Elem8", "Elem9", "Elem10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create recycler
        recycler = (RecyclerView) findViewById(R.id.recycler);

        //Define layout manager for recycler
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);

        //Create adapter for recycler
        RecyclerAdapter adapter = new RecyclerAdapter(myDataset);
        recycler.setAdapter(adapter);
    }
}
