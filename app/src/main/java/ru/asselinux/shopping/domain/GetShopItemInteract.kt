package ru.asselinux.shopping.domain

class GetShopItemInteract(private val shopListRepository: ShopListRepository) {

    fun getItem(shopItemId: Int): ShopItem {
        return shopListRepository.getItem(shopItemId)
    }
}