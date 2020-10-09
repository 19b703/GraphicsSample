package jp.ac.shohoku.s19b703.graphicssample;

 import android.content.Context;
 import android.graphics.Canvas;
 import android.graphics.Color;
 import android.graphics.Paint;
 import android.graphics.Paint.Style;
 import android.graphics.Rect;
 import android.util.AttributeSet;
 import android.view.View;


import androidx.annotation.Nullable;

public class CustomView2 extends View {
    public CustomView2(Context context) {
        super(context);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

 /**
  * このメソッドで描画をします．
  * @param canvas 画像表示用のキャンバス
  */
 protected void onDraw(Canvas canvas){
     super.onDraw(canvas);
     canvas.drawColor(Color.BLACK);

     int w = this.getWidth();
     int h = this.getHeight();
     Paint p = new Paint();
     p.setStyle(Style.STROKE); //Style を設定: 線で描く
     p.setColor(Color.WHITE); //色を設定
     canvas.drawRect(new Rect(5, 5, w - 10, h - 10), p); //長方形を描画

     for(int i = 0; i<10; i++){
         Paint p2 = new Paint();
         p2.setStyle(Style.FILL); //Style を設定： 塗りつぶす
         p2.setColor(Color.rgb(25*i, 25*i, 0)); //色を設定
         canvas.drawCircle(25*i+125, 25*i+125, 100,p2); //円を描く
     }
 }
}