package br.feevale.projeto.labex2.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.feevale.projeto.labex2.pojo.Turma;
import br.feevale.projeto_labex2.R;

public class TurmasAdapter extends BaseAdapter {

	private Context mContext;
	private ArrayList<Turma> mTurmasArrayList;
	
	public TurmasAdapter(Context context, ArrayList<Turma> turmasArrayList){
		this.mContext = context;
		this.mTurmasArrayList = turmasArrayList;
	}
	
	@Override
	public int getCount() {
		return mTurmasArrayList.size();
	}

	@Override
	public Object getItem(int arg0) {
		return mTurmasArrayList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return mTurmasArrayList.get(arg0).getId();
	}

	@Override
	public View getView(int position, View view, ViewGroup arg2) {
		
		LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.item_lista_turmas, null);
		
        TextView txtNome = (TextView) view.findViewById(R.id.txtNome);
        
        Turma turma = mTurmasArrayList.get(position);
        
        txtNome.setText(turma.getNome());
        
		return view;
		
		
	}

}
