package com.suman.paginationretrofitmvvmdaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.suman.paginationretrofitmvvmdaggerhilt.adapter.pageadapter
import com.suman.paginationretrofitmvvmdaggerhilt.databinding.ActivityMainBinding
import com.suman.paginationretrofitmvvmdaggerhilt.viewmodel.pageviewmodel
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var pageadapter: pageadapter
    lateinit var viewModel: pageviewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

  pageadapter= pageadapter()
        binding.recview.adapter=pageadapter
        viewModel=ViewModelProvider(this)[pageviewmodel::class.java]
        viewModel.list.observe(this){
         pageadapter.submitData(lifecycle,it)
        }
    }
}