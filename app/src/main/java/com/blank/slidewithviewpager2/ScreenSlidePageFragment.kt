package com.blank.slidewithviewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class ScreenSlidePageFragment : Fragment() {
    var param1 = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_slide_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<FrameLayout>(R.id.bg)
            .setBackgroundColor(ContextCompat.getColor(requireContext(), param1))
    }

    companion object {
        fun newInstance(colorId: Int) = ScreenSlidePageFragment().also {
            it.param1 = colorId
        }
    }
}