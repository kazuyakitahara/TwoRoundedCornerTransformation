package tech.kthr.example.trctransformation;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import tech.kthr.example.trctransformation.databinding.ActivityMainBinding;
import tech.kthr.trctransformation.BottomRoundedCornerTransformation;
import tech.kthr.trctransformation.LeftRoundedCornerTransformation;
import tech.kthr.trctransformation.RightRoundedCornerTransformation;
import tech.kthr.trctransformation.TopRoundedCornerTransformation;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding = null;
    private static final String SAMPLE_URL_1 = "https://www.pakutaso.com/assets_c/2016/02/KAZ7842_P1110102-thumb-autox1500-20691.jpg";
    private static final String SAMPLE_URL_2 = "https://www.pakutaso.com/shared/img/thumb/PAK88_tsurareneko20150109081309_TP_V.jpg";
    private static final String SAMPLE_URL_3 = "https://www.pakutaso.com/shared/img/thumb/HIRA88_hikkurikaetteniramiwokikasu20130910001351_TP_V.jpg";
    private static final String SAMPLE_URL_4 = "https://www.pakutaso.com/shared/img/thumb/HIRA88_nihikisorottesc20140809134818_TP_V.jpg";
    private static final String SAMPLE_URL_5 = "https://www.pakutaso.com/assets_c/2016/03/P1090145-3-thumb-autox1000-21374.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSampleImages();
    }

    private void setSampleImages() {
        int cornerRadiusPx = getResources().getDimensionPixelSize(R.dimen.corner_radius);
        Picasso.with(this).load(SAMPLE_URL_1)
                .fit()
                .centerCrop()
                .transform(new TopRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.topRoundedCornerImageView);

        Picasso.with(this).load(SAMPLE_URL_2)
                .fit()
                .centerCrop()
                .transform(new RightRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.rightRoundedCornerImageView);

        Picasso.with(this).load(SAMPLE_URL_3)
                .fit()
                .centerCrop()
                .transform(new BottomRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.bottomRoundedCornerImageView);

        Picasso.with(this).load(SAMPLE_URL_4)
                .fit()
                .centerCrop()
                .transform(new LeftRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.leftRoundedCornerImageView);

        Picasso.with(this).load(SAMPLE_URL_5)
                .fit()
                .centerCrop()
                .transform(new TopRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.composeImageView);
    }
}
