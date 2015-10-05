package matcom.dcf.com.recyctests;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<TeamDetails> td = new ArrayList<TeamDetails>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        TeamDetails team = new TeamDetails("Manchester","U.K.");
        td.add(team);
        team = new TeamDetails("Bayern Munich","Germany");
        td.add(team);
        team = new TeamDetails("P.S.G","France");
        td.add(team);
        //
        RecyclerView rv = (RecyclerView) findViewById(R.id.recList);
        rv.setAdapter(new MyRecAdapter(this, td));
        // Add decoration
        Drawable divider=getResources().getDrawable(R.drawable.item_divider);
        //
        rv.addItemDecoration(new
                Divider(divider));
        //
        rv.setLayoutManager(new LinearLayoutManager(this));
        //

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
