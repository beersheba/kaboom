package me.rankov.kaboom.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import me.rankov.kaboom.R
import me.rankov.kaboom.country.list.CountriesListActivity

class LoginCountryFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.country_next_button)
        button?.setOnClickListener {
            var intent = Intent(context, CountriesListActivity::class.java)
            startActivity(intent)
        }
    }
}
