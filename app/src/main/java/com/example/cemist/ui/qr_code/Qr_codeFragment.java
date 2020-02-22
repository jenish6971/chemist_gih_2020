package com.example.cemist.ui.qr_code;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cemist.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class Qr_codeFragment extends Fragment {

    private Qr_code_ViewModel qrcodeViewModel;
    MultiFormatWriter multiFormatWriter=new MultiFormatWriter();



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        qrcodeViewModel =
                ViewModelProviders.of(this).get(Qr_code_ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_qr_code, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        final ImageView qr=root.findViewById(R.id.qr_view);
        qrcodeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                try{
                    BitMatrix bitMatrix=multiFormatWriter.encode("this is qr of Aadhar", BarcodeFormat.QR_CODE,200,200);
                    BarcodeEncoder barcodeEncoder=new BarcodeEncoder();
                    Bitmap bitmap=barcodeEncoder.createBitmap(bitMatrix);
                    qr.setImageBitmap(bitmap);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        return root;


    }
}