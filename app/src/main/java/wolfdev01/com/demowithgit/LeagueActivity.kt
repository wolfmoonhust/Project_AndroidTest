package wolfdev01.com.demowithgit

import android.content.Intent
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        val skilActivityItent = Intent(this, SkillActivity::class.java)
        startActivity(skilActivityItent)
    }
}