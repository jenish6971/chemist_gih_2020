package com.example.cemist;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class scanner extends AppCompatActivity {
    private TextView textView;
    ImageView qr;

    CodeScanner mCodeScanner;
    MultiFormatWriter multiFormatWriter=new MultiFormatWriter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

       // textView=findViewById(R.id.data_text);


        CodeScannerView scannerView=findViewById(R.id.scanner_view);
        mCodeScanner=new CodeScanner(this,scannerView);
        mCodeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull final Result result) {
                scanner.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String a = result.getText();
                        Toast.makeText(scanner.this, result.getText(), Toast.LENGTH_SHORT).show();



                        //textView.setText(result.getText());
                        ToneGenerator ton=new ToneGenerator(AudioManager.STREAM_ALARM,800);
                        ton.startTone(ToneGenerator.TONE_CDMA_HIGH_PBX_SSL,50);
                        //String data=mCodeScanner.toString();
                        Intent intent = new Intent();
                        intent.putExtra("values", a);
                        setResult(RESULT_OK, intent);
                        finish();
                        startActivity(new Intent(getApplicationContext(),patient.class));

                       // onBackPressed();
                    }
                });
            }
        });
        scannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCodeScanner.startPreview();
            }
        });


        //onBackPressed();
        //onResume();

    }



    @Override
    protected void onResume() {
        super.onResume();
        mCodeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        mCodeScanner.releaseResources();
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
