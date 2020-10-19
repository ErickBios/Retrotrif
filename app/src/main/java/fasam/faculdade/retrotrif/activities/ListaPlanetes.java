package fasam.faculdade.retrotrif.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import fasam.faculdade.retrotrif.R;
import fasam.faculdade.retrotrif.model.Planestes;

public class ListaPlanetes extends AppCompatActivity {

    private Object LinearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_planestes);

        RecyclerView recyclerPlanetes = findViewById(R.id.rectangles);


        //RecyclerView.LayoutManager = LinearLayoutManager = new LinearLayoutManager(Context this);
        recyclerPlanetes.setLayoutManager((RecyclerView.LayoutManager) LinearLayoutManager);
        recyclerPlanetes.setAdapter(new ListaPlanetesAdapter());
    }
    private List<Planestes> planestsList(){
            return Arrays.asList(
                    new Planestes("API")
            );

    }
}