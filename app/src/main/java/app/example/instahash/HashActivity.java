package app.example.instahash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class HashActivity extends AppCompatActivity {


    TextView hashtags,head;
    RelativeLayout copy;
    ImageView back;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hash);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9803998520474404/7001064029");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {

                Intent i = new Intent(HashActivity.this,MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAdLoaded() {
                if (mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
            }
        });






        hashtags = findViewById(R.id.hashtags);
        String hashes = getIntent().getStringExtra("Tag");
        hashtags.setText(hashes);


        head = findViewById(R.id.head);
        String tag = getIntent().getStringExtra("Head");
        head.setText(tag);


        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    Intent i = new Intent(HashActivity.this,MainActivity.class);
                    startActivity(i);




            }
        });





        copy = findViewById(R.id.copy);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipboardManager myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                String text;
                text = hashtags.getText().toString();

                ClipData myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);

                Toast.makeText(getApplicationContext(), "Copied",Toast.LENGTH_SHORT).show();


            }
        });


    }

    @Override
    public void onBackPressed() {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {

            super.onBackPressed();
        }

    }
}