package appwidget.com.datastorage;

import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        Bundle b= getIntent().getExtras();
        Bundle k=b.getBundle("krishna");
        ArrayList<Model> list= k.getParcelableArrayList("ParcelList");

        MyDAta kr=k.getParcelable("Key");
        Toast.makeText(this,list.get(0).getL(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,kr.getList().get(0).getData(),Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity2Activity.this,kr.getfName()+" "+kr.getlName(),Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
