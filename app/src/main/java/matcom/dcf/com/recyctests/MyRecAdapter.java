package matcom.dcf.com.recyctests;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by dfinlay-air on 03/10/15.
 */
public class MyRecAdapter extends RecyclerView.Adapter<MyRecAdapter.MyViewHolder> {

    //
    List<TeamDetails> data= Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;
    public MyRecAdapter(Context context, List<TeamDetails> data){
        this.context=context;
        inflater=LayoutInflater.from(context);
        this.data=data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view=inflater.inflate(R.layout.recrow, parent,false);
        MyViewHolder mvh = new MyViewHolder(view);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {

        TeamDetails td = data.get(position);
        myViewHolder.country.setText(td.country);
        myViewHolder.team.setText(td.team);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView team;
        TextView country;

        public MyViewHolder(View itemView) {
            super(itemView);
            team = (TextView) itemView.findViewById(R.id.txtTeam);
            country = (TextView) itemView.findViewById(R.id.txtCountry);
        }
    }
}
