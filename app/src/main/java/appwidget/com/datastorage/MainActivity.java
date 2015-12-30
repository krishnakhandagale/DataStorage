package appwidget.com.datastorage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.AvoidXfermode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<MyModel> temp= new ArrayList<>();
        MyModel m= new MyModel("Krishna");
        m.setData("Yummy");
        temp.add(m);

        Model model= new Model();
        model.setL("Krish");
        model.setS("Kha");

        ArrayList<Model> list= new ArrayList<>();
        list.add(model);

        MyDAta data= new MyDAta();
        data.setfName("Krishna");
        data.setlName("Khandagale");
        data.setList(temp);

        Intent i = new Intent(this,MainActivity2Activity.class);
        Bundle b= new Bundle();
        b.putParcelable("Key", data);
        b.putParcelableArrayList("ParcelList",list);
        i.putExtra("krishna",b);
        startActivity(i);

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
