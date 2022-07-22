package com.juzhen.secuirtydemo2

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.juzhen.secuirtydemo2.databinding.FragmentFirstBinding
import com.juzhen.secuirtydemo2.sender.CallUnsafeReceiver01

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        var handler = Handler()
        var callInBg: Runnable = object: Runnable {
            override fun run() {
                CallUnsafeReceiver01.call(context)
                handler.postDelayed(this, 10 * 1000);
            }
        }
        handler.post(callInBg);
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}