package ru.asselinux.shopping.data

import ru.asselinux.shopping.domain.ShopItem
import ru.asselinux.shopping.domain.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    override fun addItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editItem(shopItem: ShopItem) {
        val oldElement = getItem(shopItem.id)
        shopList.remove(oldElement)
        addItem(shopItem)
    }

    override fun getItem(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId }
            ?: throw RuntimeException("Element with id $shopList not found")
    }

    override fun getList(): List<ShopItem> {
        return shopList.toList()
    }
}