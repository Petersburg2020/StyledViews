package nx.peter.app.android_ui.view.text;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import nx.peter.app.android_ui.view.StyledView;

public class TextImage extends Text {
	public Drawable image;
	public float size;

	public TextImage(CharSequence text, @Nullable Drawable image, float size, int start) {
		super(text, Type.Image, start);
		this.size = size;
		this.image = image;
	}

	public TextImage(@NonNull CharSequence text, @NonNull Context context, int image, float size, int start) {
		this(text, ContextCompat.getDrawable(context, image), size, start);
	}

	public TextImage(@NonNull CharSequence text, @NonNull Context context, @DrawableRes int image, @ColorInt int tint, float size, int start) {
		this(text, context, image, size, start);
		if (this.image != null)
			this.image.setTint(tint);
	}

	public TextImage(@NonNull CharSequence text, @NonNull StyledView view, int image, @ColorInt int tint, float size, int start) {
		super(text, Type.Image, view, start);
		this.size = size;
		this.image = ContextCompat.getDrawable(view.getContext(), image);
		if (this.image != null)
			this.image.setTint(tint);
	}
}
