package com.rajendra.cvbuilderapp.fragment.work

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.rajendra.cvbuilderapp.R
import com.rajendra.cvbuilderapp.fragment.work.adapter.WorkAdapter
import com.rajendra.cvbuilderapp.model.data.UserData

class WorkFragment : Fragment(R.layout.fragment_work) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val workRecyclerView: RecyclerView = view.findViewById(R.id.work_recycler_view)
        val adapter = WorkAdapter(UserData.getWorkList())
        workRecyclerView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = WorkFragment()
    }
}