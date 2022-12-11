package com.rajendra.cvbuilderapp.fragment.aboutme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.rajendra.cvbuilderapp.fragment.aboutme.adapter.EducationAdapter
import com.rajendra.cvbuilderapp.R
import com.rajendra.cvbuilderapp.fragment.aboutme.adapter.CertificationAdapter
import com.rajendra.cvbuilderapp.model.data.UserData

class AboutMeFragment : Fragment(R.layout.fragment_about_me) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initEducation(view)
        initCertification(view)
    }

    private fun initEducation(view: View) {
        val educationRecyclerView = view.findViewById<RecyclerView>(R.id.education_recycler_view)
        val adapter = EducationAdapter(UserData.getEducationList())
        educationRecyclerView.adapter = adapter
    }

    private fun initCertification(view: View) {
        val certificationRecycler =
            view.findViewById<RecyclerView>(R.id.certification_recycler_view)
        val adapter = CertificationAdapter(UserData.getCertificateList())
        certificationRecycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = AboutMeFragment()
    }
}