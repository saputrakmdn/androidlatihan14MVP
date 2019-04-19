package latihan.android.com.androidlatihan14mvp.Main

import latihan.android.com.androidlatihan14mvp.Interfaces.Presenter
import latihan.android.com.androidlatihan14mvp.Model.Data

class MainPresenter: Presenter<MainView> {
    private var mView : MainView? = null

    override fun onAttach(views: MainView) {
       mView = views
    }

    override fun onDetach() {
        mView = null

    }
    fun showFragment(){
        val data = Data()
        data.text = "Hello From Data!!!!!"
        mView?.onShowFragment(data)
    }
}