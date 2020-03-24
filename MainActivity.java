package com.example.changeimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
private RadioGroup rg;
private RadioButton rb;
private Button change_image;
private ImageView imageView;
int checkid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.rg);
        change_image=(Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.imageview);
        change_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checkedId=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(checkedId);
                String str=rb.getText()+"";
                switch (str)
                {
                    case "Image 1":
                        imageView.setImageResource(R.drawable.kiss);
                        break;
                    case "Image 2":
                        imageView.setImageResource(R.drawable.smiley);
                        break;
                    case "Image 3":
                        imageView.setImageResource(R.drawable.anger);
                        break;
                    case "Image 4":
                        imageView.setImageResource(R.drawable.heart );
                        break;

                    default:break;
                }

            }
        });

    }
}
