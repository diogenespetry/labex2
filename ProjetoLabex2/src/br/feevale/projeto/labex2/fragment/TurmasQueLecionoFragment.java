package br.feevale.projeto.labex2.fragment;

import br.feevale.projeto_labex2.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TurmasQueLecionoFragment extends Fragment {

	public TurmasQueLecionoFragment(){
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(
				R.layout.fragment_lista_turmas_dummy, container, false);
		TextView dummyTextView = (TextView) rootView
				.findViewById(R.id.section_label);
		dummyTextView.setText("Turmas que leciono");
		return rootView;
		
	}
	
}
