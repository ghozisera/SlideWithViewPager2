package com.blank.slidewithviewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ScreenSlidePagerAdapter(supportFragmentManager, lifecycle)
        findViewById<ViewPager2>(R.id.viewpager2).adapter = adapter
    }

    private inner class ScreenSlidePagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) :
        FragmentStateAdapter(fm, lifecycle) {
        private val NUM_PAGES = 4
        override fun getItemCount(): Int = NUM_PAGES
        override fun createFragment(position: Int): Fragment = ScreenSlidePageFragment()
    }
}