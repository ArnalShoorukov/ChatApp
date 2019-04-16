package com.android.qooveechats.Adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.android.qooveechats.Fragments.ChatFragment
import com.android.qooveechats.Fragments.ListChatFragment

class PageAdapter (val mContext: Context, fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 ->{
                ListChatFragment.newInstance()
            }

            else -> ChatFragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Contacts"
            1 -> "Chat"

            else -> "Contacts"
        }
    }
}