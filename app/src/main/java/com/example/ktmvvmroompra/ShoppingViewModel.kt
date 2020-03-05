package com.example.ktmvvmroompra

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val  repository: ShoppingRepository) :ViewModel()
{
fun upsert(item: ShoppingItem)= CoroutineScope(Dispatchers.Main).launch { repository.upsert(item) }
    fun delete(item: ShoppingItem)= CoroutineScope(Dispatchers.Main).launch { repository.delete(item) }
fun getAllShoppingItems()=repository.getAllshoppingItem()
}