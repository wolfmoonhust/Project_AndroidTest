package wolfdev01.com.demowithgit.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import wolfdev01.com.demowithgit.R
import wolfdev01.com.demowithgit.utilities.EXTRA_LEAGUE
import wolfdev01.com.demowithgit.utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onFinishSkillClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_LONG).show()
        }

    }

    fun onBeginnerSkillClicked(view: View) {
        beginnerSkillBtn.isChecked = true
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerSkillClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        ballerSkillBtn.isChecked = true
        skill = "baller"
    }
}