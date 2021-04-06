package com.meleshko.beatbox

import androidx.lifecycle.MutableLiveData

class SoundViewModel {

    val title: MutableLiveData<String?> = MutableLiveData()

    var sound: Sound? = null
    set(sound) {
        field = sound
        title.postValue(sound?.name)
    }

}