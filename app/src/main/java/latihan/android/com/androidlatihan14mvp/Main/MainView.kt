package latihan.android.com.androidlatihan14mvp.Main

import latihan.android.com.androidlatihan14mvp.Interfaces.Views
import latihan.android.com.androidlatihan14mvp.Model.Data

interface MainView: Views {
    fun onShowFragment(data: Data)
}