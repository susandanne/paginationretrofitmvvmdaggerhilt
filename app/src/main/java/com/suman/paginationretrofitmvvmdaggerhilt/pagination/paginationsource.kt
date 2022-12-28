package com.suman.paginationretrofitmvvmdaggerhilt.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.suman.paginationretrofitmvvmdaggerhilt.api.QInterface
import com.suman.paginationretrofitmvvmdaggerhilt.model.Result

class paginationsource( val quotesapi: QInterface) :PagingSource<Int,com.suman.paginationretrofitmvvmdaggerhilt.model.Result>() {
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        return try {
            val position = params.key ?: 1

            val response = quotesapi.getAllQuotes(position)

            LoadResult.Page(
                response.results,
                if (position == 1) null else position - 1,
                if (position == response.total_pages) null else position + 1
            )
        } catch (e: java.lang.Exception) {
            LoadResult.Error(e)
        }
    }
}