package com.asi.testcustomfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * A simple button with extra attributes to allow font customization.
 */
public class AsiButton extends Button {
    /**
     * Default View Constructor.
     *
     * @param context application context.
     */
    public AsiButton(final Context context) {
        super(context);
    }

    /**
     * Default View Constructor. Sets custom font with no style.
     *
     * @param context application context.
     * @param attrs   View attributes.
     */
    public AsiButton(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    /**
     * Default View Constructor. Sets custom font with style.
     *
     * @param context  application context.
     * @param attrs    View attributes.
     * @param defStyle View Style.
     */
    public AsiButton(final Context context, final AttributeSet attrs,
                     final int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    /**
     * Initialize custom font attribute.
     *
     * @param attrs attributes.
     */
    private void init(final AttributeSet attrs) {
        Typeface typeface;
        if (!isInEditMode() && (typeface = AsiFontUtils.getTypeFace(this, attrs)) != null) {
            super.setTypeface(typeface, typeface.getStyle());
        }
    }
}

