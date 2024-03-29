package ru.mirea.galieva.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    ProgressDialog pd;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        pd = new ProgressDialog(getActivity());
        pd.setTitle("ProgressDialog");
        pd.setMessage("Loading...");

        pd.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        return pd;
    }

}
