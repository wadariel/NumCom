package com.example.numcom.domain.usecases

import com.example.numcom.domain.entity.GameSettings
import com.example.numcom.domain.entity.Level
import com.example.numcom.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings{
        return repository.getGameSettings(level)
    }
}