package jp.techacademy.shino.oomori.variouschallenge;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Shino on 2017/05/21.
 */

public class CustomGridView extends RelativeLayout {

    public CustomGridView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        TextView textView = (TextView)findViewById(R.id.textView);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        //描画に使う色を指定
        canvas.drawLine(0, 0, 100, 100, paint);
        //線を引く。

        invalidate();

    }
}
