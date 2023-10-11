package com.example.staffui.ui.fragments.staff.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment(private val layoutID: Int):Fragment(layoutID) {
    private lateinit var layoutView : View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        layoutView = inflater.inflate(layoutID,container,false)
        return layoutView
    }
}