package com.suman.paginationretrofitmvvmdaggerhilt.adapter

import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.common.api.Result
import com.suman.paginationretrofitmvvmdaggerhilt.databinding.PagingitemBinding

class pageadapter:
  PagingDataAdapter<com.suman.paginationretrofitmvvmdaggerhilt.model.Result, pageadapter.pageviewholder >(
    comparator) {

  class pageviewholder(itemView: View) : RecyclerView.ViewHolder(itemView)

  override fun onBindViewHolder(holder: pageviewholder, position: Int) {
    TODO("Not yet implemented")
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pageviewholder {
    TODO("Not yet implemented")
  }

  companion object {
    private  val comparator =object:
      DiffUtil.ItemCallback<com.suman.paginationretrofitmvvmdaggerhilt.model.Result>()

  }
}






