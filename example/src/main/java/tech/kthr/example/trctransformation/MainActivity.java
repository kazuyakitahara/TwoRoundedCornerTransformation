package tech.kthr.example.trctransformation;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import tech.kthr.example.trctransformation.databinding.ActivityMainBinding;
import tech.kthr.trctransformation.BottomRoundedCornerTransformation;
import tech.kthr.trctransformation.LeftRoundedCornerTransformation;
import tech.kthr.trctransformation.RightRoundedCornerTransformation;
import tech.kthr.trctransformation.RoundedCornerTransformation;
import tech.kthr.trctransformation.TopRoundedCornerTransformation;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding = null;
    private static final String PICASSO_ASSETS_PREFIX = "file:///android_asset/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSampleImages();
    }

    private void setSampleImages() {
        int cornerRadiusPx = getResources().getDimensionPixelSize(R.dimen.corner_radius);
        Picasso.with(this).load(buildAssetPath("image_01.jpg"))
                .fit()
                .centerCrop()
                .transform(new RoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.normalRoundedCornerImageView);

        Picasso.with(this).load(buildAssetPath("image_02.jpg"))
                .fit()
                .centerCrop()
                .transform(new TopRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.topRoundedCornerImageView);

        Picasso.with(this).load(buildAssetPath("image_03.jpg"))
                .fit()
                .centerCrop()
                .transform(new RightRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.rightRoundedCornerImageView);

        Picasso.with(this).load(buildAssetPath("image_04.jpg"))
                .fit()
                .centerCrop()
                .transform(new BottomRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.bottomRoundedCornerImageView);

        Picasso.with(this).load(buildAssetPath("image_05.jpg"))
                .fit()
                .centerCrop()
                .transform(new LeftRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.leftRoundedCornerImageView);

        Picasso.with(this).load(buildAssetPath("image_06.jpg"))
                .fit()
                .centerCrop()
                .transform(new TopRoundedCornerTransformation(cornerRadiusPx, 0))
                .into(this.binding.composeImageView);
    }

    private String buildAssetPath(String imageName) {
        return PICASSO_ASSETS_PREFIX + imageName;
    }
}
