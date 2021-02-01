package com.onedudedesign.dogexplorer.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onedudedesign.dogexplorer.model.NetworkApi
import com.onedudedesign.dogexplorer.model.entities.Breed
import com.onedudedesign.dogexplorer.util.xApiKey
import kotlinx.coroutines.*

class MainViewModel (val networkApi: NetworkApi,
val coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.IO)) : ViewModel() {
    //set a live data for the list of breeds
    val breeds = MutableLiveData<List<Breed>>()

    //function to retrieve the breeds and set the live data from the api(in a coroutine)
    fun getBreeds() {
        coroutineScope.launch {
            val breedsRetrieved = networkApi.getBreeds(xApiKey).await()
            breeds.value = breedsRetrieved
        }
    }

    //clear coroutines when viewmodel destroyed
    override fun onCleared() {
        super.onCleared()
        coroutineScope.coroutineContext.cancel()
    }
}