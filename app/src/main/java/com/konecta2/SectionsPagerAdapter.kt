package com.konecta2

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.konecta2.fragments.EventoFragment
import com.konecta2.fragments.MiPerfilFragment
import com.konecta2.fragments.SondeoFragment

private val TAB_TITLES = arrayOf(
        R.string.tab_2,
        R.string.tab_3,
        R.string.tab_4
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        // Show size of total pages.
        return TAB_TITLES.size
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> EventoFragment()
            1 -> MiPerfilFragment()
            2 -> SondeoFragment()
            else -> {
                return EventosListDetail()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

}