package kg.tutorialapp.lesson_39

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment1: Fragment(R.layout.fragment_1) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "OnAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "OnCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "OnCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "OnViewCreated()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "OnDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "OnDetach()")
    }

    companion object{
        const val TAG = "Fragment 1"
    }


}