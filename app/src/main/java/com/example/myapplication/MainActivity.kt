package com.example.myapplication

import android.media.MediaPlayer.OnPreparedListener
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = findViewById<VideoView>(R.id.video)
        val uri: Uri = Uri.parse(
            "android.resource://com.example/myapplication"
                    + R.raw.video
        )
        vm.setVideoURI(uri)
        vm.start()
        vm.setOnPreparedListener { mp ->
            vm.start()
            mp!!.isLooping = true;
        };

    }
}