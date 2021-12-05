package ru.asselinux.shopping.domain

class EditShopItemInteract(private val shopListRepository: ShopListRepository) {

    fun editItem(shopItem: ShopItem) {
        shopListRepository.editItem(shopItem)
    }
}