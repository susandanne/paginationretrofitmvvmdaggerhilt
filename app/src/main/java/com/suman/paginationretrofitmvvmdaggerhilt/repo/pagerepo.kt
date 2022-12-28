package com.suman.paginationretrofitmvvmdaggerhilt.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.suman.paginationretrofitmvvmdaggerhilt.api.QInterface
import com.suman.paginationretrofitmvvmdaggerhilt.pagination.paginationsource
import javax.inject.Inject

class pagerepo @Inject constructor(private val api:QInterface ) {

    fun getAllQuotes() = Pager(
        config = PagingConfig(20, maxSize = 100),
        pagingSourceFactory = { paginationsource(api) }
    ).liveData
}