package ru.asselinux.shopping.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getItem(shopItemId: Int): ShopItem

    fun getList() : LiveData<List<ShopItem>>
}