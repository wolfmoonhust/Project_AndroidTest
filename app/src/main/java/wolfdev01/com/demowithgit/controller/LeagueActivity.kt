package wolfdev01.com.demowithgit.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import wolfdev01.com.demowithgit.utilities.EXTRA_LEAGUE
import wolfdev01.com.demowithgit.R

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {

        if (selectedLeague != "") {
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivityIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }

    }

    fun onMensClicked(view: View) {
        setStateClicked(false)
        mensLeagueaBtn.isChecked = true
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        setStateClicked(false)
        womensLeagueBtn.isChecked = true
        selectedLeague = "womens"
    }

    fun onCoEdClicked(view: View) {
        setStateClicked(false)
        coedLeagueBtn.isChecked = true
        selectedLeague = "co-ed"
    }

    fun setStateClicked(state: Boolean) {
        mensLeagueaBtn.isChecked = state
        womensLeagueBtn.isChecked = state
        coedLeagueBtn.isChecked = state
    }
}