package kg.tutorialapp.lesson_39

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(INFO_TAG, "Activity OnCreate()")

        setup()

    }



    private fun setup() {
        val fragment1 = findViewById<Button>(R.id.button)
        fragment1.setOnClickListener {
            addFragment(Fragment1())
        }

        val fragment2 = findViewById<Button>(R.id.button2)
        fragment2.setOnClickListener {
            addFragment(Fragment2())
        }

        val fragment3 = findViewById<Button>(R.id.button3)
        fragment3.setOnClickListener {
            addFragment(Fragment3())
        }
    }

    private fun addFragment(fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.i(INFO_TAG, "Activity OnStart()")

    }

    override fun onResume() {
        super.onResume()
        Log.i(INFO_TAG, "Activity OnResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.i(INFO_TAG, "Activity OnPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.i(INFO_TAG, "Activity OnStop()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(INFO_TAG, "Activity OnDestroy()")

    }

    companion object{
        const val INFO_TAG = "Activity"
    }
}