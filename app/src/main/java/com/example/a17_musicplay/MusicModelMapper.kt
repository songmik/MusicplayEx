package com.example.a17_musicplay

import com.example.a17_musicplay.service.MusicDto
import com.example.a17_musicplay.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =  MusicModel(
    id = id,
    streamUrl = streamUrl,
    coverUrl = coverUrl,
    track = track,
    artist = artist
)

fun MusicDto.mapper(): PlayerModel =
    PlayerModel(
        playMusicList = musics.mapIndexed{index, musicEntity ->
            musicEntity.mapper(index.toLong())

        }

    )