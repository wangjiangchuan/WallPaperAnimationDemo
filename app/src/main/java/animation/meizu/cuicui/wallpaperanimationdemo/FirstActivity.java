package animation.meizu.cuicui.wallpaperanimationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

    private Button first_nextBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        initView();

        first_nextBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(SecondActivity.class);
            }
        });
    }

    private void initView() {
        first_nextBut = (Button) findViewById(R.id.first_next_but);

    }

    private void butClick(Class classname) {
        Intent intent = new Intent();
        intent.setClass(FirstActivity.this, classname);
        startActivity(intent);
    }
}
