package com.ahmedabdelmohsen.nasaapp.destinations;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ahmedabdelmohsen.nasaapp.R;
import com.ahmedabdelmohsen.nasaapp.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You have choosed yes", Toast.LENGTH_LONG).show();

            }
        });
        binding.no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You have choosed no", Toast.LENGTH_LONG).show();

            }
        });
    }
}