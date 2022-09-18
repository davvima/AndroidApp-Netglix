package com.example.mvvm.data.model

import com.example.mvvm.data.model.network.QuoteService

class QuoteProvider {
    companion object {
            var quotes: List<QuoteModel> = emptyList()
    }
}