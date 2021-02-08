package book.of.recipes

import androidx.fragment.app.Fragment

fun Fragment.openFragmentScreen(fragment: Fragment) {
    fragment.fragmentManager
        ?.beginTransaction()
        ?.add(fragment, "")
        ?.commit()
}