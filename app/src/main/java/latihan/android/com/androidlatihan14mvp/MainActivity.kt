package latihan.android.com.androidlatihan14mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import latihan.android.com.androidlatihan14mvp.AllResult.FragmentResult
import latihan.android.com.androidlatihan14mvp.Main.MainPresenter
import latihan.android.com.androidlatihan14mvp.Main.MainView
import latihan.android.com.androidlatihan14mvp.Model.Data

class MainActivity : AppCompatActivity(), MainView {

    lateinit var presenter: MainPresenter

    override fun onShowFragment(data: Data) {
        val bundle = Bundle()
        bundle.putString("data", data.text)

        val tag : String = FragmentResult::class.java.simpleName
        val fragment : Fragment = FragmentResult.newInstance()
        fragment.arguments = bundle

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_main, fragment, tag)
        fragmentTransaction.commit()

    }

    override fun onAttachView() {
        presenter.onAttach(this)
        btn_main.setOnClickListener {
            btn_main.visibility = View.GONE
            presenter.showFragment()
        }

    }

    override fun onDetachView() {
        presenter.onDetach()
    }

    override fun onDestroy() {
        onDetachView()
        super.onDestroy()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter()
        onAttachView()
    }
}
