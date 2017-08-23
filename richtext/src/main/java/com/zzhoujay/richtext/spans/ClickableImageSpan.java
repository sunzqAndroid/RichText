package com.zzhoujay.richtext.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.view.View;

import com.zzhoujay.richtext.callback.OnImageClickListener;
import com.zzhoujay.richtext.callback.OnImageLongClickListener;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by zhou on 2016/11/17.
 * ClickableImageSpan 支持点击的ImageSpan
 */
public class ClickableImageSpan extends ImageSpan implements LongClickableSpan {

    private float x;
    private final int position;
    private final List<String> imageUrls;
    private final WeakReference<OnImageLongClickListener> onImageLongClickListenerWeakReference;
    private final WeakReference<OnImageClickListener> onImageClickListenerWeakReference;

    public ClickableImageSpan(Drawable drawable, ClickableImageSpan clickableImageSpan, OnImageClickListener onImageClickListener, OnImageLongClickListener onImageLongClickListener) {
        super(drawable, clickableImageSpan.getSource());
        this.imageUrls = clickableImageSpan.imageUrls;
        this.position = clickableImageSpan.position;
        this.onImageClickListenerWeakReference = new WeakReference<>(onImageClickListener);
        this.onImageLongClickListenerWeakReference = new WeakReference<>(onImageLongClickListener);
    }

    public ClickableImageSpan(Drawable drawable, List<String> imageUrls, int position, OnImageClickListener onImageClickListener, OnImageLongClickListener onImageLongClickListener) {
        super(drawable, imageUrls.get(position));
        this.imageUrls = imageUrls;
        this.position = position;
        this.onImageClickListenerWeakReference = new WeakReference<>(onImageClickListener);
        this.onImageLongClickListenerWeakReference = new WeakReference<>(onImageLongClickListener);
    }


    @Override
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
//        super.draw(canvas, text, start, end, x, top, y, bottom, paint);
        this.x = x;
        Drawable drawable = getDrawable();
        int transY = y - drawable.getBounds().bottom + 9;
        canvas.save();
        canvas.translate(x, transY);
        drawable.draw(canvas);
        canvas.restore();
    }

    public boolean clicked(int position) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Rect rect = drawable.getBounds();
            if (position <= rect.right + x && position >= rect.left + x) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void onClick(View widget) {
        OnImageClickListener onImageClickListener = onImageClickListenerWeakReference.get();
        if (onImageClickListener != null) {
            onImageClickListener.imageClicked(imageUrls, position);
        }
    }

    @Override
    public boolean onLongClick(View widget) {
        OnImageLongClickListener onImageLongClickListener = onImageLongClickListenerWeakReference.get();
        return onImageLongClickListener != null && onImageLongClickListener.imageLongClicked(imageUrls, position);
    }
}
