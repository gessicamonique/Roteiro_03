package com.example.sonyvaio.projetocarros_gessica;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by sony vaio on 20/03/2016.
 */
public class CarrosAdapter extends RecyclerView.Adapter<CarrosAdapter.CarrosViewHolder> {

    private Context context;
    private List<Carro> carros;
    private CarrosApplication carrosApplication;

    public CarrosAdapter(Context context){
        this.context = context;
        carrosApplication = (CarrosApplication) context.getApplicationContext();
        carros = carrosApplication.getCarros();
    }


    @Override
    public CarrosAdapter.CarrosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // infla a layout e armazena em uma view
        View view = LayoutInflater.from(context).inflate(R.layout.content_list_main,viewGroup,false);
        // envia o layout inflado(view) para a classe ViewHolder
        return new CarrosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarrosAdapter.CarrosViewHolder holder, int position) {

        // captura o carro da posição
        Carro c = carros.get(position);
        // mostra a imagem do carro da posição
        holder.imageView.setImageDrawable(context.getResources().getDrawable(c.getIdImageCarro()));
        // Exibe o nome do carro
        holder.textView.setText(c.getNomeCarro());
    }

    @Override
    public int getItemCount() {

        return this.carros.size(); // retorna o tamanho da lista de carros
    }

    public class CarrosViewHolder extends RecyclerView.ViewHolder {

        private View toqueView;
        private ImageView imageView;
        private TextView textView;

        public CarrosViewHolder(View itemView) {

            super(itemView);
            toqueView = itemView.findViewById(R.id.content_list_main);
            imageView = (ImageView) itemView.findViewById(R.id.img_list_main);
            textView = (TextView) itemView.findViewById(R.id.text_list_main);

            toqueView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getPosition();
                    carrosApplication.removerCarros(position);
                    Toast.makeText(context, "Removeu da posição: " + position, Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });

        }
    }
}
