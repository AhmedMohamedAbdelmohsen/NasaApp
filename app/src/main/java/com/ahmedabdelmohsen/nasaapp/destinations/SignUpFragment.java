package com.ahmedabdelmohsen.nasaapp.destinations;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ahmedabdelmohsen.nasaapp.R;
import com.ahmedabdelmohsen.nasaapp.databinding.FragmentSignUpBinding;


public class SignUpFragment extends Fragment {

    private FragmentSignUpBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);
        binding.btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "SignUp Success", Toast.LENGTH_LONG).show();
                navController.navigate(R.id.action_signUpFragment_to_homeFragment);
            }
        });
    }
}