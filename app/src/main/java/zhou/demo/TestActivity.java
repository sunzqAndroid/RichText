package zhou.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zzhoujay.richtext.ImageHolder;
import com.zzhoujay.richtext.RichText;

/**
 * Created by zhou on 16-10-22.
 */

public class TestActivity extends AppCompatActivity {

    private static final String QUESTIONTYPE = "<font color=\"#007AFF\">(%1$s)</font>";
    private static final String IMAGE_TAG = "<img width=\"%1$s\" height=\"%2$s\" src=\"%3$s\">";
    private static final String test =
            "<font color=\"#007AFF\">(单选题)</font>" +
                    "<img width=\"258\" height=\"258\" src=\"http://input.ti.eoffcn.com/uploads/uploads_question/final/20160513/14631119245497730.png\">命名规则命名规则命名规则命名规则命名规则命" +
                    "<img width=\"258\" height=\"258\" src=\"http://img10.360buyimg.com/imgzone/jfs/t2836/30/707249522/270588/840d428a/5721e108Ne667230f.jpg\">命名规则命名规则命名规则命名规则" +
                    "";
    private RichText richText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView textView = (TextView) findViewById(R.id.text);

        assert textView != null;
        String img1 = "http://input.ti.eoffcn.com/uploads/uploads_question/final/20160513/1463111924549773.png";
        String img2 = "http://img10.360buyimg.com/imgzone/jfs/t2776/164/715581717/852142/2fa4714f/5721e10bN04e38f08.jpg";
        String img3 = "http://img10.360buyimg.com/imgzone/jfs/t2776/164/715581717/852142/2fa4714f/5721e10bN04e38f08.jpg";
        String content = String.format(QUESTIONTYPE, "单选题") + String.format(IMAGE_TAG, "258", "258", img1)
                + "命名规则命名规则命名规则命名规则命名规则命" + String.format(IMAGE_TAG, "258", "258", img2)
                + "命名规则命名规则命名规则命名规则命名规则命" + String.format(IMAGE_TAG, "258", "258", img2);
        richText = RichText.from(content).scaleType(ImageHolder.ScaleType.FIT_XY).into(textView);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        richText.clear();
        richText = null;
    }
}
