package com.example.fragmentjava;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    private Activity activity;
    private Communication communication;
    private EditText editText;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        Button button = view.findViewById(R.id.button);
        editText = view.findViewById(R.id.editText);

        Log.d("Fragment1", "onCreateView");

        // add listener to button
        button.setOnClickListener((View v) -> {
            communication.send(editText.getText().toString());
            }
        );

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment1", "onCreate");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment1", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment1", "onResume");
    }

    /**
     * Quand user quitte le fragment, c'est là que on commit tous les changements
     * qui doivent persister
     */
    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment1", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment1", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment1", "onDestroy");
    }

    /**
     * Le fragment est détruit après l'appel à cette méthode
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment1", "onDestroyView");

    }

    /**
     * L'instance du fragment est associé avec une instance de l'activité
     * mais le fragment et l'activité ne sont pas complètement initialisés
     *
     * @param context
     */
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // Recommend assign to an attribute Activity to facilitate the dev
        activity = (Activity) context;
        if (activity instanceof Communication) {
            communication = (Communication) activity;
        }
        Log.d("Fragment1", "onAttach : le Fragment est attaché à l'activité");
    }

    interface Communication {
        public void send(String nom);
    }
}