package com.derin.damiano.transparentbackground;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

import com.jackandphantom.blurimage.BlurImage;

public class TransparentBackground {

    private static final String TAG = TransparentBackground.class.getSimpleName();

    public static void transparentBackground(Activity activity, int blurIntensity) {
        Drawable wallpaperBlurDrawable = getBlurryWallpaper(activity.getApplicationContext(), blurIntensity); // blurIntensity >= 1

        ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0).setBackground(wallpaperBlurDrawable);
    }

    private static Drawable getBlurryWallpaper(Context context, int blurIntensity) {

        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
        Drawable wallpaperDrawable = wallpaperManager.getDrawable();

        Bitmap wallpaperBitmap = BitmapDrawableUtils.drawableToBitmap(wallpaperDrawable);

        Bitmap wallpaperBlurBitmap = BlurImage.with(context).load(wallpaperBitmap).intensity(blurIntensity).Async(true).getImageBlur();

        BitmapDrawable wallpapperBlurDrawable = new BitmapDrawable(context.getResources(), wallpaperBlurBitmap);

        return wallpapperBlurDrawable;
    }

}
