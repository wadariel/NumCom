package com.example.numcom.domain.usecases

import com.example.numcom.domain.entity.Question
import com.example.numcom.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question{
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object{
        private const val COUNT_OF_OPTIONS = 6
    }
}