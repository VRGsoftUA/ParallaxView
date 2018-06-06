package net.vrgsoft.parallaxview

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView.HORIZONTAL
import android.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContent.apply {
            layoutManager = LinearLayoutManager(context, HORIZONTAL, false)
            adapter = TestAdapter(prepareBackTestData(), prepareFrontTestData())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.next) showNextFragment()
        return true
    }

    private fun showNextFragment(){
        supportFragmentManager
                .beginTransaction()
                .add(R.id.container, NextFragment())
                .addToBackStack(null)
                .commit()
    }
}

fun prepareBackTestData(): List<Int> {
    val data = ArrayList<Int>()
    data.add(R.drawable.fast_furious_back)
    data.add(R.drawable.star_wars_back)
    data.add(R.drawable.game_of_thrones_back)
    data.add(R.drawable.sherlok_back)
    data.add(R.drawable.mult_back)
    return data
}

fun prepareFrontTestData(): List<Int> {
    val data = ArrayList<Int>()
    data.add(R.drawable.fast_furious_front)
    data.add(R.drawable.star_wars_front)
    data.add(R.drawable.game_of_thrones_front)
    data.add(R.drawable.sherlok_front)
    data.add(R.drawable.mult_front)
    return data
}

class NextFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_scroll, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
    }
}