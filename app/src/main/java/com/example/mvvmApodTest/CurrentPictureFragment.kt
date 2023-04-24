package com.example.mvvmApodTest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.mvvmApodTest.databinding.FragmentCurrentBinding
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel


class CurrentPictureFragment : Fragment() {

    private var _binding: FragmentCurrentBinding? = null
    private val binding get() = _binding!!
    private val currentPictureFragmentViewModel: CurrentPictureFragmentViewModel by viewModel()
    private val mainViewModel: MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCurrentBinding.inflate(inflater, container, false)
        val view = binding.root

        observeViewState()
        // Inflate the layout for this fragment
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun observeViewState() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                currentPictureFragmentViewModel.viewState.collect {
                    render(it)
                }
            }
        }

        mainViewModel.pictureOfDayModel.observe(viewLifecycleOwner, Observer {
            currentPictureFragmentViewModel.setCurrentPictureOfDay(it)
        })
    }

    private fun render(viewState: PictureOfDayModel) {

        if (viewState.media_type == "video") {
            Picasso.get()
                .load(R.drawable.playbtn)
                .placeholder(R.drawable.ic_baseline_access_time_24)
                .error(R.drawable.ic_baseline_adb_24)
                .into(binding.currentPictureImageView)
        } else if (viewState.media_type == "image") {
            Picasso.get()
                .load(viewState.url)
                .placeholder(R.drawable.ic_baseline_access_time_24)
                .error(R.drawable.ic_baseline_adb_24)
                .into(binding.currentPictureImageView)
        }

        binding.dateTextView.text=viewState.date
        binding.descriptionTextView.text=viewState.explanation
    }
}