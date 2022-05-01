package com.example.imagesearchwithdi.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.imagesearchwithdi.R
import com.example.imagesearchwithdi.databinding.ActivityGalleryFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GalleryFragment : Fragment() {
    lateinit var galleryBinding: ActivityGalleryFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        galleryBinding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_gallery_fragment, container, false)
        return galleryBinding.root
    }
}