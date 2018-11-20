package com.hassannaghibi.recyclerviewwith3by3itemhorizontalscroll.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.hassannaghibi.recyclerviewwith3by3itemhorizontalscroll.fragment.ItemFragment

class PageAdapter(fragmentManager: FragmentManager, private val size: Int, private val items: ArrayList<String>) :
    FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        val firstItem = ((position + 1) * 3) - 2
        val lastItem = ((position + 1) * 3)
        val itemSet = arrayListOf<String>()
        for (i in firstItem..lastItem) {
            if (i <= items.size)
                itemSet.add(items[i - 1])
        }
        return ItemFragment.newInstance(itemSet)
    }

    override fun getCount(): Int {
        return size
    }
}