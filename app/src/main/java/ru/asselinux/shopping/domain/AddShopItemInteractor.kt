package ru.asselinux.shopping.domain

class AddShopItemInteractor(private val shopListRepository: ShopListRepository) {

    fun addItem(shopItem: ShopItem) {
        shopListRepository.addItem(shopItem)
    }
}