package com.mkp.toastui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;
import com.pradeep.mkp.tostui.ToastUI;

import java.util.ArrayList;

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