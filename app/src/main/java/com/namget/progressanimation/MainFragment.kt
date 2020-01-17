package com.namget.progressanimation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Created by Namget on 2020.01.17.
 */
class MainFragment : Fragment() {

    companion object {
        lateinit var drunkFragment: MainFragment

        fun newInstance(): MainFragment {
            synchronized(MainFragment::class) {
                drunkFragment = MainFragment()
                val args = Bundle()
                drunkFragment.arguments = args
                return drunkFragment
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initRecyclerView()
        requestTodayDrunkList()
    }

    private fun initRecyclerView() {

    }

    private fun requestTodayDrunkList() {

    }



}