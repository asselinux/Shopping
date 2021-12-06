package ru.asselinux.shopping.domain

import androidx.lifecycle.LiveData

class GetShopListInteract(private val shopListRepository: ShopListRepository) {

    fun getList() : LiveData<List<ShopItem>> {
        return shopListRepository.getList()
    }
}