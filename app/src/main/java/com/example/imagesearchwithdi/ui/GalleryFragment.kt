package com.example.imagesearchwithdi.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imagesearchwithdi.R
import com.example.imagesearchwithdi.databinding.ActivityGalleryFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GalleryFragment : Fragment() {

    lateinit var galleryBinding: ActivityGalleryFragmentBinding
    private val viewModel by viewModels<GalleryViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        galleryBinding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_gallery_fragment, container, false)
        galleryBinding.lifecycleOwner = this

        val adapter = UnsplashPhotoAdapter()

        galleryBinding.apply {
            recyclerView.setHasFixedSize(true)
            recyclerView.layoutManager = LinearLayoutManager(activity)
            recyclerView.adapter = adapter

        }

        viewModel.photos.observe(viewLifecycleOwner){
            adapter.submitData(viewLifecycleOwner.lifecycle, it)
        }

        return galleryBinding.root
    }
}