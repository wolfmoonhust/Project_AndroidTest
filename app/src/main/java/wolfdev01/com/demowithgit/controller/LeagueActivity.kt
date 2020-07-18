package wolfdev01.com.demowithgit.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import wolfdev01.com.demowithgit.R
import wolfdev01.com.demowithgit.models.Player
import wolfdev01.com.demowithgit.utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun  onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }



    fun leagueNextClicked(view: View) {

        if (player.league != "") {
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivityIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }

    }

    fun onMensClicked(view: View) {
        setStateClicked(false)
        mensLeagueaBtn.isChecked = true
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        setStateClicked(false)
        womensLeagueBtn.isChecked = true
        player.league = "womens"
    }

    fun onCoEdClicked(view: View) {
        setStateClicked(false)
        coedLeagueBtn.isChecked = true
        player.league = "co-ed"
    }

    fun setStateClicked(state: Boolean) {
        mensLeagueaBtn.isChecked = state
        womensLeagueBtn.isChecked = state
        coedLeagueBtn.isChecked = state
    }
}