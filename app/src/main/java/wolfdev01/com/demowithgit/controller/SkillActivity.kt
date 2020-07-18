package wolfdev01.com.demowithgit.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import wolfdev01.com.demowithgit.R
import wolfdev01.com.demowithgit.models.Player
import wolfdev01.com.demowithgit.utilities.EXTRA_PLAYER


class SkillActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println()
    }

    fun onFinishSkillClicked(view: View) {
        if (player.skil != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_LONG).show()
        }

    }

    fun onBeginnerSkillClicked(view: View) {
        beginnerSkillBtn.isChecked = true
        ballerSkillBtn.isChecked = false
        player.skil = "beginner"
    }

    fun onBallerSkillClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        ballerSkillBtn.isChecked = true
        player.skil = "baller"
    }
}