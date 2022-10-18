package com.mkp.toastui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.pradeep.mkp.toastuilib.ToastUI;

public class MainActivity extends AppCompatActivity {
    int countitem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_toast).setOnClickListener(v -> {
            oneByOne(countitem++, this);
        });
    }
    private void oneByOne(int count, Context context) {

        switch (count) {
            case 1:
                ToastUI.getInstance(context).infoMessage("information with server available");
                break;
            case 2:
                ToastUI.getInstance(context).warningMessage("warning about data connect to server");
                break;
            case 3:
                ToastUI.getInstance(context).errorMessage("error while getting data");
                break;
            default:
                ToastUI.getInstance(context).successMessage("success fetched  data");
                break;
        }

    }
}