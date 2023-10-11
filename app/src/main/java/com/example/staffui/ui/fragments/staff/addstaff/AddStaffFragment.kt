package com.example.staffui.ui.fragments.staff.addstaff

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import com.example.staffui.R
import com.example.staffui.databinding.FragmentAddStaffBinding
import com.example.staffui.ui.fragments.staff.base.BaseFragment
import android.text.TextWatcher as TextWatcher1

class AddStaffFragment : BaseFragment(R.layout.fragment_add_staff) {
    lateinit var binding:FragmentAddStaffBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddStaffBinding.inflate(inflater , container , false)
        return binding.root.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        setUI()
    }

    private fun setUI() {

    }

}