package br.feevale.projeto.labex2.adapter;

import java.util.ArrayList;

import br.feevale.projeto.labex2.pojo.Exercicio;
import br.feevale.projeto_labex2.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdaptadorListaExercicios extends BaseAdapter {

	
	Context ctx;
	ArrayList<Exercicio> lista;
	
	public AdaptadorListaExercicios(Context ctx, ArrayList<Exercicio> lista) {
		this.ctx = ctx;
		this.lista = lista;
	}

	@Override
	public int getCount() {
		
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		
		return lista.get(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView = inflater.inflate(R.layout.fragment_lista_exercicios , null);
		
		TextView txtquestao = (TextView) convertView.findViewById(R.id.txtquestao);
		TextView txttipoExercicio = (TextView) convertView.findViewById(R.id.txttipoExercicio);
		TextView txtidCategoria = (TextView) convertView.findViewById(R.id.txtidCategoria);
		TextView txtid = (TextView) convertView.findViewById(R.id.txtid);
		
		
		Exercicio c = lista.get(position);
		
		txtquestao.setText(c.getQuestao());
		txttipoExercicio.setText(c.getTipoExercicio());
		txtidCategoria.setText(c.getIdCategoria()+ "");		
		txtid.setText(c.getId() + "");
		
		return convertView;
	}
}
