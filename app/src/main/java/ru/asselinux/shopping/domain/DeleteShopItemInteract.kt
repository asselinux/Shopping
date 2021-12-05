package ru.asselinux.shopping.domain

class DeleteShopItemInteract(private val shopListRepository: ShopListRepository) {

    fun deleteItem(shopItem: ShopItem) {
        shopListRepository.deleteItem(shopItem)
    }
}