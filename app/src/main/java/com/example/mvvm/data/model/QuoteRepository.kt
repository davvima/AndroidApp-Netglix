package com.example.mvvm.data.model

import com.example.mvvm.data.model.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response:List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response

    }

}