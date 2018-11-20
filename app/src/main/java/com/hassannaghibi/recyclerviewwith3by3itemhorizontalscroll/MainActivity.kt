package com.hassannaghibi.recyclerviewwith3by3itemhorizontalscroll

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View
import android.widget.ImageView
import com.hassannaghibi.recyclerviewwith3by3itemhorizontalscroll.adapter.PageAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: PageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        val left = findViewById<ImageView>(R.id.left_arrow)
        val right = findViewById<ImageView>(R.id.right_arrow)

        left.setOnClickListener {
            val currPos = viewPager.currentItem
            viewPager.currentItem = currPos - 1
        }

        right.setOnClickListener {
            val currPos = viewPager.currentItem
            viewPager.currentItem = currPos + 1
        }

        var size = addAnimals().size / 3
        if ((addAnimals().size % 3) > 0)
            size += 1

        pagerAdapter = PageAdapter(supportFragmentManager, size, addAnimals())
        viewPager.adapter = pagerAdapter

    }

    private fun addAnimals(): ArrayList<String> {
        val animals = arrayListOf<String>()
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        return animals
    }
}
