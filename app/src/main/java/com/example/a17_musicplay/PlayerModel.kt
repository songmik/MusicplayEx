package com.example.a17_musicplay

data class PlayerModel(

    private val playMusicList: List<MusicModel> = emptyList(),
    var currentPosition: Int = -1,
    var isWatchingPlayListView: Boolean = true
){

    fun getAdapterModels(): List<MusicModel>{
        return playMusicList.mapIndexed { index, musicModel ->
            val newUtem = musicModel.copy(

            )
        }
    }
}
