package ru.asselinux.shopping.domain

class GetShopListInteractor(private val shopListRepository: ShopListRepository) {

    fun getList() : List<ShopItem> {
        return shopListRepository.getList()
    }
}