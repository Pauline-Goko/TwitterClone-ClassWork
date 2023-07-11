package com.example.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.twitterclone.databinding.TweetListItemBinding

class TwitterRVAdapter(var tweetsList: List<TweetData>): RecyclerView.Adapter<TweetsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
       var binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context),
           parent, false)
        return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var tweetData = tweetsList[position]
        holder.binding.apply {
            tvDisplayName.text = tweetData.displayName
            tvHandle.text = tweetData.handle
            tvTweet.text = tweetData.tweet
            tvReplyCount.text = tweetData.replyCount.toString()
            tvRtCount.text = tweetData.rtCount.toString()
            tvLikeCount.text = tweetData.likeCount.toString()

        }
    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}

class TweetsViewHolder(var binding: TweetListItemBinding): RecyclerView.ViewHolder(binding.root)