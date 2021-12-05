package ru.asselinux.shopping.domain

class AddShopItemInteract(private val shopListRepository: ShopListRepository) {

    fun addItem(shopItem: ShopItem) {
        shopListRepository.addItem(shopItem)
    }
}