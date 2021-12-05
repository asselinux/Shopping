package ru.asselinux.shopping.domain

class GetShopListInteract(private val shopListRepository: ShopListRepository) {

    fun getList() : List<ShopItem> {
        return shopListRepository.getList()
    }
}