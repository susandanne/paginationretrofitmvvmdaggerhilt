package com.suman.paginationretrofitmvvmdaggerhilt.adapter

import android.view.LayoutInflater
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

  class pageviewholder(public val binding: PagingitemBinding) : RecyclerView.ViewHolder(binding.root)

  override fun onBindViewHolder(holder: pageviewholder, position: Int) {
    getItem(position).let{
//      holder.binding.quoteTv.text=
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pageviewholder {
    return pageviewholder(
      PagingitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )
  }

  companion object {
    private  val comparator =object:
      DiffUtil.ItemCallback<com.suman.paginationretrofitmvvmdaggerhilt.model.Result>(){
      override fun areItemsTheSame(
        oldItem: com.suman.paginationretrofitmvvmdaggerhilt.model.Result,
        newItem: com.suman.paginationretrofitmvvmdaggerhilt.model.Result
      ): Boolean {

          return oldItem.id==newItem.id

      }

      override fun areContentsTheSame(
        oldItem: com.suman.paginationretrofitmvvmdaggerhilt.model.Result,
        newItem: com.suman.paginationretrofitmvvmdaggerhilt.model.Result
      ): Boolean {
          return oldItem==newItem
      }

    }

  }
}






