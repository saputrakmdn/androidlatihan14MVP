package latihan.android.com.androidlatihan14mvp.AllResult

import latihan.android.com.androidlatihan14mvp.Interfaces.Presenter

class PresenterResult : Presenter<ViewResult> {

    var mViewResult: ViewResult? = null

    override fun onAttach(views: ViewResult) {
        mViewResult = views
    }

    override fun onDetach() {
        mViewResult = null
    }
    fun  showResult(text : String){
        mViewResult?.onShowResult(text)
    }
}