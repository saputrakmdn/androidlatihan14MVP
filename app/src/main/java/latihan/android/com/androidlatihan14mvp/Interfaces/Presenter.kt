package latihan.android.com.androidlatihan14mvp.Interfaces

interface Presenter<T: Views> {
    fun onAttach(views: T)
    fun onDetach()
}