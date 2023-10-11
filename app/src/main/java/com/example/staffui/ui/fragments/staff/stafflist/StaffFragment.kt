package com.example.staffui.ui.fragments.staff.stafflist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.staffui.R
import com.example.staffui.databinding.FragmentStaffBinding
import com.example.staffui.domain.models.FilterModel
import com.example.staffui.domain.models.StaffListModel
import com.example.staffui.ui.fragments.staff.base.BaseFragment

class StaffFragment : BaseFragment(R.layout.fragment_staff) {

    lateinit var binding:FragmentStaffBinding

    //Adapters
    private lateinit var staffAdapter: StaffAdapter
    private lateinit var categoryAdapter: FilterAdapter

    //Lists
    private val list = ArrayList<StaffListModel>()
    private val categoryList = ArrayList<FilterModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStaffBinding.inflate(inflater, container, false)
        return binding.root.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUi()
        setOnClickListeners()
    }

    private fun setUi(){
        binding.filterRv.also {
            categoryList.clear()
            categoryList.add(FilterModel(category = "All"))
            categoryList.add(FilterModel(category = "Staff with access"))
            categoryList.add(FilterModel(category = "Staff with attendance"))
            categoryAdapter = FilterAdapter(categoryList,binding.root.context)
            it.adapter = categoryAdapter
        }
        binding.staffRv.also {
            list.clear()
            list.add(
                StaffListModel(
                    staffName = "Raju",
                    email = "raju@gmail.com",
                    workingSince = 2
                )
            )
            list.add(
                StaffListModel(
                    staffName = "Pawan",
                    email = "Pawan@gmail.com",
                    workingSince = 5
                )
            )
            staffAdapter = StaffAdapter(list)
            it.adapter = staffAdapter
        }
    }

    private fun setOnClickListeners(){
        binding.also {
            it.addStaff.setOnClickListener {
                findNavController().navigate(R.id.action_staffFragment_to_addStaffFragment)
            }
        }
    }
}