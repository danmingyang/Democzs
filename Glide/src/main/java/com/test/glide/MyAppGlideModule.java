package com.test.glide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

/**
 * Created by Administrator on 2017/9/26.
 */
@GlideModule
public final class MyAppGlideModule extends AppGlideModule
{
    @Override
    public void applyOptions(Context context, GlideBuilder builder)
    {
        super.applyOptions(context, builder);
    }

    @Override
    public void registerComponents(Context context, Glide glide, Registry registry)
    {
        super.registerComponents(context, glide, registry);
    }
}
