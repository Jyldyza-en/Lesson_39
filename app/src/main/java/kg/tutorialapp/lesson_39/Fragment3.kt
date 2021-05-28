package kg.tutorialapp.lesson_39

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment3: Fragment(R.layout.fragment_3) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG_3, "OnAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG_3, "OnCreate()")
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG_3, "OnCreateView()")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG_3, "OnViewCreated()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG_3, "OnStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG_3, "OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG_3, "OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG_3, "OnStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG_3, "OnDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG_3, "OnDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG_3, "OnDetach()")
    }

    companion object{
        const val TAG_3 = "Fragment 3"
    }

}