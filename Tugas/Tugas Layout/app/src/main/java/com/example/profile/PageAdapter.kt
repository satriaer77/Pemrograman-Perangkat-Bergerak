package com.example.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

        // Daftar Fragment pages
        private val pages = listOf(
            Bio(),
            About()
        )

        // menentukan fragment yang akan dibuka pada posisi tertentu
        override fun getItem(position: Int): Fragment {
            return pages[position]
        }

        override fun getCount(): Int {
            return pages.size
        }

    }