package animation.meizu.cuicui.wallpaperanimationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {

    private Button closeBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        initView();

        closeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butClick(SecondActivity.class);
            }
        });
    }

    //
    private void initView() {
        closeBut = (Button) findViewById(R.id.third_close_but);
    }

    private void butClick(Class classname) {
        Intent intent = new Intent();
        intent.setClass(ThirdActivity.this, classname);
        startActivity(intent);
    }

}
