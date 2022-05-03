package com.example.shopitemlist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shopitemlist.data.ShopListRepositoryImpl
import com.example.shopitemlist.domain.DeleteShopItemUseCase
import com.example.shopitemlist.domain.EditShopItemUseCase
import com.example.shopitemlist.domain.GetShopListUseCase
import com.example.shopitemlist.domain.ShopItem

class MainViewModel : ViewModel() {

    /*Позже надо убрать Data слой*/
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopListById(shopItem)
        getShopList()
    }

    fun changeEnableShopItem(shopItem: ShopItem){
        val newItem = shopItem.copy(enable = !shopItem.enable)
        editShopItemUseCase.editShopList(newItem)
        getShopList()
    }

}