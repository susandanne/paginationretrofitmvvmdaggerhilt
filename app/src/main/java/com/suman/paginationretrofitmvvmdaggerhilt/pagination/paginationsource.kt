package com.suman.paginationretrofitmvvmdaggerhilt.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.suman.paginationretrofitmvvmdaggerhilt.api.QInterface
import com.suman.paginationretrofitmvvmdaggerhilt.model.Result

class paginationsource( val api: QInterface) :PagingSource<Int,com.suman.paginationretrofitmvvmdaggerhilt.model.Result>() {
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        TODO("Not yet implemented")
    }
}