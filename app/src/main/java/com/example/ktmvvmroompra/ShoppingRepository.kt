package com.example.ktmvvmroompra

class ShoppingRepository( private val db:ShoppingDatabase) {
   suspend fun upsert(item: ShoppingItem)=db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem)=db.getShoppingDao().delete(item)
    fun getAllshoppingItem()=db.getShoppingDao().getAllShoppingItem()
}