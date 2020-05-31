package com.ahmedabdelmohsen.nasaapp.destinations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahmedabdelmohsen.nasaapp.R;
import com.ahmedabdelmohsen.nasaapp.databinding.FragmentLocationBinding;

public class LocationFragment extends Fragment {
    private FragmentLocationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLocationBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }
}