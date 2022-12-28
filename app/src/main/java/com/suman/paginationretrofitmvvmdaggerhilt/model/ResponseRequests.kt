package com.suman.paginationretrofitmvvmdaggerhilt.model

data class ResponseRequests(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)