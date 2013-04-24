package br.feevale.projeto.labex2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import br.feevale.projeto_labex2.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btTurmas = (Button) findViewById(R.id.btTurmas);
		Button btExercicios = (Button) findViewById(R.id.btExercicios);

		btTurmas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), ListaTurmasActivity.class);
				startActivity(i);
			}
		});
		
		btExercicios.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Intent i = new Intent(getBaseContext(), ListaExercicioActivity.class);
				//startActivity(i);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
