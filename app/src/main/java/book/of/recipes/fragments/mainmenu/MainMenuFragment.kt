package book.of.recipes.fragments.mainmenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import book.of.recipes.ApplicationConfigure
import book.of.recipes.R
import book.of.recipes.fragments.mainmenu.recyclerview.MainRecyclerAdapter
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main_menu.*
import javax.inject.Inject

class MainMenuFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: MainMenuFactory
    private lateinit var viewModel: MainMenuViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ApplicationConfigure.appComponent.inject(this)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainMenuViewModel::class.java)
        configRecyclerView()
    }

    private fun configRecyclerView() {
        recyclerView?.layoutManager = GridLayoutManager(this.context, 2)
        val recyclerListAdapter = MainRecyclerAdapter(viewModel.recyclerList.value!!)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.adapter = recyclerListAdapter
    }
}