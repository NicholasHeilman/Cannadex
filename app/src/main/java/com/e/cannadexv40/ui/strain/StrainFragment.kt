package com.e.cannadexv40.ui.strain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import com.e.cannadexv40.databinding.FragmentStrainBinding
import com.example.cannadex.utils.RecyclerViewLoadMoreScroll


class StrainFragment : Fragment() {
    private val vm by viewModels<StrainViewModel>()
    private lateinit var binding: FragmentStrainBinding
    private lateinit var strainLayoutManager: LinearLayoutManager
    private lateinit var scrollListener: RecyclerViewLoadMoreScroll
    private val strainAdapter by lazy {
        StrainAdapter(){ strain ->

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): = FragmentStrainBinding.inflate(
        LayoutInflater.from(context),
        container,
        false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        TODO() add observeStrain

        binding.rvStrain.apply {
            setHasFixedSize(true)
            strainLayoutManager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL, false)
            adapter = this@StrainFragment.strainAdapter
            RecyclerViewLoadMoreScroll(strainLayoutManager)
                .also { listener ->
                    addOnScrollListener(listener)
                    scrollListener = listener
                }.apply { setOnLoadMoreListener(this@StrainFragment) }
        }
    }

    private fun observeStrain(){
        vm.st
    }



}