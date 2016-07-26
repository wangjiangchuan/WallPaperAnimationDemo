package animation.meizu.cuicui.wallpaperanimationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    private Button second_nextAct;
    private Button second_thirdAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();

        second_nextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(FirstActivity.class);
            }
        });

        second_thirdAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //butClick(ThirdActivity.class);
                Intent intent = new Intent();
                intent.setClass(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        second_nextAct = (Button) findViewById(R.id.second_next_act);
        second_thirdAct = (Button) findViewById(R.id.second_third_act);
    }

    private void butClick(Class classname) {
        Intent intent = new Intent();
        intent.setClass(SecondActivity.this, classname);
        startActivity(intent);
    }
}
