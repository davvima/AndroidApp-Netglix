package com.example.mvvm.domain

import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider
import com.example.mvvm.data.model.QuoteRepository

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()

    operator fun invoke(): QuoteModel?{
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber: Int =(quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}