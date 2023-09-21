package senac.com.br;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override //Anotação que indica que o método seguinte substitui {sobrescreve} um método da superclasse
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView aluno = new TextView(this);
        aluno.setText("Yan");
        setContentView(aluno);
        //Toast.makeText(this, "Ola", Toast.LENGTH_SHORT).show();
    }
}
