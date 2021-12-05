package ru.asselinux.shopping.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.asselinux.shopping.data.ShopListRepositoryImpl
import ru.asselinux.shopping.domain.DeleteShopItemInteract
import ru.asselinux.shopping.domain.EditShopItemInteract
import ru.asselinux.shopping.domain.GetShopListInteract
import ru.asselinux.shopping.domain.ShopItem

class MainViewModel : ViewModel() {
    //here will be DI
    private val repository = ShopListRepositoryImpl

    private val getShopListInteract = GetShopListInteract(repository)
    private val deleteShopItemInteract = DeleteShopItemInteract(repository)
    private val editShopItemInteract = EditShopItemInteract(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        val list = getShopListInteract.getList()
        shopList.value = list
    }

}