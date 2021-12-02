package ru.asselinux.shopping.domain

class EditShopItemInteractor(private val shopListRepository: ShopListRepository) {

    fun editItem(shopItem: ShopItem) {
        shopListRepository.editItem(shopItem)
    }
}