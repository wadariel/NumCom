package com.example.numcom.domain.repository

import com.example.numcom.domain.entity.GameSettings
import com.example.numcom.domain.entity.Level
import com.example.numcom.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}