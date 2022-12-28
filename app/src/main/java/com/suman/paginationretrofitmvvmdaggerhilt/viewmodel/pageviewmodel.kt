package com.suman.paginationretrofitmvvmdaggerhilt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.suman.paginationretrofitmvvmdaggerhilt.repo.pagerepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class pageviewmodel @Inject constructor(val repo:pagerepo):ViewModel() {
    val list=repo.getAllQuotes().cachedIn(viewModelScope)
}