package thethirdtext.example.com.thethirdtext;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment extends Fragment {
    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.activity_fragment,container,false);
        return view;
    }
}
