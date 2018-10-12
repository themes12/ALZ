package com.example.thitiphuttaamart.myprojectalzheimers;

import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class RandomPicture extends Activity {
    final Random rnd = new Random();

    @Override
    protected void onCreate(
            final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz);

        final ImageView img = (ImageView) findViewById(R.id.imageView);
        // I have 3 images named img_0 to img_2, so...
        final String str = "img_" + rnd.nextInt(4);
        img.setImageDrawable
                (
                        getResources().getDrawable(getResourceID(str, "drawable",
                                getApplicationContext()))
                );
    }

    protected final static int getResourceID
            (final String resName, final String resType, final Context ctx)
    {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0)
        {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        }
        else
        {
            return ResourceID;
        }
    }
}