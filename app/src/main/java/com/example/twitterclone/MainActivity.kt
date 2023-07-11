package com.example.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }

    fun displayTweets(){
        var tweet1 = TweetData("Pau", "Pauline", "@popo", "i love memes",
                12, 23, 4)
        var tweet2 = TweetData("Nora", "Norani", "@nia", "i love travelling" +
                "all over Kenya",
            12, 23, 212)
        var tweet3 = TweetData("Mike", "Michael", "@mmike", "coding might be" +
                "hard but its really fun",
            12, 23, 42)
        var tweet4 = TweetData("Sam", "Samael", "@saml", "The largest organ" +
                "in the body is the skin",
            12, 23, 482)
        var tweet5 = TweetData("Pau", "Pauline", "@popo", "i love memes",
            12, 23, 4)
        var tweet6 = TweetData("Nora", "Norani", "@nia", "i love travelling" +
                "all over Kenya",
            12, 23, 212)
        var tweet7 = TweetData("Mike", "Michael", "@mmike", "coding might be" +
                "hard but its really fun",
            12, 23, 42)
        var tweet8 = TweetData("Sam", "Samael", "@saml", "The largest organ" +
                "in the body is the skin",
            12, 23, 482)
        var tweet9 = TweetData("Pau", "Pauline", "@popo", "i love memes",
            12, 23, 4)
        var tweet10 = TweetData("Nora", "Norani", "@nia", "i love travelling" +
                "all over Kenya",
            12, 23, 212)
        var tweet11 = TweetData("Mike", "Michael", "@mmike", "coding might be" +
                "hard but its really fun",
            12, 23, 42)
        var tweet12 = TweetData("Sam", "Samael", "@saml", "The largest organ" +
                "in the body is the skin",
            12, 23, 482)


        var tweetLists = listOf<TweetData>(tweet1, tweet2, tweet3, tweet4,tweet5, tweet6, tweet7,
        tweet8, tweet9, tweet10, tweet11, tweet12)

        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        var adapterTweets = TwitterRVAdapter(tweetLists)
        binding.rvTweets.adapter = adapterTweets
    }
}