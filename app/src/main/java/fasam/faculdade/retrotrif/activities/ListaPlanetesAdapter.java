package fasam.faculdade.retrotrif.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fasam.faculdade.retrotrif.R;
import fasam.faculdade.retrotrif.model.Planestes;

public class ListaPlanetesAdapter extends RecyclerView.Adapter<ListaPlanetesAdapter.ListaPlanesteHolder> {

    private List<Planestes> planests;

    public ListaPlanetesAdapter(List<Planestes> planests) {
        this.planests = planests;
    }

    public ListaPlanetesAdapter() {

    }

    @NonNull
    @Override
    public ListaPlanesteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_planestes, parent, false);

        return new ListaPlanesteHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaPlanesteHolder holder, int position) {
    holder.textTituloPlanetas.setText(planests.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return (planests != null && planests.size() > 0) ? planests.size() : 0;
    }

    static class ListaPlanesteHolder extends RecyclerView.ViewHolder{
        TextView textTituloPlanetas;

        public ListaPlanesteHolder(@NonNull View itemView) {
            super(itemView);

            textTituloPlanetas = itemView.findViewById(R.id.text_Planetes);
            textTituloPlanetas.setText(Planestes.class.getName());

        }
    }


}
