package kg.tutorialapp.lesson_39

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2: Fragment(R.layout.fragment_2) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG_2, "OnAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG_2, "OnCreate()")
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG_2, "OnCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG_2, "OnViewCreated()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG_2, "OnStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG_2, "OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG_2, "OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG_2, "OnStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG_2, "OnDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG_2, "OnDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG_2, "OnDetach()")
    }

    companion object{
        const val TAG_2 = "Fragment 2"
    }

}