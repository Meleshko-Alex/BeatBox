package com.meleshko.beatbox

import androidx.lifecycle.MutableLiveData

class SoundViewModel(private val beatBox: BeatBox) {

    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }

    val title: MutableLiveData<String?> = MutableLiveData()

    var sound: Sound? = null
        set(sound) {
            field = sound
            title.postValue(sound?.name)
        }

}