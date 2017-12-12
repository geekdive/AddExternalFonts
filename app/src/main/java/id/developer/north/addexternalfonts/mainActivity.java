package id.developer.north.addexternalfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {

    TextView tvArabicFont, tvSurat, tvTerjemah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String pathOfFont = "DroidNaskh-Regular.ttf";

        tvArabicFont = (TextView)findViewById(R.id.viewText);
        tvSurat = (TextView)findViewById(R.id.namaDoa);
        tvTerjemah = (TextView)findViewById(R.id.viewTerjemah);
        Typeface tf = Typeface.createFromAsset(getAssets(), pathOfFont);

        tvArabicFont.setTypeface(tf);
        String namaSurat = "Q.S. Al-An'am : 60";
        String qsAlAnam60 = "وَهُوَ الَّذِي يَتَوَفَّاكُمْ بِاللَّيْلِ وَيَعْلَمُ مَا جَرَحْتُمْ بِالنَّهَارِ ثُمَّ يَبْعَثُكُمْ فِيهِ لِيُقْضَى أَجَلٌ مُسَمًّى ثُمَّ إِلَيْهِ مَرْجِعُكُمْ ثُمَّ يُنَبِّئُكُمْ بِمَا كُنْتُمْ تَعْمَلُونَ";
        String terjemah = "Artinya: \n \"Dan Dialah yang menidurkan kamu di malam hari dan Dia mengetahui apa yang kamu kerjakan pada siang hari, kemudian Dia membangunkan kamu pada siang hari untuk disempurnakan umur (mu) yang telah ditentukan, kemudian kepada Allah-lah kamu kembali, lalu Dia memberitahukan kepadamu apa yang dahulu kamu kerjakan.\" \n (Q.S Al-An'am : 60)";
        tvSurat.setText(""+namaSurat);
        tvArabicFont.setText(""+qsAlAnam60);
        tvTerjemah.setText(""+terjemah);



    }
}
