package com.namget.progressanimation

import androidx.fragment.app.Fragment
import java.util.*

/**
 * Created by Namget on 2019.11.23.
 */
class MainViewPagerAdapter(
    fm: androidx.fragment.app.FragmentManager,
    private val fragmentList: ArrayList<Fragment>
) : androidx.fragment.app.FragmentStatePagerAdapter(
    fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getItem(position: Int): Fragment = fragmentList[position]
    override fun getCount(): Int = fragmentList.size
}