package ru.asselinux.shopping.domain

class DeleteShopItemInteractor(private val shopListRepository: ShopListRepository) {

    fun deleteItem(shopItem: ShopItem) {
        shopListRepository.deleteItem(shopItem)
    }
}