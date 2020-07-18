package wolfdev01.com.demowithgit.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import wolfdev01.com.demowithgit.R
import wolfdev01.com.demowithgit.utilities.EXTRA_LEAGUE
import wolfdev01.com.demowithgit.utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeagueText.text = "Looking for $league $skill league near your ..."
    }
}