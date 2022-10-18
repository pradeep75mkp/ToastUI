package com.pradeep.mkp.tostui;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textview.MaterialTextView;

/**
 * @author Pradeep Yadav
 */
public class ToastUI {
    private static final ToastUI INSTANCE = null;
    private static MaterialTextView materialTextView;
    private static Context context;
    private static Toast toast;
    private static View rootView;

    private ToastUI(Context context) {
        this.context = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflate = layoutInflater.inflate(R.layout.layout_toast, null, false);
        rootView = inflate.getRootView();
        materialTextView = inflate.findViewById(R.id.mtv_toast);
        materialTextView.setTextColor(context.getResources().getColor(R.color.white_2));
        toast = new Toast(context);
        toast.setView(inflate);
        toast.setGravity(Gravity.BOTTOM, 0, 250);
    }

    public static ToastUI getInstance(Context context) {
        return INSTANCE == null ? new ToastUI(context) : INSTANCE;
    }


    public static void showMessage(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }


    public void successMessage(String string) {
        materialTextView.setText(string);
        rootView.setBackground(context.getResources().getDrawable(R.drawable.gradient_success, null));
        materialTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.ic_check_circle_16),
                null, null, null);
        toast.show();
    }


    public void errorMessage(String string) {
        materialTextView.setText(string);
        rootView.setBackground(context.getResources().getDrawable(R.drawable.gradient_error, null));
        materialTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.ic_error_outline_16),
                null, null, null);
        toast.show();
    }

    public void warningMessage(String string) {
        materialTextView.setText(string);
        rootView.setBackground(context.getResources().getDrawable(R.drawable.gradient_warning, null));
        materialTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.ic_warning_20),
                null, null, null);
        toast.show();
    }

    public void infoMessage(String string) {
        materialTextView.setText(string);
        rootView.setBackground(context.getResources().getDrawable(R.drawable.gradient_info, null));
        materialTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.ic_info_outline_16),
                null, null, null);
        toast.show();
    }

}






