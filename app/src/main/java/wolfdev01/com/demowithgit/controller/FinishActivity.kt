package wolfdev01.com.demowithgit.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import wolfdev01.com.demowithgit.R
import wolfdev01.com.demowithgit.models.Player
import wolfdev01.com.demowithgit.utilities.EXTRA_PLAYER


class FinishActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueText.text = "Looking for ${player.league} ${player.skil} league near your ..."
    }
}