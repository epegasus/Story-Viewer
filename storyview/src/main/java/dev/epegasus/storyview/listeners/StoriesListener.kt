package dev.epegasus.storyview.listeners

/**
 * Created by Sohaib Ahmed on 02/04/2023.
 * github -> https://github.com/epegasus
 * linked-in -> https://www.linkedin.com/in/epegasus
 */

interface StoriesListener {
    fun onNext()
    fun onPrev()
    fun onComplete()
}